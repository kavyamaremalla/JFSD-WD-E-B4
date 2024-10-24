package com.demo;

/* Compile-Time Polymorphism Example */
public class Calculator {

    public int add(int a, int b, int c){
        return  a + b + c;
    }

    public int add(int a, int b){
        return a + b ;
    }

    public void display(int x, int y){
        System.out.println(x + y + " Value");
    }

    public void display(String x, int y){
        System.out.println(x + " " + y + " " + " Value");
    }

   public void print(int x, double y){
        System.out.println("Printing integer : " + x);
    }

    public void print(double a, int b){
        System.out.println("Printing double : " + b);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("Sum of 2 parameters" + calculator.add(10,20));
        System.out.println("Sum of 3 parameters" + calculator.add(10,20, 30));
        calculator.display(1,2);
        calculator.display("Hi",2);
//        calculator.print(5,6); //Ambiguity
        calculator.print(5, 7.0);
    }
}
