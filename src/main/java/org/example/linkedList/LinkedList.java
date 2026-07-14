package org.example.linkedList;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class LinkedList {
    Node head;
    Node tail;
    int length;

    public static class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public LinkedList(int value) {
        Node newNode = new Node(value);
        this.head = newNode;
        this.tail = newNode;
        this.length = 1;
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            this.tail.next = newNode;
            this.tail = newNode;
        }
        this.length++;
    }

    public Node removeLast() {
        if (length == 0) {
            return null;
        } else if (length == 1) {
            Node temp = head;
            head = tail = null;
            length = 0;
            return temp;
        } else {
            Node temp = this.head;
            Node pre = this.head;

            while (temp.next != null) {
                pre = temp;
                temp = temp.next;
            }
            tail = pre;
            tail.next = null;
            this.length--;
            return temp;
        }
    }

    public void prepend(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = tail = newNode;
        } else {
            newNode.next = this.head;
            this.head = newNode;
        }
        this.length++;
    }

    public Node removeFirst() {
        Node temp = null;
        if (length == 0) {
            return temp;
        } else if (length == 1) {
            temp = head;
            head = tail = null;
        } else {
            temp = head;
            head = head.next;
            temp.next = null;
        }
        this.length--;
        return temp;
    }

    public Node get(int index) {
        if (index < 0 || index >= length) {
            return null;
        }
        Node temp = this.head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public boolean set(int index, int value) {
        Node temp = this.get(index);
        if (temp != null) {
            temp.value = value;
            return true;
        } else {
            return false;
        }
    }

    public boolean insert(int index, int value) {
        if (index < 0 || index > length) {
            return false;
        }

        if (index == 0) {
            prepend(value);
            return true;
        }

        if (index == length) {
            append(value);
            return true;
        }

        Node newNode = new Node(value);
        Node temp = this.get(index - 1);
        newNode.next = temp.next;
        temp.next = newNode;
        this.length++;
        return true;
    }

    public Node remove(int index) {
        if (index < 0 || index >= length) {
            return null;
        }
        if (index == 0) {
            return removeFirst();
        }
        if (index == length - 1) {
            return removeLast();
        }

        Node prev = this.get(index - 1);
        Node temp = prev.next;
        prev.next = temp.next;
        this.length--;
        return temp;
    }

    public void reverse() {
        /// reversing the head and tail
        Node temp = this.head;
        this.head = this.tail;
        this.tail = temp;

        ///
        Node after = temp.next;
        Node before = null;

        for (int i = 0; i < length; i++) {
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;
        }

    }

    public void removeDuplicate() {
        Node current = head;
        while (current != null) {
            Node runner = current;
            while (runner.next != null) {
                if (current.value == runner.next.value) {
                    runner.next = runner.next.next;
                    length--;
                } else {
                    runner = runner.next;
                }
            }
            current = current.next;
        }
    }

    public void removeDuplicateUsingSet() {
        Set<Integer> values = new HashSet<>();
        Node prev = null;
        Node current = head;

        while(current != null){
            if (values.contains(current.value)){
                prev.next = current.next;
                length--;
            }else {
                values.add(current.value);
                prev = current;
            }

            current = current.next;
        }
    }

    public int binaryToDecimal(){
        int decimalValue = 0;

        Node temp = head;

        while(temp != null){
            decimalValue = (decimalValue * 2) + temp.value;
            temp = temp.next;
        }
        return decimalValue;
    }

    public void partitionList(int x){
        Node dum1 = new Node(0);
        Node dum2 = new Node(0);

        Node prev1 = dum1;
        Node prev2 = dum2;

        Node current = head;

        while(current != null){

            if (current.value >= x){
                prev2.next = current;
                prev2 = prev2.next;
            }else{
                prev1.next = current;
                prev1 = prev1.next;
            }

            current = current.next;
        }

        prev2.next = null;
        prev1.next = dum2.next;
        head = dum1.next;
    }

    public void reverseBetween(int x , int y){
        if(head == null) return;
     Node dummy = new Node(0);
     dummy.next = head;

     Node prev = dummy.next;

     for (int i = 0; i < x; i++){
         prev = prev.next;
     }

     Node current = prev.next;


     for (int i = 0; i < (y - x); i++){
         Node temp = current.next;
         current.next = temp.next;
         temp.next = prev.next;
         prev.next = temp;
     }

     head = dummy.next;
    }

    public void swapPairs(){
     if (head == null) return;

     Node dummy = new Node(0);
     dummy.next = head;

     Node prev = dummy;

     while (prev.next != null && prev.next.next != null){
         Node first = prev.next;
         Node second = prev.next.next;

         Node temp = second.next;

         prev.next = second;
         second.next = first;
         first.next = temp;

         prev = first;
     }

     head = dummy.next;
    }

    public boolean hasCycle(Node head){
        if (head == null || head.next == null) return false;
        Node slow = head;
        Node fast = head;

        while (fast != null){
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast){
                return true;
            }
        }
        return false;
    }

    public void printList() {
        if (length == 0) {
            System.out.println("No nodes to show");
        }
        Node temp = this.head;

        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getHead() {
        Optional<Node> headNode = Optional.ofNullable(head);
        if (headNode.isEmpty()) {
            System.out.println("Head: LinkedList is empty");
        } else {
            System.out.println("Head: " + headNode.get().value);
        }
    }

    public void getTail() {
        Optional<Node> tailNode = Optional.ofNullable(this.tail);
        if (tailNode.isEmpty()) {
            System.out.println("Tail: LinkedList is empty");
        } else {
            System.out.println("Tail: " + tailNode.get().value);
        }
    }

    public void getLength() {
        System.out.println("Length: " + this.length);
    }

}
