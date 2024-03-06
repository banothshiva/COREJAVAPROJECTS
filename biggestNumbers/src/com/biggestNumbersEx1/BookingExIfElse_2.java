package com.biggestNumbersEx1;

import java.util.Scanner;

public class BookingExIfElse_2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your booking online/ofline");
		String status =sc.next();
		if (status.equalsIgnoreCase("online")) 
		{
			System.out.println("directly goto the movie");
		}
		else if (status.equalsIgnoreCase("offline"))
		{
			System.out.println("go to the boxoffice and take the ticket");
		}
		else {
			System.out.println("enter valid data");
		}
		//close the scanner
		sc.close();
	}

}
