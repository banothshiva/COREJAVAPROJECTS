package com.tcs;

import java.util.Scanner;

public class Even_String_toChar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = "java is java because of java";
        System.out.println("Enter A Character ");
        char targetChar = scanner.next().charAt(0); // Take user input for target character
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (targetChar == currentChar) {
                count++;
            }
        }
        System.out.println("Your character " + targetChar + " occurred " + count + " times");

        if (count % 2 == 0) {
            System.out.println("Your character occurred an even number of times");
        } else {
            System.out.println("Your character occurred an odd number of times");
        }
        scanner.close();
    }
}
