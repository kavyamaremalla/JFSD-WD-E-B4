package com.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class AscendingOrder {

    public static void main(String[] args)
    {
        List<Integer> list=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<10;i++)
        {
            list.add(sc.nextInt());
        }
        Collections.sort(list);
        System.out.println(list.get(0));
    }
}