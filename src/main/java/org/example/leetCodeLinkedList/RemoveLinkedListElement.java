package org.example.leetCodeLinkedList;

public class RemoveLinkedListElement {

    public static void main(String[] args) {
//        1263456
        Node head = new Node(1);
//        head.next = new Node(2);
//        head.next.next = new Node(6);
//        head.next.next.next = new Node(3);
//        head.next.next.next.next = new Node(4);
//        head.next.next.next.next.next = new Node(5);
//        head.next.next.next.next.next.next = new Node(6);

        Node res = solution(head, 1);
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

    public static Node solution(Node head, int val){
        if (head ==  null ) return null;
        if (head.next == null && head.val == val) return null;

        Node dummy = new Node(0);
        dummy.next = head;
        Node prev = dummy;
        Node current = prev.next;

        while(current != null){
            if (current.val == val){
                prev.next = current.next;
            }else{
                prev = current;
            }
            current = current.next;
        }
        return  dummy.next;
    }
}
