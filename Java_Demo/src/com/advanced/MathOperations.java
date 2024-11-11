package com.advanced;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public interface MathOperations {
    private int add(int a ,int b){
        return a + b;
    }

    default int sumAndDouble(int a , int b){
        return add(a,b) * 2;
    }
}

class TestMathOps implements MathOperations{

    static int sum = 7;

//    static var value = 9;

//    var addValue = 18;

    public static void main(String[] args) {
        TestMathOps ops = new TestMathOps();
        System.out.println(ops.sumAndDouble(1,2));

        int number = 10;
        String name = null;

//        var variable = null;

        var num = 16;
        var nameOfPerson = "Peter";

        System.out.println(num + " Person is " + nameOfPerson);

//        System.out.println(nameOfPerson instanceof String);


        List<Integer> numberList = Arrays.asList(1,2,4);

        var result = numberList.stream()
                        .filter(x -> x >5 )
                        .collect(Collectors.toList());
    }

//    private var add(var a ,var b){
//        return a + b;
//    }

}