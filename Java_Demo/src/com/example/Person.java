package com.example;

public class Person {

    String name="Ashin";
    int age=18;

    Person(String name, int age){
        this.name=name;
        this.age=age;
    }

    public Person() {

    }

    public void Details(){
        System.out.println("Name :"+ name);
        System.out.println("Age :"+ age);
    }


}
class Employee extends Person{
    int salary;
    int employeeID;
    Employee(String name,int age){
        super(name,age);
    }

    public Employee() {

    }

    public static void main(String[] args) {
        Employee emp=new Employee();

        System.out.println("name : "+emp.name + " " +" Age : "+emp.age);
    }
}