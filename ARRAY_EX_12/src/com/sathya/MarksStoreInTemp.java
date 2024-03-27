package com.sathya;

public class MarksStoreInTemp {

	public static void main(String[] args) {
		
		int[] marks = {12,44,55,23,77};
		// INT variable in TEMP
		int first = marks[0];
		int last = marks[marks.length-1];
		int temp =first;
		first = last;
		last = temp;
		for (int mark : marks) {
			System.out.println(mark);
		}
	}

}
