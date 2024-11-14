package com.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeComparable implements Comparable<EmployeeComparable>{

     private String name;

     private int age;

    public EmployeeComparable(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "EmployeeComp{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(EmployeeComparable o) {
        System.out.println(this.name.compareTo(o.name));
        return this.name.compareTo(o.name);
    }

    public static void main(String[] args) {
        List<EmployeeComparable> employeeList = new ArrayList<>();
        employeeList.add(new EmployeeComparable("John", 25));
        employeeList.add(new EmployeeComparable("Abhi", 29));
        employeeList.add(new EmployeeComparable("Peter", 35));
        employeeList.add(new EmployeeComparable("Abhi", 25));


        Collections.sort(employeeList);

        System.out.println(employeeList);
    }
}




