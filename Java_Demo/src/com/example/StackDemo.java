package com.example;

import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class StackDemo {

    public static void main(String[] args) {

        Vector<Integer> stackVector = new Stack<>();
        List<Integer> stackList = new Stack<>();

        Stack<Integer> stack = new Stack<>();


        stack.push(1);
        stack.push(2);
        stack.push(4);

        stack.add(2,3);

        stack.pop();//remove 4

        System.out.println( stack.get(2));//3

        System.out.println(stack.contains(4));

//        System.out.println(stack.remove(1));


        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());

        stack.set(2,8);

        System.out.println(stack);
    }
}
