package com.tcs;

public class Odd_Index_Position {

    public static void main(String[] args) {
        String str = "ratan";

        // Print the size of the string
        System.out.println("Size Of The String " + str.length()); // PRINT THE SIZE OF THE STRING LENGTH 5

        for (int i = 0; i < str.length(); i++) {
            if (i % 2 != 0) {
                System.out.println("Odd Index Numbers " + str.charAt(i));
            }
        }

        // Print the character at index 4
        System.out.println("Character at index 2: " + str.charAt(2));
    }

}
