package com.sathya;

public class Decresing_char_array_size {

	public static void main(String[] args) {

		char[] ch = new char[5];
		ch[0]='A';
		ch[1]='B';
		ch[2]='C';
		ch[3]='D';
		ch[4]='E';
		for (char c : ch) {
			System.out.println(c);
		}
		// LENGTH OF THE CHARACTERS 
		System.out.println(ch.length);
	}

}
