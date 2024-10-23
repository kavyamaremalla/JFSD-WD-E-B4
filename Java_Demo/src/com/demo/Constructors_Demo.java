package com.demo;

public class Constructors_Demo {
    int number; //Class attribute

    //creating a constructor for your class
    public Constructors_Demo(){ //No Argument
        number = 5; //setting initial value for class attribute number
    }

    public Constructors_Demo(int y){
        number = y;
    }

    public static void main(String[] args) {
        Constructors_Demo  demo = new Constructors_Demo(10);
        System.out.println(demo.number);

        Constructors_Demo demo1 = new Constructors_Demo();
        System.out.println(demo1.number);

    }

}
