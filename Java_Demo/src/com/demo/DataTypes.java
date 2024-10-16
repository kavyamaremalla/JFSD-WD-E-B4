package com.demo;

import java.io.Serializable;
import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.Arrays;

public class DataTypes{

    int y = 2; //Global variable

    int a;

    public static void main(String[] args) {

        int x = 1; //local variable or instance variable
        Integer x1 = 11;

        byte by = -128;
        Boolean value = null;
        
        short sh = 32767;

        long l = 128L;
        
        float f = 5.89f;
        
        double d = 6.783D;
        
        char ch = 'A';
        
        boolean bool = false;

     /*   System.out.println(x);
        System.out.println(by);
        System.out.println(sh);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(ch);
        System.out.println(bool);*/

        String name = "John123@gmail.com";

//        ArrayList<Integer> numbers = new ArrayList<Integer>();

        int myInt = 8 ;

        double myDoubleValue = myInt; //Automatic casting .. Widening

        System.out.println(myInt);
        System.out.println(myDoubleValue);

        Double db1 = 9.67d;
        Integer intVal = Integer.valueOf(db1.intValue());

        double db = 8.90d;
        int intValue = (int) db;// manual cast.. Narrowing

        System.out.println(db1);
        System.out.println(intVal);
    }

    public void add(){
        int x = 8;

         y = 15;

         a = 61;
    }
}
