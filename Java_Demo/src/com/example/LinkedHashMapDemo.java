package com.example;

import java.util.LinkedHashMap;
import java.util.TreeMap;

public class LinkedHashMapDemo {

    public static void main(String[] args) {

        LinkedHashMap<Integer, String> hashMap = new LinkedHashMap<>();
        hashMap.put(1,"John");
        hashMap.put(1,"John");
        hashMap.put(3,"Peter");
        hashMap.put(2, "Zack");
        hashMap.put(2, "Jill");// since key 2 is already present, updating value of that key 2
        hashMap.put(null, "John");
        hashMap.put(null, null);

        System.out.println(hashMap);

        TreeMap<Integer, String> treeMap = new TreeMap<>();

        treeMap.put(1,"John");
        treeMap.put(1,"John");
        treeMap.put(3,"Peter");
        treeMap.put(2, "Zack");
        treeMap.put(2, null);// since key 2 is already present, updating value of that key 2
//        treeMap.put(null, "John");
//        treeMap.put(null, "Jill");

        System.out.println(treeMap);
    }
}
