package org.example.leetCodeLinkedList;

public class PartitionList {

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(4);
        head.next.next = new Node(3);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(2);

        Node res = solution(head, 3);
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

    public static Node solution(Node head, int x){
        if (head == null || head.next == null) return head;

        Node dummy1 = new Node(0);
        Node dummy2 = new Node(0);

        Node prev1 = dummy1;
        Node prev2 = dummy2;

        while(head != null){
            if (head.val < x){
                prev1.next = head;
                prev1 = prev1.next;
            }else {
                prev2.next = head;
                prev2 = prev2.next;
            }
            head = head.next;
        }

        prev1.next = dummy2.next;
        prev2.next = null;

        return dummy1.next;
    }
}
