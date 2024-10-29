package com.demo;

public final class FinalExample {

    private  final double constantValuePi = 3.14;

    public final void displayValue(){
//        constantValuePi = 9.789;
        System.out.println("Pi value is " + constantValuePi);
    }

    public static void main(String[] args) {
        FinalExample example =  new FinalExample();
        example.displayValue();
    }
}
