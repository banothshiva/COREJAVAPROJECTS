package com.tcs.string;

public class IsPalindrome {

    public static void main(String[] args) {
        String str = "ratan , madam , malayalam , racecar , java";
        String[] str2 = str.split(",");
        for (String word : str2) {
            // Remove leading and trailing whitespaces from the word
            word = word.trim();

            boolean isPalindrome = true;
            int left = 0, right = word.length() - 1;
            while (left < right) {
                if (word.charAt(left) != word.charAt(right)) {
                    isPalindrome = false;
                    break;
                }
                left++;
                right--;
            }
            if (isPalindrome) {
                System.out.println(word + " is a Palindrome.");
            } else {
                System.out.println(word + " is Not a Palindrome.");
            }
        }
    }
}
