package org.example.doublyLinkedList;

public class DoublyLinkedList {
    Node head;
    Node tail;
    int length;

    public static class Node {
        int value;
        Node next;
        Node prev;

        Node(int value) {
            this.value = value;
        }
    }

    DoublyLinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public DoublyLinkedList() {
    }

    public void append(int value) {
        Node newNode = new Node(value);

        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = tail.next;
        }
        length++;
    }

    public Node removeLast() {
        if (length == 0) return null;
        Node temp = tail;
        if (length == 1){
            head = null;
            tail = null;
        }else {
            tail = temp.prev;
            tail.next = null;
            temp.prev = null;
        }
        length--;
        return temp;
    }

    public void prepend(int value){
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        }else{
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        length++;
    }

    public Node removeFirst(){
        if (length == 0) return null;
        Node temp = head;
        if (length == 1){
            head = null;
            tail = null;
        }else{
            head = temp.next;
            temp.next = null;
            head.prev = null;
        }
        length--;
        return temp;
    }

    public Node getNode(int index){
        if (index < 0 || index >= length) return null;

        Node temp = head;
        if (index <= length / 2){
            for (int i = 0; i < index; i++){
                temp = temp.next;
            }
        }else{
            temp = tail;
            for (int i = length - 1; i > index; i--){
                temp = temp.prev;
            }
        }

        return temp;
    }

    public boolean setNode(int index, int  value){
        Node getNode = getNode(index);

        if (getNode != null){
            getNode.value = value;
            return true;
        }

        return false;
    }

    public boolean insert(int index, int value){

        if (index < 0 || index > length) return false;
        Node newNode = new Node(value);

        if (index == 0) {
            prepend(value);
            return true;
        }

        if (index == length){
            append(value);
            return true;
        }

        Node before = getNode(index - 1);
        Node after = before.next;

        newNode.prev = before;
        newNode.next = after;
        before.next = newNode;
        after.prev = newNode;
        length++;
        return true;
    }

    public Node remove(int index){
        if (index < 0 || index >= length) return null;

        if (index == 0){
            return removeFirst();
        }

        if (index == length - 1){
            return removeLast();
        }

        Node temp = getNode(index);
        temp.next.prev = temp.prev;
        temp.prev.next = temp.next;

        temp.next = null;
        temp.prev = null;
        length--;
        return temp;
    }

    public boolean isPalindrome(){
        if (length == 0 || length == 1) return true;

        Node temp = head;
        Node tempRev = tail;

        for(int i = 0 ; i < length / 2; i++){
            temp = temp.next;
            tempRev = tempRev.prev;

            if (temp.value != tempRev.value){
                return false;
            }
        }

        return true;
    }

    public void reverse(){
        Node current = head;
        Node temp = null;

        while(current != null){
            current.prev = current.next;
            current.next = temp;
            temp = current;
            current = current.prev;
        }

        Node swap = head;
        head = tail;
        tail = swap;
    }

    public void partitionList(int x){
        Node dummy1 = new Node(0);
        Node dummy2 = new Node(0);
        Node temp1 = dummy1;
        Node temp2 = dummy2;
        Node current = head;

        while(current != null){
            if (current.value < x){
                temp1.next = current;
                current.prev = temp1;
                temp1 = temp1.next;
            }else {
                temp2.next = current;
                current.prev = temp2;
                temp2 = temp2.next;
            }
            current = current.next;
        }

        if (dummy2.next == null){
            temp1.next = null;
        }else{
            temp1.next = dummy2.next;
            dummy2.next.prev = temp1;
            temp2.next = null;
        }

        head = dummy1.next;
        head.prev = null;
    }

    public void reverseBetween(int start, int end){
        if (head == null || start == end) return;

        Node dummy = new Node(0);
        dummy.next = head;
        head.prev = dummy;

        Node prev = dummy;

        for (int i = 0 ; i < start; i++){
            prev = prev.next;
        }

        Node current = prev.next;

        for (int i = start; i < end; i++){
            Node temp = current.next;
            current.next = temp.next;

            if (temp.next != null){
                temp.next.prev = current;
            }

            temp.next = prev.next;
            prev.next.prev = temp;

            prev.next = temp;
            temp.prev = prev;
        }

        head = dummy.next;
        head.prev = null;

    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getTail() {
        System.out.println("Tail: " + tail.value);
    }

    public void getLength() {
        System.out.println("Length: " + length);
    }

    public void getHead() {
        System.out.println("Head: " + head.value);
    }
}
