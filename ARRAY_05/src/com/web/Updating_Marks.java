package com.web;

public class Updating_Marks {

	public static void main(String[] args) {

		int[] marks = {88,99,55,23,44};
		marks[3]=59;  // UPDATE WITH OLD MARKS 23 ------>  59
		marks[4]=66;	// UPDATE WITH OLD MARKS 44 ------>  66
		for (int mark : marks) {
			System.out.println(mark);
		}
		
	}

}
