package com.scanner.user.ex_1;

import java.util.Scanner;

public class CompanyEx$02SWSwitch
{

	public static void main(String[] args) 
	{
		//scanner class creating here
		Scanner sc = new Scanner(System.in);
		// the data 
		System.out.println("enter your designation Manager,TeamLeader,Developer,Tester");
		String role =sc.next();
		// logics presents here
		switch (role) 
		{
		case "Manager":System.out.println("manager will be the manaage the work!.....");
		break;
		case "TeamLeader":System.out.println("TeamLeader is the god of the team!..........");
		break;
		case "Developer":System.out.println("Developer will be the in the learning stage @$#.....");
		break;
		case "Tester":System.out.println("Teaster will be the test the code!.....");
		break;
        default:System.out.println("GIVE SOME VALID INPUT...."); 
		break;
		}
		//CLOSE THE SCANNER
		sc.close();
   }

}
