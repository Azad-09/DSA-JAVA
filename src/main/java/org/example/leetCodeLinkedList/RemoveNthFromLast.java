package org.example.leetCodeLinkedList;

public class RemoveNthFromLast {

    public static void main(String[] args) {
        // Head parameter banana: [1, 2, 3, 4, 5]
//        Node head1 = new Node(1);
//        head1.next = new Node(2);
//        head1.next.next = new Node(3);
//        head1.next.next.next = new Node(4);
//        head1.next.next.next.next = new Node(5);

        int n1 = 1; // Is parameter ko pass karna hai

        Node head1 = new Node(1);
        head1.next = new Node(2);

        Node res = solution(head1, n1);
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

    public static Node solution(Node head, int n){
        if(head.next == null) return null;

        Node dummy = new Node(0);
        dummy.next = head;
        Node slow = dummy;
        Node fast = dummy;

        for(int i = 0; i < n; i++){
            fast = fast.next;
        }

        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;
        return dummy.next;
    }
}
