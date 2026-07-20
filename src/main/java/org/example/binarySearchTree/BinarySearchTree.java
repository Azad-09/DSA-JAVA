package org.example.binarySearchTree;

public class BinarySearchTree {
    Node groot;

    public static class Node {
        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
        }
    }

    public boolean insert(int value) {
        Node newNode = new Node(value);
        if (groot == null) {
            groot = newNode;
            return true;
        }

        Node temp = groot;

        while (true) {

            /// return false if the value is same
            if (value == temp.value) return false;

            if (newNode.value < temp.value) {
                if (temp.left == null) {
                    temp.left = newNode;
                    return true;
                }
                temp = temp.left;
            } else {
                if (temp.right == null) {
                    temp.right = newNode;
                    return true;
                }
                temp = temp.right;
            }
        }

    }

    public boolean contains(int value){
        /// redundant line
//        if (groot == null) return false;

        Node temp = groot;

        while(temp != null){
            if (value < temp.value){
                temp = temp.left;
            }else if (value > temp.value){
                temp = temp.right;
            }else{
                return true;
            }
        }
        return false;
    }

}
