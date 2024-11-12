package com.demo;

public class GenericExample<T> {

    private T value;

    public GenericExample(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public static void main(String[] args) {
        GenericExample<String> strEx = new GenericExample<>("Hello Generics");
        System.out.println(strEx.getValue());

        GenericExample<Integer> intEx = new GenericExample<>(45);
        System.out.println(intEx.getValue());
    }
}


