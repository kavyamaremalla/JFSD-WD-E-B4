package com.demo;

public class ForLoops {
    public static void main(String[] args) {

//        for (int i = 10; i > 0; i--) { //loop
//            System.out.println(" Value of i is " + i);
//            for (int j = 1; j <= 10; j++) { // nested-loop
//                System.out.println(j + " j value " );
//            }
//        }

//        int arr[] = new int[7];
//        int arr2[] = {1, 22, 76, 54, 89};

        int[] arr1 = {1, 22, 76, 54, 89, 22};

        String[] fruits = {"apple", "banana", "kiwi" };

//        System.out.println(arr1);
//        System.out.println(arr1.length);

        for(int i = 1; i <= arr1.length - 1; i++ ){
            System.out.println("Value of i is " + i);
            System.out.println("Element in array is " + arr1[i]);
        }

//        for(int integerValue : arr1){ //for every integerValue in arr1
//            System.out.println(integerValue);
//        }

//        for(String fruit : fruits){
//            System.out.println(fruit);
//        }

//        for( ;  ; ){
//            System.out.println("Inside for loop");
//        }


    }
}
