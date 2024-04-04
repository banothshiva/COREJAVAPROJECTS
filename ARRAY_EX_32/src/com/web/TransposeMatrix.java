package com.web;

public class TransposeMatrix {

	public static void main(String[] args) {
		 int[][] numbers = {{1,2,3},{10,20,30},{100,200,300}};
		 for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers.length; j++) {
				System.out.println(numbers[i][j]+" ");
			}
			System.out.println();
		}
	}

}
/*
OUT PUT 
1 
2 
3 

10 
20 
30 

100 
200 
300 
*/