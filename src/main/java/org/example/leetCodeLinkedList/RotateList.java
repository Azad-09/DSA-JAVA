package org.example.leetCodeLinkedList;

public class RotateList {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        Node res = solution(head, 2);
        while (res != null) {
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

    public static Node solution(Node head, int k) {
        if (head == null || head.next == null || k == 0){
            return head;
        }
        Node current = head;
        Node tail = null;
        int length = 0;
        Node newTail = head;

        while (current != null) {
            length++;
            tail = current;
            current = current.next;
        }

        if (k % length == 0) return head;

        for (int i = 1; i < length - (k % length); i++) {
            newTail = newTail.next;
        }
        tail.next = head;
        head = newTail.next;
        newTail.next = null;

        return head;
    }
}
