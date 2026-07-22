package org.example.hashTable;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        HashTable table = new HashTable();


        table.set("nails", 1000);
        table.set("tile", 50);
        table.set("lumber", 80);
        table.set("screws", 140);

        table.printTable();

        int value = table.get("raju");
        System.out.println(value);
        ArrayList<String> keys = table.keys();
        for (int i = 0; i < keys.size(); i++){
            System.out.println(keys.get(i));
        }
    }
}
