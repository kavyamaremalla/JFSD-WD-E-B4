package com.demo;

public class ErrorExample {
    public static void main(String[] args) {
        recursiveDemo(10);
    }

    public static void recursiveDemo(int i){
        while (i != 0){
            i = i + 1;
            recursiveDemo(i);
        }
    }
}
