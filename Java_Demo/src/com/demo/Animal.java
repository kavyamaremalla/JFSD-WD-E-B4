package com.demo;

public class Animal {

    String name = "Animal";

    String type;

    public Animal(String type){
        this.type = type;
        System.out.println("Animal Constructor is called");
    }

    String eat(){
        System.out.println("Inside Method Eat");
        return  "Method Eating";
    }
}
