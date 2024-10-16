package com.demo;

public class WrapperClass {

    public static void main(String[] args) {
        String str = "123";

//        System.out.println(str);
//        System.out.println(str instanceof String);
//
        Integer number = Integer.parseInt(str); // Converts String to Integer
        System.out.println(number);
        System.out.println(number instanceof Integer);

        Integer myInt = null;

//        String myString = myInt.toString();
//        System.out.println(myString);

        String safeString = String.valueOf(myInt);
        System.out.println(safeString);

        Integer.valueOf(myInt);
        myInt.intValue();




    }
}
