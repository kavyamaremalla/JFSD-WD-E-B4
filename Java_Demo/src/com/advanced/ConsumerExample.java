package com.advanced;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerExample {

    public static void main(String[] args) {
        Consumer<String> consumer = (s) -> System.out.println(s);
//        consumer.accept("Alice");

        List<String> names = Arrays.asList("Alice", "Bob", "John");
        names.forEach(consumer);

        BiConsumer<String, Integer> printDetails = (name, age) ->
                System.out.println(name + "is " + age + " years old");

        printDetails.accept("John", 30);
    }
}
