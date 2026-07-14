package org.example.leetCodeLinkedList;

public class ReverseLinkedList {

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        Node res = solution(head);
        while (res != null){
            System.out.println(res.val);
            res = res.next;
        }
    }

    public static class Node {
        int val;
        Node next;

        Node() {
        }

        Node(int val) {
            this.val = val;
        }

        Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

    public static Node solution(Node head){
        if (head == null || head.next == null) return head;

        Node current = head;
        Node tail = null;
        int length = 0;

        while(current != null){
            length++;
            tail = current;
            current = current.next;
        }

        Node temp = head;
        head = tail;

        Node after = temp.next;
        Node before = null;

        for (int i = 0 ; i < length; i++){
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;
        }

        return head;
    }
}
