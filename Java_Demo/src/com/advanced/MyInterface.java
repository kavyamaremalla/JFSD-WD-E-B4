package com.advanced;

@FunctionalInterface
public interface MyInterface {

    void start(); //abstract

    //default method with implementation
    default void honk(){
        System.out.println("Honking!");
    }

    //static method with implementation
    static int add(int a, int b){
        return a + b;
    }
}

class ChildClass implements MyInterface{

    public static void main(String[] args) {

        ChildClass childClass = new ChildClass();
        childClass.start();
        childClass.honk();


        int result = MyInterface.add(1,2);
        System.out.println("Addition Result " + result);
    }

    @Override
    public void start() {
        System.out.println("From Child Class");
    }

}