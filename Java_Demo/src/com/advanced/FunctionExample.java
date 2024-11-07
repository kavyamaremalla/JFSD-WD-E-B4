package com.advanced;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionExample {

    public static void main(String[] args) {
        Function<String, Integer> function = (s) ->  s.length();
        System.out.println(function.apply("ABCDEFGHIJKLMNOPQRSTUVWXYZ"));


        List<Integer> list = Arrays.asList(1,2,3,4,5,6);
//
        list.stream().map(number -> number * number)
                .filter(n -> n % 2 ==0)
                .forEach(System.out::println);

        BiFunction<Integer, Integer, Integer> multiply = (i, i1) -> i * i1;
        System.out.println(multiply.apply(3,9));
    }
}
