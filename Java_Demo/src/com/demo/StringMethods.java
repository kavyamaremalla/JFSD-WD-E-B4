package com.demo;

import java.util.Arrays;

public class StringMethods {

    public static void main(String[] args) {
        String str = "Hello World! ";

        System.out.println(str.length());
        System.out.println(str.charAt(4));
        System.out.println(str.indexOf("o"));
        System.out.println(str + " welcome to the session");
        System.out.println(str.concat(" Welcome to the session!"));
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.equals("hello world!"));
        System.out.println(str.equalsIgnoreCase("hello world!"));
        System.out.println(str.repeat(4));
        System.out.println(str.trim());
        System.out.println(str.replace("l", "e"));
        System.out.println(str.substring(5, 8));
        String[] arr = str.split(" ");
        System.out.println(arr[1]);
        System.out.println(Arrays.toString(str.split(" ")));

        char a = 'a';

        int ascii = a;

        System.out.println((int) a);

    }
}
