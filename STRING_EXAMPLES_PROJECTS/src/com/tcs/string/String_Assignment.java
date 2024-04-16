package com.tcs.string;

public class String_Assignment {

    public static void main(String[] args) {
        String str = "a cat is a rat but a cat";
        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == ' ') {
                continue; // Skip counting spaces
            }
            int count = 1;
            for (int j = i + 1; j < ch.length; j++) {
                if (ch[i] == ch[j] && ch[i] != ' ') {
                    count++;
                    ch[j] = ' '; // Mark the character as visited to avoid counting it again
                }
            }
            System.out.println(ch[i] + " -----------> " + count);
        }
    }
}
/* OUT PUT
a -----------> 6
c -----------> 2
t -----------> 4
i -----------> 1
s -----------> 1
r -----------> 1
b -----------> 1
u -----------> 1
*/