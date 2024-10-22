package com.demo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx_Example {
    public static void main(String[] args) {

        String pattern = "[a-z]+";
        String text = "abc123";

        Pattern p = Pattern.compile(pattern);

        Matcher m = p.matcher(text);

        while (m.find()){
            System.out.println("Match found " + m.group());
        }

        int number = 16;
        System.out.println(Math.sqrt(16));
        System.out.println(Math.log(2));
        System.out.println(Math.ceil(7.456));
        System.out.println(Math.floor(7.456));
        System.out.println(Math.random() + 5);
        System.out.println(Math.abs(-10));
        System.out.println(Math.max(4,7));
        System.out.println(Math.min(1,2));
        System.out.println(Math.round(3.16789));
    }
}
