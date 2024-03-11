package com.scanner.user.ex_1;

import java.util.Scanner;

public class FeedbackEx_06
{

	public static void main(String[] args) 
	{ Scanner sc = new Scanner(System.in);
	System.out.println("Enter your grade......ABCD");
	char grade = sc.next().charAt(0);
		String feedback = null;
		switch (grade) 
		{
	     	case 'A':feedback="Exellent job";
	    	break;
		    case 'B':feedback="God job";
		    break;
		    case 'C':feedback="You can do better";
		    break;
		    case 'D':feedback="Need improvement";
	       	break;
            default:System.out.println("Enter valid option.....");  
			break;
		}
		
		System.out.println("Feedback......"+feedback);
		
	}

}
