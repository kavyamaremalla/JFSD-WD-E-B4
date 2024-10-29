package com.demo;

import java.util.ArrayList;

public class Animal {

    String name = "Animal";

    String type;

//    ArrayList<Student> students = new ArrayList<>();

    public Animal(String type){
        this.type = type;
        System.out.println("Animal Constructor is called");
    }

    String eat(){
        System.out.println("Inside Method Eat");
        return  "Method Eating";
    }
}
