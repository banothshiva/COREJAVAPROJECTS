package com.tcs;

public class ReverseStringFormat {

    public static void main(String[] args) {

        String str = "java by ratan sir ";
        String[] words = str.split("\\s+");
        
        for (String word : words) {
            char[] characters = word.toCharArray();
            int left = 0, right = characters.length - 1;
            while (left < right) {
                char temp = characters[left];
                characters[left] = characters[right];
                characters[right] = temp;
                left++;
                right--;
            }
            System.out.print(new String(characters) + " ");
        }

    }

}

/*
 *  OUT PUT :
 *   avaj yb natar ris 
*/