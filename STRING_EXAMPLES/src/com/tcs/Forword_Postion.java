package com.tcs;

public class Forword_Postion {

	public static void main(String[] args) {
		String str = "your students are very good nice students please focus on work ";
		int forwordIndex = str.indexOf("students");
		if (forwordIndex != -1) {
			System.out.println("Data Found At ....."+forwordIndex);
		}
		else {
			System.out.println("Data Is Not Found ..........");
		}
		int backwordIndex = str.lastIndexOf("nice");
		if (backwordIndex != -1) {
			System.out.println("Data found At Backword Direction ......"+backwordIndex);
		}
		
	}

}
