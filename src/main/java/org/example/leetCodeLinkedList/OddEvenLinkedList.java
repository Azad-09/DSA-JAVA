package org.example.leetCodeLinkedList;

public class OddEvenLinkedList {

    public static void main(String[] args) {
        Node head = new Node(2);
        head.next = new Node(1);
        head.next.next = new Node(3);
        head.next.next.next = new Node(5);
        head.next.next.next.next = new Node(6);
        head.next.next.next.next.next = new Node(4);
        head.next.next.next.next.next.next = new Node(7);

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

//    public static Node solution(Node head){
//        if (head == null) return null;
//
//        Node odd = new Node(0);
//        Node even = new Node(0);
//
//        Node nextOdd = odd;
//        Node nextEven = even;
//        Node current = head;
//        int length = 0;
//        while(current != null){
//            length++;
//            if (length % 2 != 0){
//                nextOdd.next = current;
//                nextOdd = nextOdd.next;
//            }else{
//                nextEven.next = current;
//                nextEven = nextEven.next;
//            }
//            current = current.next;
//        }
//        nextOdd.next = even.next;
//        nextEven.next = null;
//        return odd.next;
//    }

    public static Node solution(Node head){
        if (head == null || head.next == null) return null;

        Node odd = head;
        Node even = odd.next;
        Node evenHead = even;

        while (even != null && even.next != null){
            odd.next = even.next;
            odd = odd.next;

            even.next = odd.next;
            even = even.next;
        }

        odd.next = evenHead;
        return head;

    }
}
