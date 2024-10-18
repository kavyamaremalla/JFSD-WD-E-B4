package com.demo;

public class JumpStatements {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            if(i == 5){
                break;
            }
            System.out.println(i);
        }


        for (int i = 0; i < 10; i++) {
            if(i % 2 == 0){
                continue;
            }
            System.out.println(i);
            //some other logic
        }

        int result = add(1,2);
        System.out.println(result);

    }

    public static int add(int a, int b){
        int i = a * b;
        return a + b;

    }
}
