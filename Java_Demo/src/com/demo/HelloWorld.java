package com.demo;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

public class HelloWorld {

    String brand = "Audi"; //non-static
    static String welcome = "Welcome to the session!"; // static

    /* comment
    * something */

//    comment


    public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException { // static

        DataTypes dataTypes  = new DataTypes();//creating an object -> by calling this constructor
        dataTypes.y = 18;

        //One more way to create class object
        Class<?> myClass = DataTypes.class;
        DataTypes dataTypes1 = (DataTypes) myClass.newInstance();
        dataTypes1.add();

        //Other way to create class object
//        DataTypes dataTypes2 = (DataTypes) dataTypes.clone();

        //Other way to create class object
        Constructor<HelloWorld> constructor = HelloWorld.class.getConstructor();
        HelloWorld world = constructor.newInstance();

        //Serialization & Deserialization..



        System.out.println(dataTypes instanceof DataTypes);

//        Constructors_Demo  demo = new Constructors_Demo();


//        System.out.println(1/0);

        System.out.println("Hello, from main method");

        HelloWorld helloWorld = new HelloWorld(); // default constructor from Object.java

        HelloWorld helloWorld1 = new HelloWorld(); //second object

        helloWorld1.add(7,8);

//        System.out.println(helloWorld.x); // calling non-static variable from static method

        System.out.println(welcome); //calling static variable from static method

//        System.out.println(1/0); // run-time error


        int result = sub(10, 1); //calling sub

        System.out.println(helloWorld.add(1,2)); //calling the method

        System.out.println(result);

    }

    //Method declaration
    private int add(int a, int b){ //non-static method
//        int a = 10;
        return a + b;
    }

    public static int sub(int a, int b){ //static method
        return a - b;
    }
}
