package com.naukari;

public class NameUpdateByUsingEqualsMethod 
{

	public static void main(String[] args)
	{
		String[] instituteNames= {"sathya","nareshIT","DurgaIT","Ihub","QualityThought","Jspider","Sathya Technologies",};
		for (int i = 0; i < instituteNames.length; i++)
		{
			if (instituteNames[i].equals("sathya")) 
			{
				System.out.println(instituteNames[i]+"......"+i+"...INDEX.....");
				instituteNames[i]="Sathya Tech";    // sathya UPDATED WITH  Sathya Tech value 
			}
		}
		System.out.println("----------------");
		for (String name : instituteNames) 
		{
			System.out.println(name);
			
		}
		
	}

}
