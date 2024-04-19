package com.tcs;

public class Replace_Char_Occurances {

    public static void main(String[] args) {
        String string = "a cat is a rat but a cat";
        string = string.replace(" ", "");

        for (int i = 0; i < string.length(); i++) {
            int count = 0;
            char currentChar = string.charAt(i);

            // Check if the current character has already been counted
            boolean alreadyCounted = false;
            for (int j = 0; j < i; j++) {
                if (currentChar == string.charAt(j)) {
                    alreadyCounted = true;
                    break;
                }
            }

            if (!alreadyCounted) {
                for (int j = 0; j < string.length(); j++) {
                    if (currentChar == string.charAt(j)) {
                        count++;
                    }
                }
                System.out.println(currentChar + " -------> " + count);
            }
        }
    }
}
/*
 OUT PUT 
 a -------> 6
c -------> 2
t -------> 4
i -------> 1
s -------> 1
r -------> 1
b -------> 1
u -------> 1
*/
