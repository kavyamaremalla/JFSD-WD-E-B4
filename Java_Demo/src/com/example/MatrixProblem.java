package com.example;

public class MatrixProblem {

    public static void main(String[] args) {

        int rows = 4; //Scanner input
        int columns = 4; //Scanner input

        int[][] array = new int[rows][columns];
//                {
//                {1,2,3,4},
//                {5,6,7,8},
//                {9,10,11,12},
//                {13,14,15,16}
//            };

//        int value = 1;
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < columns; j++) {
//                array[i][j] = value;
//                value ++ ;
//            }
//        }

        System.out.println(array[0][2]);

        int value = 1;

        System.out.println("The 2D array with 4*4 is : ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j] = value;
                value ++ ;
                System.out.print(array[i][j] + " "); //printing the value of elements in matrix
            }
            System.out.println(); //line break after every row completion
        }

        System.out.println(array[0][2]);

    }



}
