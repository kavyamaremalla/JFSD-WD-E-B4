package com.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo {

    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6};
        int[] arr1 = new int[4];


        //array operations

        // add some elements here in the array

        List<Integer> list = new ArrayList<>();

        ArrayList<Integer> arrayList = new ArrayList<>();

        list.add(2);
        list.add(2);
        list.add(41);
        list.add(7);
//        list.add(null);
//        list.add(null);

//        list.remove(2);

        Collections.sort(list); //ascending order

        System.out.println(list);
//
//        System.out.println(list.get(2));//7
//
//        System.out.println(list.contains(4));//false
//        System.out.println(list.contains(7));//true
//
//        list.set(2, 9);
//
//        System.out.println(list.contains(7));//false
//
//        System.out.println(list);// 2,2,9
//
//        arrayList.add(3);
//
//        System.out.println(arrayList);

    }
}
