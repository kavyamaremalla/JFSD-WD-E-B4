package com.demo;

public class HelloWorld {

    int x = 5; //non-static
    static String welcome = "Welcome to the session!"; // static

    /* comment
    * something */

//    comment


    public static void main(String[] args){ // static

//        System.out.println(1/0);

        System.out.println("Hello, from main method");

        HelloWorld helloWorld = new HelloWorld(); // default constructor from Object.java

        HelloWorld helloWorld1 = new HelloWorld(); //second object


        System.out.println(helloWorld.x); // calling non-static variable from static method

        System.out.println(welcome); //calling static variable from static method

//        System.out.println(1/0); // run-time error


        int result = sub(10, 1); //calling sub

        System.out.println(helloWorld.add(1,2)); //calling the method
        
        System.out.println(result);

    }

    //Method declaration
    public int add(int a, int b){ //non-static method
//        int a = 10;
        return a + b;
    }

    public static int sub(int a, int b){ //static method
        return a - b;
    }
}
