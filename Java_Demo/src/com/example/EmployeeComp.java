package com.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeComp {

     private String name;

     private int age;

    public EmployeeComp(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "EmployeeComp{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class AgeComparator implements Comparator<EmployeeComp>{

    @Override
    public int compare(EmployeeComp e1, EmployeeComp e2) {
//        return Integer.compare(e1.getAge(), e2.getAge());//natural ordering
        return Integer.compare(e2.getAge(), e1.getAge());//reverse ordering

    }

  /*  @Override //Comparing with names
    public int compare(EmployeeComp e1, EmployeeComp e2) {
//        return e1.getName().compareTo(e2.getName()); //natural ascending order
        return e2.getName().compareTo(e1.getName()); //reverse order
    }*/

    public static void main(String[] args) {
        List<EmployeeComp> employeeList = new ArrayList<>();
        employeeList.add(new EmployeeComp("John", 25));
        employeeList.add(new EmployeeComp("Abhi", 29));
        employeeList.add(new EmployeeComp("Peter", 35));
        employeeList.add(new EmployeeComp("Alice", 21));


        employeeList.sort(new AgeComparator());

        System.out.println(employeeList);
    }
}


