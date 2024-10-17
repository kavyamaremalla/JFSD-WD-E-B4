package com.demo;

public class Loops {
    public static void main(String[] args) {

        for (int i = 10; i > 0; i--) { //loop
            System.out.println(" Value of i is " + i);
            for (int j = 1; j <= 10; j++) { // nested-loop
                System.out.println(j + " j value " );
            }
        }
    }
}
