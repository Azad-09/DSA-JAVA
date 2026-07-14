package org.example.leetCodeLinkedList;

public class ReverseBetween {

    public static void main(String[] args) {

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

//    public static Node solution(Node head, int left, int right){
//        if (head == null) return null;
//
//        Node dummy = new Node(0);
//        dummy.next = head;
//        Node prev = dummy;
//
//       for (int i = 0; i < left; i++){
//           prev = prev.next;  //2
//       }
//
//       for (int i = 0; i < (right - left); i++){
//
//       }
//    }
}
