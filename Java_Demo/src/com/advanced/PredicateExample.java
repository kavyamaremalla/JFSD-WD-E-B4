package com.advanced;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateExample {

    public static void main(String[] args) {

        Predicate<Integer> isEven = number -> number % 2 == 0;
//        System.out.println(isEven.test(49));

        List<Integer> numberList = Arrays.asList(1,2,3,4,5,6);

        List<Integer> evenNumbers = numberList.stream()
                                            .filter(number -> number % 2 == 0)
                                            .collect(Collectors.toList());

        List<Integer> oddNumbers = numberList.stream()
                .filter(number -> number % 2 != 0)
                .toList();

//        for (Integer i : numberList){
//            System.out.println(isEven.test(i));
//            if(isEven.test(i)){
//            evenNumbers.add(i);
//            }
//        }

//        System.out.println(evenNumbers);
//        System.out.println(oddNumbers);

        BiPredicate<String, Integer> nameLength = (name, characters) ->
                                             name.length() > characters;

        System.out.println(nameLength.test("John", 4));


    }
}
