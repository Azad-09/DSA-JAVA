package org.example.leetCodeLinkedList;

public class LinkedListIntersection {

    public static void main(String[] args) {

        Node commonTail = new Node(8);
        commonTail.next = new Node(4);
        commonTail.next.next = new Node(5);

        Node headA = new Node(4);
        headA.next = new Node(1);
        headA.next.next = commonTail;

        Node headB = new Node(5);
        headB.next = new Node(6);
        headB.next.next = new Node(1);
        headB.next.next.next = commonTail;

        Node res = solution(headA, headB);
        System.out.println(res.val);
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

    public static Node solution(Node headA, Node headB) {
        if (headA == null || headB == null) {
            return null;
        }

        Node pointA = headA;
        Node pointB = headB;

        ///  4,1,8,4,5   ----    5,6,1,8,4,5
        while (pointA != pointB) {

            if (pointA == null) {
                pointA = headB;
            } else {
                pointA = pointA.next;
            }

            if (pointB == null) {
                pointB = headA;
            } else {
                pointB = pointB.next;
            }
        }
        return pointA;
    }
}
