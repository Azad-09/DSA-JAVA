package org.example.leetCodeLinkedList;

public class RemoveDuplicateElement {

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(3);
        head.next.next.next.next = new Node(4);
        head.next.next.next.next.next = new Node(4);
        head.next.next.next.next.next.next = new Node(5);
        head.next.next.next.next.next.next.next = new Node(5);

        Node res = solution(head);

        while(res != null){
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

    public static Node solution(Node head)  {
        if (head == null || head.next == null){
            return head;
        }

        Node dummy = new Node(0);
        dummy.next = head;

        Node prev = dummy;
        Node current = prev.next;

        while(current != null && current.next != null){
            if (current.val != current.next.val){
                prev = current;
            }else {
                int dupValue = current.val;

                while (current.next != null && current.next.val == dupValue){
                    current = current.next;
                }
                prev.next = current.next;
            }
            current = current.next;
        }
        return dummy.next;
    }
}
