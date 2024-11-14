package com.example;

import java.util.Arrays;
import java.util.List;

public class FlatList {

    public static void main(String[] args) {

        List<List<Integer>> nestedList = Arrays.asList(Arrays.asList(1, 2, 3),
                Arrays.asList(3, 4, 5),
                Arrays.asList(5, 6, 7),
                Arrays.asList(7, 8, 9));

        System.out.println(nestedList);

//        nestedList.stream().flatMap(x -> x.stream()).forEach(System.out::println);

        List<Double> noDuplicateList = nestedList.stream()
                .flatMap(x->x.stream())
                .distinct()
                .map(x->Math.sqrt(x))
                .toList();

        System.out.println(noDuplicateList);
    }
}
