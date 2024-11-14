package com.example;

import java.util.Scanner;

public class MatrixUserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the dimensions of the matrix
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();

        // Declare and initialize the matrix
        int[][] matrix = new int[rows][cols];

        // Get matrix elements from the user
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter element at (" + i + "," + j + "): ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Print the matrix
        System.out.println("The matrix is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();  // New line after each row
        }

        scanner.close();
    }
}

