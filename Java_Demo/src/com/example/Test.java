package com.example;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Test {

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        Scanner scn= new Scanner(System.in);
        int n=scn.nextInt();

        Integer[] a = new Integer[n];


        for (int i = 0; i < a.length; i++) {
            a[i] = scn.nextInt();
        }
        Boolean flag=true;
        for(int i=0;i<a.length;i++)
        {
            if(!set.contains(a[i]))
            {
                set.add(a[i]);
            }
            else
            {
                System.out.println(a[i]);
                flag=false;
                break;
            }
        }
        if(flag)
        {
            System.out.println(-1);
        }
    }
}
