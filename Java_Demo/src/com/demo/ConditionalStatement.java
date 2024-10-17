package com.demo;

import java.util.Scanner;

public class ConditionalStatement {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your age to check eligibility : ");

        int age = scanner.nextInt();
        System.out.println("Please enter location");
        String location = scanner.next();

//        if(age > 18){
//            System.out.println("Please proceed with application, you're eligible ");
//        }else if(age == 17){ // if-else-if ladder
//            System.out.println("Better luck Next time! You will be eligible next term");
//        }else{
//            System.out.println("Not Eligible");
//        }

        if(age > 18 && location.equals("India")){ //nested-if
            System.out.println("You are in India");
            if(location != "USA"){
                System.out.println("You are not in USA");
            }
        }
    }
}
