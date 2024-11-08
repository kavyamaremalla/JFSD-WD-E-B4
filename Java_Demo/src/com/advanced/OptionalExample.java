package com.advanced;

import java.util.Optional;

public class OptionalExample {

    public static void main(String[] args) {
        Product product = new Product();

//        System.out.println(product.getId());
//        System.out.println(product.getName().length());

        Optional<String> name = Optional.ofNullable(product.getName());

//        System.out.println(name.orElse("John"));
//        System.out.println(product.getName());

        String[] str = new String[10];
//        str[5] = "JAVA OPTIONAL";
//          System.out.println(str[5].toLowerCase());

        Optional<String> checkNull = Optional.ofNullable(str[5]);

        if (checkNull.isPresent()){
            System.out.println(str[5].toLowerCase());
        }else{
            System.out.println("String value is not present");
        }




    }
}
