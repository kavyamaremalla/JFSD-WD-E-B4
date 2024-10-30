package com.demo;

public class CheckAgeException {

    public static void checkAge(int age) throws ArithmeticException, NullPointerException {
        if (age < 18){
            throw new ArithmeticException("Access denied - you should be greater than 18 years");
        }else{
            System.out.println("Access granted - you are old enough! ");
        }
    }

    public static void main(String[] args) {
        checkAge(15);
    }
}
