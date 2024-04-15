package com.tcs;

public class StringUniqueCharcters {

    public static void main(String[] args) {
        String str = "java by ratan banana";
        System.out.println("Original string: " + str);
        String[] words = str.split("\\s+");
        for (String word : words) {
            System.out.print("Unique characters in '" + word + "': ");
            for (int i = 0; i < word.length(); i++) {
                char ch = word.charAt(i);
                if (word.indexOf(ch) == word.lastIndexOf(ch)) {
                    System.out.print(ch + " ");
                }
            }
            System.out.println();
        }
    }

}
