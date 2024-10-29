package com.demo;

import java.util.Objects;

public class Student {

    private String name;

    private int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    //getter for name
    public String getName(){
        return name;
    }

    //setter for name
    public void setName(String name){
        this.name = name;
    }

    //setter for age
    public void setMarks(int marks){
        //custom validation
        if (marks > 35){
            this.marks = marks;
        }else{
            System.out.println("Failed!");
        }
    }

    //getter for marks
    public int getMarks(){
        return marks;
    }


//    @Override
//    public String toString(){
//        return "Student{name = ' " + name + " ' , marks = " + marks + "}";
//    }


//    @Override
//    public String toString() {
//        return "Student{" +
//                "name='" + name + '\'' +
//                ", marks=" + marks +
//                '}';
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return marks == student.marks && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, marks);
    }
}

class TestStudentEncap{

    public static void main(String[] args) {
        Student student = new Student("Peter", 67);
//        student.name = "John"; //setter : setting a value of field
//        System.out.println(student.name); //getter : getting a value of field
        Student student1 = new Student("Peter", 67);
        System.out.println(student.hashCode());

        System.out.println(student);
        System.out.println(student1);

//        System.out.println(student.getName());
//        System.out.println(student.getMarks());
//
//        student.setName("John");
//        System.out.println(student.getName());
//
//        student.setMarks(45);
//        System.out.println(student.getMarks());
//
//        student.setMarks(21);
//
//        student.setMarks(89);
//        System.out.println(student.getMarks());

    }
}
