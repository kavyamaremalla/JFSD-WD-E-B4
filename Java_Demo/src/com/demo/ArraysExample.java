package com.demo;

import java.util.Arrays;
import java.util.Collections;

public class ArraysExample {
    public static void main(String[] args) {

        //1-D
        int[] numbers = {1,2,3,4,5};
        int numb[] = {3,5,6};

        numbers = Arrays.copyOf(numbers, numbers.length + 1);
        numbers[5] = 61;

        System.out.println(Arrays.toString(numbers));

        //2-D
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        //Multi Dimensional Array
        int[][][] multiArray = new int[2][3][4];

//        System.out.println(numbers.length);

        int[] num = new int[6];
        num[0] = 70;
        num[1] = 40;
        num[2] = 20;
        num[3] = 10;
        num[4] = 50;
        num[5] = 60;
//        num[6] = 70; //ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 6

        num[5] = 500;
//
//        for (int j : num) {
//            System.out.println("Element in array is " + j);
//        }

//        Arrays.sort(num);

        for (int i = 0; i < num.length - 1; i++) {
            for (int j = 0; j < num.length - i - 1; j++) {
                if (num[j] > num[j + 1]) {
                    int temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                }
            }
        }

//        Arrays.sort(num, Collections.reverseOrder()); // this works for Wrapper Classes

        System.out.println(Arrays.toString(num));

        int searchKey = 500;// which element search for
        int index = -1;
        for (int i = 0; i < num.length; i++) {
            if(num[i] == searchKey){
                index = i;
                break;
            }
        }

        if(index == -1){
            System.out.println("Element " + searchKey + " not found in array");
        }else{
            System.out.println("Element " + searchKey + " found in array at index : " + index);

        }
//        //delete an element
//        int deleteIndex = 2;
//        for (int i = deleteIndex; i < num.length - 1; i++) {
//            num[i] = num[i+1];
//        }
//
//        System.out.println(Arrays.toString(num));



    }
}
