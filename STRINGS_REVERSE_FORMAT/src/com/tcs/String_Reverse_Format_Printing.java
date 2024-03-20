package com.tcs;

public class String_Reverse_Format_Printing {

    public static void main(String[] args) {

        String str = "java by ratan"; // every word will become as reverse order
        String[] str1 = str.split(" ");
        for (String s : str1) {
            char[] c = s.toCharArray();
            int l = 0, r = c.length - 1;
            while (l < r) {
                char temp = c[l];
                c[l] = c[r];
                c[r] = temp;    //OUTPUT : avaj yb natar
                l++;
                r--;
            }
            for (char c1 : c) {
                System.out.print(c1); // Use print instead of println to avoid newlines between characters
            }
            System.out.print(" "); // Add space between reversed words
        }
    }

}


