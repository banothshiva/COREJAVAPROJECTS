package com.tcs;

public class ArrayAscendingBubbleSortingorder {


	    public static void main(String[] args) {
	        int[] numbers = {8, 7, 5, 4, 3, 2, 1};

	        // Sorting the array in ascending order using bubble sort
	        for (int i = 0; i < numbers.length - 1; i++) {
	            for (int j = 0; j < numbers.length - i - 1; j++) {
	                if (numbers[j] < numbers[j + 1]) {
	                    int temp = numbers[j];
	                    numbers[j] = numbers[j + 1];
	                    numbers[j + 1] = temp;
	                }
	            }
	        }

	        // Printing the sorted array
	        System.out.println("Sorted array:");
	        for (int num : numbers) {
	            System.out.print(num + " ");
	        }
	        System.out.println(); // Add a new line after printing the sorted array

	        // Finding the largest, second largest, and third largest numbers
	        System.out.println("First Smallest number: " + numbers[numbers.length - 1]);
	        System.out.println("Second Smallest number: " + numbers[numbers.length - 2]);
	        System.out.println("Third Smallest number: " + numbers[numbers.length - 3]);
	    }
	}
/*
OUT PUT:
Sorted array:
8 7 5 4 3 2 1 
First Smallest number: 1
Second Smallest number: 2
Third Smallest number: 3
*/
