package com.scanner.user.ex_1;

import java.util.Scanner;

public class LanguageCheckSwitchCase$01 
{

	public static void main(String[] args) 
	{
		// scanner class creation
		Scanner sc = new Scanner(System.in);
		// initializing the input
		System.out.println("enter your option 1.telugu,2.English,3.Hindi,4.Kannada,5.Tamil");
        int language=sc.nextInt();
        //logic here
     switch (language)
     {
	    case 1:System.out.println("you selected Telugu......");
		System.out.println("the conversation in Thelugu......");
		break;
		case 2:System.out.println("you selected English......");
		System.out.println("the conversation in English......");
		break;
		case 3:System.out.println("you selected Hindi......");
		System.out.println("the conversation in Hindi......");
		break;
		case 4:System.out.println("you selected Kannada......");
		System.out.println("the conversation in Kannada......");
		break;
		case 5:System.out.println("you selected Tamil......");
		System.out.println("the conversation in Tamil.....");
		break;
		

	    default:System.out.println("Enter valid data....");
		break;
	}
	//close the scanner
     sc.close();
 }

}
