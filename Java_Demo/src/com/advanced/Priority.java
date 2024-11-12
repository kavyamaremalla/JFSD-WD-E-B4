package com.advanced;

public enum Priority {

    LOW,

    MEDIUM,

    HIGH,

    CRITICAL;

    //declare variables and methods if required

    int id = 9;

}

class TestEnum {
    public static void main(String[] args) {
        Priority priority = Priority.LOW;
        System.out.println(priority);
    }

}
