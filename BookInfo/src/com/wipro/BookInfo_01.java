package com.wipro;

import java.util.Scanner;

public class BookInfo_01 {

	public static void main(String[] args)
	{
		// creating a new scanner class object
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Book Id");
		int bookId = sc.nextInt();
		System.out.println("Enter Book Name");
		String bookName = sc.next();
		System.out.println("Enter book author name");
		String bookAuthor = sc.next();
		System.out.println("Enter Book Price");
		double bookPrice = sc.nextDouble();
		System.out.println("ENTER YOUR BOOK DETAILS");
		System.out.println(bookId+"\t "+bookName+"\t "+bookAuthor+"\t "+bookPrice);
		System.out.println("do you want onther book");
		String option  = sc.next();
		if(option.equalsIgnoreCase("no")) 
		{
		
		}

	 // close the connection
		sc.close();
	}

}
