package org.example.stack;

public class Main {

    public static void main(String[] args) {
        Stack newStack = new Stack(9);
        newStack.getTop();
        newStack.getHeight();
        newStack.printStack();
        newStack.push(8);
        newStack.getTop();
        newStack.printStack();
        Stack.Node extracted =  newStack.pop();
        System.out.println("Extracted Node: " + extracted.value);
        newStack.printStack();
    }
}
