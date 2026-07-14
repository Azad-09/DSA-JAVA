package org.example.timeComplexityCheck;

public class LinearSearchDemo {
    public static void main(String[] args) {
        int [] arr = {2,4,5,6,7,8,9,10,12,14,16,18,20,22,34,45,56,67,78,89,90,95,100,105,109,120,130};
        int target = 130;

        int index = linearSearch(arr, target);
        System.out.println("Element found in " + index + " index");

    }

    public static int linearSearch(int[] arr, int target){
        long start = System.currentTimeMillis();
        System.out.println(start);
        int res = -1;

        for (int i = 0; i < arr.length; i++){
            if (arr[i] == target){
                res = i;
                break;
            }
        }

        long end = System.currentTimeMillis();
        System.out.println(end);
        System.out.println("Takes time to complete: " + ( System.currentTimeMillis() - start));
        return res;
    }
}
