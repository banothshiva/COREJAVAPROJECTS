package com.tcs;

public class MultiDimensionalArray {

    public static void main(String[] args) {
        // Define a 2D array
        int[][] numbers = {{1, 2, 3}, {10, 20, 30}, {100, 200, 300}};

        // Print specific elements using indices
        System.out.println("Element at index [0][0]: " + numbers[0][0]);
        System.out.println("Element at index [1][1]: " + numbers[1][1]);
        System.out.println("Element at index [2][2]: " + numbers[2][2]);

        // Print all elements using a nested for loop
        System.out.println("\nPrinting all elements using a nested for loop:");
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println(); // Move to the next line after printing each row
        }

        // Print all elements using a for-each loop
        System.out.println("\nPrinting all elements using a for-each loop:");
        for (int[] row : numbers) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println(); // Move to the next line after printing each row
        }
    }
}
