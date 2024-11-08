package com.advanced;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class MethodReferenceExample {

    public static void main(String[] args) {
        List<String>  nameList = Arrays.asList("John", "Peter");
//        nameList.forEach(name -> System.out.println(name));
        nameList.forEach(System.out::println);

        /* Static Method Reference */
        List<String> messages = Arrays.asList("Hello", "Hi", "Welcome");

//        messages.forEach(msg ->  MethodReferenceExample.printMessage(msg, 1));

        messages.forEach(MethodReferenceExample::printMessage);

        /* Constructor Method Reference */
//        Supplier<StringBuilder> supplier = () -> new StringBuilder();

        Supplier<StringBuilder> supplierReference = StringBuilder::new;//constructor reference

//        Supplier<Product> productSupplier = Product::new;

        StringBuilder builder = supplierReference.get();
        builder.append("Good deeds of method reference");
//        System.out.println(builder);

        /* non-static(instance) Method Reference */
        MethodReferenceExample referenceExample = new MethodReferenceExample();
//        messages.forEach(message -> referenceExample.print(message));
        messages.forEach(referenceExample::print);
    }

    public void print(String message){
        System.out.println(message);
    }
    public static void printMessage(String string) {
        System.out.println(string);
    }

    public static void printMessage(String message, Integer length){
        System.out.println(message + length);
    }
}
