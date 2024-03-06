package com.labex.topcompanies;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class TopCompaniesExLab_1
{

	public static void main(String[] args)
	{
		List<String> topCompanies= new ArrayList<String>();
		topCompanies.add("google");
		topCompanies.add("tcs");
		topCompanies.add("infosis");
		topCompanies.add("amazon");
		topCompanies.add("oracle");
		topCompanies.add("sathyatech");
		System.out.println(topCompanies.size());
		//print the first company
		String first=topCompanies.get(0);
		System.out.println("FIRST COMPANY....."+first);
		System.out.println("*********");
		//print the last company
		String last = topCompanies.get(topCompanies.size()-1);
		System.out.println("LAST COMPANY*****"+last);
		System.out.println("**********");
		//print the third company
		String third=topCompanies.get(2);
		System.out.println("THIRD COMPANY....."+third);
		System.out.println("*********");
		//print the 1-3 companies
	   for (int i = 0; i <=2; i++)
	   {System.out.println(topCompanies.get(i));
		System.out.println("************");
	    //get the all companies
			for (String cmp : topCompanies) 
			{
				System.out.println(cmp);
			}
		}		
	}


}
