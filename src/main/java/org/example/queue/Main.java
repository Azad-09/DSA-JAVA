package org.example.queue;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Queue newQueue = new Queue(3);
        newQueue.getFirst();
        newQueue.getLast();
        newQueue.getLength();
//        newQueue.printQueue();

//        newQueue.enqueue(4);
        newQueue.getFirst();
        newQueue.getLast();
        newQueue.printQueue();
        Queue.Node node = newQueue.dequeue();
        System.out.println("Extracted from first: " + node.value);
        newQueue.getLast();

    }
}
