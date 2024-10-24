package com.demo;

/* Polymorphism Example */

public class Shape {
    void draw(){
        System.out.println("Drawing a shape");
    }
}

class Circle extends Shape{

    void draw() {
        System.out.println("Drawing a circle");
    }
}

class Square extends Shape{

    void draw() {
        System.out.println("Drawing a square");
    }
}

class TestShape{
    public static void main(String[] args) {
//        Shape shape;
//        shape = new Shape();
//        shape.draw();
//
//        shape = new Circle();
//        shape.draw();
//
//        shape = new Square();
//        shape.draw();

        Shape shape = new Shape();
        Shape circle = new Circle();
        Shape square = new Square();

        shape.draw();
        circle.draw();
        square.draw();

    }
}
