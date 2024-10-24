package com.example;

import com.demo.Vehicle;

public class Car extends Vehicle {

    String modelName = "Nano";

    public static void main(String[] args) {
        Car car = new Car();
        car.soundHorn();

        System.out.println(car.brand);

        System.out.println(car.brand + " " + car.modelName);
    }
}
