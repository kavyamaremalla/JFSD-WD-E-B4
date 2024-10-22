package com.demo;

public class StringBuilder_Buffer {

    public static void main(String[] args) {
        StringBuffer buffer = new StringBuffer("Hello");
        buffer.append(" ");
        buffer.append("World");


        StringBuilder builder = new StringBuilder("Welcome");
        builder.append(" ");
        builder.append("John");

//        System.out.println(buffer.reverse());
//        System.out.println(builder.reverse());

        String str = "Hello";
        String str1 = "Hello";

        String str2 = new String("Hello");

        System.out.println(str1 == str); // checks reference/memory/address
        System.out.println(str1.equals(str)); //checks only value

        System.out.println(str == str2);
        System.out.println(str.equals(str2));

    }
}
