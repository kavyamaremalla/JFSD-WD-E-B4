package com.demo;

public class Scooty implements VehicleInterface{

    @Override
    public void startEngine() {
        System.out.println("Scooty Started");
    }

    @Override
    public void stopEngine() {
        System.out.println("Scooty stopped");
    }
}

class Tractor implements VehicleInterface, MechanicInterface{
    @Override
    public void startEngine() {
        System.out.println("Tractor Started");
    }

    @Override
    public void stopEngine() {
        System.out.println("Tractor stopped");
    }
}

class TestInterface{
    public static void main(String[] args) {
        VehicleInterface scooty = new Scooty();

        VehicleInterface tractor = new Tractor();

        scooty.startEngine();
        scooty.stopEngine();

        tractor.startEngine();
        tractor.stopEngine();
    }

}