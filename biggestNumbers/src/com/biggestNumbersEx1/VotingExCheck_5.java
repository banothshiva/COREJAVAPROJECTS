package com.biggestNumbersEx1;

import java.util.Scanner;

public class VotingExCheck_5 
{
 public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
	 Scanner s =new Scanner(System.in);
	 
	 System.out.println("enter age....");
	 int age =s.nextInt();                  //19
	 //Read the data from command prompt
	 if (age>=18) {
		System.out.println("your elegable for the vote***"+age);
	}
	 else {
		System.out.println("not elegiable for the vote..."+age);
	}
	 //close the scanner
	 s.close();
	 

	}

}
