package com.sathya.corejava;

public class DiffrentDataPattern {

	public static void main(String[] args) {
		for (int row=1;row<=5;row++) {
			for(int col=1;col<=row;col++) {
				System.out.print((char)(row+64)+" ");
			}
			System.out.println();
		}
		System.out.println("**********");
		for (int row = 1; row <=5; row++) {
			for (int col = 1; col <=row ; col++) {
				
			System.out.print((char)(col+69)+" ");
			}
			System.out.println();
		}
		System.out.println("********************");
		for(int i=5;i<=9;i++) {
			for(int j=5;j<=9;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("*************");
		
	}

}
