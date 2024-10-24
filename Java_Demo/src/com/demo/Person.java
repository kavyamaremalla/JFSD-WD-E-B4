package com.demo;

public class Person {

    String firstName ;

    int age;

    public Person() {
        this("Peter", 25);//calling the parameterized constructor
        System.out.println("No Argument Constructor is called");
    }

    public Person(String firstName, int age) {
//        firstName = fName;
        this.firstName = firstName;
        this.age = age;
    }

    void displayParams(){
        this.age++;
        System.out.println("First Name : " + firstName + " Age is " + age);
    }

    public static void main(String[] args) {
        Person person = new Person("John", 32);
        System.out.println(person.firstName);

        Person person1 = new Person();
        person1.displayParams();
    }
    

}
