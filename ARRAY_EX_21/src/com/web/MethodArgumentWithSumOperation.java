package com.web;

public class MethodArgumentWithSumOperation {

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {10, 20, 30, 40, 50};
        int[] result;

        if (array1.length == array2.length) {
            result = new int[array1.length]; // Create the result array with the correct length

            for (int i = 0; i < array1.length; i++) {
                result[i] = array1[i] + array2[i];
            }

            // Print the result array
            for (int value : result) {
                System.out.print(value + " ");
            }
            System.out.println(); // Print a new line
        } else {
            System.out.println("Arrays have different lengths. Addition is not possible.");
        }
    }
}
