package org.example.leetCodeLinkedList;

public class ReorderList {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

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

    public static Node solution(Node head){
        if (head == null) return null;

        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        Node prev = null;
        Node current = slow.next;
        slow.next = null;

        while (current != null){
            Node temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;
        }

        Node first = head;
        Node second = prev;

        while(second != null){

            Node temp1 = first.next;  //2
            Node temp2 = second.next; //5

            first.next = second;
            second.next = temp1;

            first = temp1;
            second = temp2;
        }

        return head;
    }





}
