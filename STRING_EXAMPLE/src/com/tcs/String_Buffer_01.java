package com.tcs;

public class String_Buffer_01 {

	public static void main(String[] args) {
		String str = "order"+"\t";
		for (int i = 1; i <= 9; i++) {
			str += i; // Concatenating the integer i instead of the character '1'
		}
		System.out.println(str);

		StringBuffer buffer = new StringBuffer();
		for (int j = 1; j <= 9; j++) {
			buffer.append("order"+"\t" + j); // Concatenating the integer j instead of the character '1'
		}
		System.out.println(buffer);
	}
}
