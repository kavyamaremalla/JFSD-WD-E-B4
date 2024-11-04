package com.example;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class LinkedListDemo {

    public static void main(String[] args) {

        List<Integer> list = new LinkedList<>();
        list.add(7);
        list.add(17);

        LinkedList<Integer> linkedList = new LinkedList<>();

        linkedList.add(5);
        linkedList.add(22);
        linkedList.add(5);
        linkedList.add(38);
        linkedList.add(5);


        linkedList.addAll(list);//5,22,5,38,5,7,17
       //        linkedList.removeFirstOccurrence(5);
        linkedList.removeLastOccurrence(87);

//        linkedList.isEmpty();
//        linkedList.remove(2);

//        linkedList.removeFirst(); //remove first index element
//        linkedList.removeLast();//removes last index element
//        linkedList.removeFirstOccurrence(7);

        System.out.println(linkedList);
    }
}
