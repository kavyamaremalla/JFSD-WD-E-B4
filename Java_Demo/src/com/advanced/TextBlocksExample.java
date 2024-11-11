package com.advanced;

public class TextBlocksExample {

    public static void main(String[] args) {
        String welcome = "Hello, World!  " +
                "         \n      Welcome to the class!";

        String welcomeBlock = """
                Hello, World!,
                             Welcome to the class!
                """;

        System.out.println(welcome);
        System.out.println(welcomeBlock);
    }
}
