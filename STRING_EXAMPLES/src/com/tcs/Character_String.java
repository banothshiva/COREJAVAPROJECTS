package com.tcs;

import java.util.Scanner;

public class Character_String {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = "java by java ";
        System.out.println("Enter A Character ");
        char ch = scanner.next().charAt(0);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (ch == str.charAt(i)) {
                count++;
            }
        }
        System.out.println("Your input character '" + ch + "' occurred " + count + " times in the string.");
    scanner.close();
    }
    
}
