package com.advanced;

import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<Double> supplier = () ->  Math.random();
        System.out.println(supplier.get());

        Supplier<String> greetSupplier = () -> "Hello, Welcome to Session!";
        System.out.println(greetSupplier.get());

    }
}
