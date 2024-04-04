package com.web;

public class ArrayBinarySearchEx {

    public static void main(String[] args) {
        int[] numbers = {1, 3, 5, 6, 7, 8, 9}; // Corrected the array elements
        int search = 9;

        int l = 0, r = numbers.length - 1, m = 0; // Added commas to separate variable declarations
        boolean flag = false;
        while (l <= r) { // Changed the condition from l+r to l<=r
            m = (l + r) / 2;
            if (numbers[m] == search) {
                flag = true;
                break;
            } else if (search > numbers[m]) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        if (flag) {
            System.out.println("Element is present at index " + m); // Changed "Location" to "index"
        } else {
            System.out.println("Element is not present");
        }
    }

}

