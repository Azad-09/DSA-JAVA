package org.example.leetCodeLinkedList;

public class AddLinkedList {
    public static void main(String[] args) {
        Node l1 = new Node(2);
        l1.next = new Node(4);
        l1.next.next = new Node(3);


        Node l2 = new Node(5);
        l2.next = new Node(6);
        l2.next.next = new Node(4);

        Node newNode = addLinkedList(l1,l2);
        while (newNode != null){
            System.out.println(newNode.val);
            newNode = newNode.next;
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

    public static Node addLinkedList(Node l1, Node l2) {
        Node dummy = new Node(0);
        Node prev = dummy;
        int carry = 0;

        while (l1 != null || l2 != null || carry > 0) {
            int sum = carry;

            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            int value = sum % 10;
            prev.next = new Node(value);
            prev = prev.next;
            carry = sum / 10;
        }
        return dummy.next;
    }

}
