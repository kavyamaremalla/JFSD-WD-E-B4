package com.demo;

public class Dog extends Animal{

    String name = "Dog";

    String type = "Human";

    public Dog(String type, String name) {
        super(type);
        this.type = type;
        this.name = name;
        System.out.println("Dog Constructor is called");
    }

    void displayNames(){
        System.out.println("Child Class Name " + name);// refers to child
        System.out.println("Parent Class Name " + super.name );//refers to parent
    }

    void displayType(){
        System.out.println("Type : " + type + " Name : " + name + super.eat());
    }

    public static void main(String[] args) {
        Dog dog =  new Dog("Mammal", "Buddy");
//        dog.displayNames();
        dog.displayType();
    }
}
