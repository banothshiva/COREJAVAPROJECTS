package com.scanner.user.ex_1;

import java.util.Scanner;

public class BookingExIfElse_02
{
 public static void main(String[] args)
  {
	 //scanner creation
	 Scanner sc = new Scanner(System.in);
	 // take input from end user
	 System.out.println("Enter your booking online/offline");
	 String stastus =sc.next();
	 // logic here
	 if (stastus.equalsIgnoreCase("online")) 
	 {
		System.out.println("directly go to the movie......");
	 }
	 else if (stastus.equalsIgnoreCase("offline"))
	 {
		System.out.println("go to the boxoffice take the ticket !....");
	 }
	 else
	 {
		System.out.println("enter valid data .....");
	 }
	 // close the scanner
	 sc.close();
 }

}
