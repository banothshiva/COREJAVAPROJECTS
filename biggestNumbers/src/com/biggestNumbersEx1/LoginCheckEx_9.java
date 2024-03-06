package com.biggestNumbersEx1;

import java.util.Scanner;

public class LoginCheckEx_9
{

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter user name...;");
	String username	=s.next();
	System.out.println("enter password...");
	String password =s.next();
	if (username.equals("sathya")&&password.equals("sathya@123"))
	{
		System.out.println("login succesfully....."+username);
	}
	 else
	 {
		System.out.println("login failed try with valid data.....");
	  }
	//close the Scanner
	s.close();
	}

}
