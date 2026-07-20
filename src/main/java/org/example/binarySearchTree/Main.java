package org.example.binarySearchTree;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree searchTree = new BinarySearchTree();
        System.out.println("Root = " + searchTree.groot);
        boolean value = searchTree.insert(47);
        searchTree.insert(55);
        searchTree.insert(30);
        searchTree.insert(31);
        System.out.println(value);
        System.out.println(searchTree.groot.right.value);
        System.out.println(searchTree.groot.left.value);
        System.out.println(searchTree.groot.left.right.value);
        System.out.println(searchTree.contains(31));

    }
}
