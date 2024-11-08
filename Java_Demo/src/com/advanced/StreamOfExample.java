package com.advanced;

import java.util.stream.Stream;

public class StreamOfExample {

    public static void main(String[] args) {
        Stream<String> stringStream = Stream.of("John", "Ana", "Peter");
//        stringStream.forEach(element -> System.out.println(element));

        Integer[] numbers = {2,1,3,4,5,6};
        Stream<Integer> integerStream = Stream.of(numbers);

        int sum = integerStream.reduce(0, (a,b) -> a +b);
//        System.out.println(sum);

        Stream<Product> productStream = Stream.of(
                new Product(1, "machine", 6789f),
                new Product(2, "machine1", 12344f)
                );

//        productStream.forEach(product -> System.out.println(product.getPrice()));


        Stream<String[]> stream = Stream.of(
                new String[] {"piano", "violin"},
                new String[] {"apple", "kiwi"}
        );


        stream.flatMap(array -> Stream.of(array))
                .forEach(a -> System.out.println(a));

    }
}
