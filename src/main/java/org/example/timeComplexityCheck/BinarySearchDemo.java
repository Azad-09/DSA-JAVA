package org.example.timeComplexityCheck;

public class BinarySearchDemo {
    public static void main(String[] args) {
        int [] arr = {2,4,5,6,7,8,9,10,12,14,16,18,20,22,34,45,56,67,78,89,90,95,100,105,109,120,130};
        int target = 100;

        int index = binarySearch(arr, target);
        System.out.println("Target found in " + index + " index");
    }

    public static int binarySearch(int [] arr, int target){
        long start = System.currentTimeMillis();
        int res = -1;

        int left = 0;
        int right = arr.length - 1;

        while(left <= right){
            int mid = left + (right - left) / 2;

            if (arr[mid] == target){
                res = mid;
                break;
            }

            if (arr[mid] < target){
                left = left + 1;
            }

            if (arr[mid] > target){
                right = right - 1;
            }
        }

        long end = System.currentTimeMillis();

        System.out.println("Total time taken: " + (end - start));

        return res;
    }
}
