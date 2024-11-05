package com.example;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<>();

//        HashMap<Integer, Integer> hashMap1 = new HashMap<>();

        hashMap.put(1,"John");
        hashMap.put(1,"John");
        hashMap.put(3,"Peter");
        hashMap.put(2, "Zack");
        hashMap.put(2, "Jill");// since key 2 is already present, updating value of that key 2
        hashMap.put(null, "John");
        hashMap.put(null, "Jill");

        System.out.println(hashMap.get(1)); //John
        System.out.println(hashMap.remove(3)); //Peter
//        hashMap.clear();
        System.out.println(hashMap.size()); //hashMap
        System.out.println(hashMap);

        //print only keys
        System.out.println(hashMap.keySet());

        for (Integer key : hashMap.keySet()){
            System.out.println("For " + key + " value is " + hashMap.get(key));
        }

//        System.out.println(hashMap.values());
//
//        for (String value : hashMap.values()){
//            System.out.println(value);
//        }

        System.out.println(hashMap.entrySet());

        for (Map.Entry<Integer, String> entry : hashMap.entrySet()){
            System.out.println(entry);
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

    }
}
