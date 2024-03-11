package com.scanner.user.ex_1;

import java.util.Scanner;

public class DayCheckEx$$05 
{

	public static void main(String[] args) 
	{
		//SCANNER CLASS CREATED HERE
		Scanner sc = new Scanner(System.in);
		//TAKING THE INPUTS
		System.out.println("Enter your week days Mon,Tue,wed,Thus,Fri,Sat,Sun");
		String Week =sc.next();
		//LOGIC HERE
		switch (Week) {
		case "Mon":System.out.println("MONDAY ARE VERY BAD....");
		break;
		
		case "Fri":System.out.println("FRIDAYS ARE GOOD....");
		break;
		
		case "Sat":
		case "Sun":System.out.println("PARTY DAYS ARE ENJOY....");
		break;
		
	    default:System.out.println("MIDDAYS ARE OKK OKK ");
		break;
		}
		//CLOSE THE SCANNER
		sc.close();
		}

}
