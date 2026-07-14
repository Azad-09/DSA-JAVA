package org.example.timeComplexityCheck;

public class NSquareComplexity {
    public static void main(String[] args) {

        long start = System.currentTimeMillis();

        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                System.out.println(i + " " + j);
            }
        }

        long end = System.currentTimeMillis();
        System.out.println("Time required: " + (end - start));
    }
}

