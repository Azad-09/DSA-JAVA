package org.example.leetCodeLinkedList;

public class SwapNodes {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

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
        Node dummy = new Node(0);
        dummy.next = head;
        Node prev = dummy;

        while(prev.next != null && prev.next.next != null){

            Node first = prev.next;
            Node second = prev.next.next;

            Node temp = second.next;

            prev.next = second;
            second.next = first;
            first.next = temp;

            prev = first;
        }
        return dummy.next;
    }
}
