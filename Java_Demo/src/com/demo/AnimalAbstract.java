package com.demo;

public abstract class AnimalAbstract {

    int x = 8;

    //an abstract method
    abstract void sound();//method definition, no body

    //non-abstract method
    public void eat(){
        System.out.println("Animal is eating");
    }
}

class Tiger extends AnimalAbstract{

    @Override
    void sound() {
        System.out.println("Tiger is shouting");
    }
    @Override
    public void eat(){
        System.out.println("Tiger is eating"); //your own logic
    }
}


class TestAbstractClass {
    public static void main(String[] args) {
        AnimalAbstract tiger = new Tiger();

        System.out.println(tiger);
        tiger.sound();
        tiger.eat();

    }
}
