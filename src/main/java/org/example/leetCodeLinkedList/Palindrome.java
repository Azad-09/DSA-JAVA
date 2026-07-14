package org.example.leetCodeLinkedList;

public class Palindrome {

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(2);
        head.next.next.next = new Node(1);
//        head.next.next.next.next = new Node(1);

        boolean res = solution(head);
        System.out.println(res);

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

    public static boolean solution(Node head){
        if (head == null || head.next == null) return false;

//        Node dummy = new Node(0);
//        dummy.next = head;
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

//        Node newHead = slow;
        Node reversed = reverseLinkedList(slow);

       while(head != slow){
           if (head.val != reversed.val){
               return false;
           }
           head = head.next;
           reversed = reversed.next;
       }

        return true;
    }

    public static Node reverseLinkedList(Node head){
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
