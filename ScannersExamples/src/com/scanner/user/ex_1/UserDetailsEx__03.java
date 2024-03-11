package com.scanner.user.ex_1;

import java.util.Scanner;

public class UserDetailsEx__03 
{

	public static void main(String[] args)
	{
		//create the scanner object
		Scanner sc = new Scanner(System.in);
		// read the data from command prompt
		System.out.println("Enter user name");
		String username=sc.next();
		System.out.println("Enter user password");
        String userpassword=sc.next();
        //ternary operator logic
        String result=username.equals("sathya")&&userpassword.equals("sathyatech123")?"login success":"login fail";
        System.out.println(result);
        System.out.println("********************");
        
        
        int num=16;
        String res = num%2==0&&num%8==0?"div by 2,8":"not div by 2,8";
        System.out.println(res);
        System.out.println("***********************");
	}

}
