package org.example.leetCodeLinkedList;

public class MergeSortedLinkedList {
    public static void main(String[] args) {
        Node list1 = new Node(1);
        list1.next = new Node(2);
        list1.next.next = new Node(4);

        Node list2 = new Node(1);
        list2.next = new Node(3);
        list2.next.next = new Node(4);

        Node res = solution(list1, list2);
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

    public static Node solution(Node list1, Node list2){
        if(list1 == null && list2 == null) return null;

        Node dummy = new Node(0);
        Node current = dummy;

        while(list1 != null && list2 != null){
            if(list1.val <= list2.val){
                current.next = list1;
                list1 = list1.next;
            }else{
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }
        if (list1 != null){
            current.next = list1;
        }else {
            current.next = list2;
        }
        return dummy.next;
    }
}
