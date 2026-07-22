package org.example.hashTable;

import java.util.*;

public class InterviewQuestion {
    public static void main(String[] args) {
        int[] arr1 = {1,3,5};
        int[] arr2 = {2,4,5};

        System.out.println(itemsInCommon(arr1, arr2));

        List<Integer> dups = findDuplicates(new int[]{1, 2, 3, 2, 3, 4});
        System.out.println(dups);
        Character c = firstNonRepeatingChar("alphabet");
        System.out.println(c);


    }

    public static boolean itemsInCommon(int[] arr1, int[] arr2){
        Hashtable<Integer, Boolean> table = new Hashtable<>();

        for (int num : arr1){
            table.put(num, true);
        }

        for (int j : arr2) {
            if (table.containsKey(j)) return true;
        }

        return false;
    }

    public static List<Integer> findDuplicates(int[] arr){
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> dups = new ArrayList<>();

        for (int num : arr){
            if (map.containsKey(num)){
                map.put(num, map.get(num) + 1);
            }else {
                map.put(num, 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            if (entry.getValue() != 1){
                dups.add(entry.getKey());
            }
        }


        return dups;
    }

    public static Character firstNonRepeatingChar(String words){

        ///using LinkedHashMap
//        if (words.isEmpty()) return null;
//
//        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
//        List<Character> res = new ArrayList<>();
//
//        char[] chars = words.toCharArray();
//
//        for (char c : chars){
//            if (map.containsKey(c)){
//                map.put(c,map.get(c) + 1);
//            }else{
//                map.put(c, 1);
//            }
//        }
//
//        for (Map.Entry<Character, Integer> entry : map.entrySet()){
//            if (entry.getValue() == 1){
//                res.add(entry.getKey());
//            }
//        }
//
//        return !res.isEmpty() ? res.getFirst() : null;


        /// Traversing the string twice

        Map<Character, Integer> charCounts = new HashMap<>();

        for (int i = 0; i < words.length(); i++) {
            char c = words.charAt(i);
            charCounts.put(c, charCounts.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < words.length(); i++) {
            char c = words.charAt(i);
            if (charCounts.get(c) == 1) {
                return c;
            }
        }

        return null;
    }
}
