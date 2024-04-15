package com.tcs;


public class StringTarget_Char {

	public static void main(String[] args) {
		String str = "java is java  because of java";
		char[] chars = str.toCharArray();
		int count = 0;
		char targetChar='a';
		for (char c : chars) {
			if (targetChar == c) {
				count++;
			}
		}
		System.out.println("Target Character Occured.."+count+"...times");
	}

}
