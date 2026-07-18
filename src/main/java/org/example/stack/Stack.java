package org.example.stack;

public class Stack {
    Node top;
    int height;


    public static class Node{
        int value;
        Node next;

        Node(int value){
            this.value = value;
        }
    }

    Stack(int value){
        top = new Node(value);
        height = 1;
    }

    /**
     * Push data from the top (LIFO)
     * @param value
     */
    public void push(int value){
        Node newNode = new Node(value);
        if (height == 0){
            top = newNode;
        }else {
            newNode.next = top;
            top = newNode;
        }
        height++;
    }

    /**
     * Pull data from the top
     * @return
     */
    public Node pop(){
        if (top == null) return null;

        Node temp = top;
        top = temp.next;
        temp.next = null;

        height--;
        return temp;
    }

    public void printStack(){
        Node temp = top;
        while (temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getTop(){
        System.out.println("Top: " + this.top.value);
    }

    public void getHeight(){
        System.out.println("Height: " + this.height);
    }
}
