package com.example;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();

        hashSet.add("kiwi");
        hashSet.add("apple");
        hashSet.add("banana");
        hashSet.add("apple");

        System.out.println(hashSet);

        Set<String> treeSet = new TreeSet<>();

        treeSet.add("kiwi");
        treeSet.add("apple");
        treeSet.add("banana");
        treeSet.add("apple");

        System.out.println(treeSet);

        hashSet.add("orange");
        System.out.println(hashSet);

        hashSet.remove("apple");
        System.out.println(hashSet.contains("apple"));


        System.out.println(hashSet);

//        for (String item : treeSet){
//            if (item.equals("orange")){
//
//            }
//        }

        //replace
//        Iterator<String> iterator = treeSet.iterator();
//        while (iterator.hasNext()){
//            String element = iterator.next();
//            if(element.equals("orange")){
//                iterator.set("mango");
//                break;
//            }
//        }

    }
}
