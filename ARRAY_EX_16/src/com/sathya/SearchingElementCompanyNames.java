package com.sathya;

import java.util.Scanner;

public class SearchingElementCompanyNames
{

	public static void main(String[] args) 
	{
		//CREATE SCANNER OBJECT 
		Scanner scanner = new Scanner(System.in);
		//DECLARATION 
		String[] campanyNames = {"Infosis","wipro","tcs","Google","TechMahendra"};
		String search ="Infosis";
		boolean flag = false;
		for (String name : campanyNames) {
			if (name.equals(search)) {
				 flag = true;
				break;
				
			}
		}
		if(flag) 
		{
			System.out.println("Element is Found ");
		}
		else {
			System.out.println("Element is Not Found ");

		}
		scanner.close();
	}

}
