package com.web;

public class DiagonalSumMatrix {

    public static void main(String[] args) {

        int[][] numbers = {{ 1, 2, 3 },          // 1
                           {10, 20, 30},        // 20
                           {100, 200, 300}};   // 300
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if(i == j) {
                    sum = sum + numbers[i][j];
                }
            }
        }
        System.out.println("DIAGONAL SUM OF THE ARRAY ELEMENTS: " + sum);

        int min = numbers[0][0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i][i] < min) {
                min = numbers[i][i];
            }
        }
        System.out.println("MINIMUM NUMBER OF THE ARRAY ELEMENTS: " + min);

        int max = numbers[0][0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i][i] > max) {
                max = numbers[i][i];
            }
        }
        System.out.println("MAXIMUM NUMBER OF THE ARRAY ELEMENTS: " + max);
    }
}
