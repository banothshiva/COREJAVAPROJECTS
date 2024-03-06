package com.biggestNumbersEx1;

public class PreIncePostDecrementEx$$$$_2
{

	public static void main(String[] args)
	{
		int a=10;
		System.out.println(a++);      //10
		System.out.println(++a);        //12
		System.out.println(a--);      //12
		System.out.println(--a);         //10
		System.out.println("*******************");
		int b=10;
		System.out.println(++b);      //11
		System.out.println(b++);        //11
		System.out.println(--b);      //11
		System.out.println(b--);         //11
		System.out.println(b);                //10
		System.out.println("***************************");
		int c=10;
		System.out.println(c++ + ++c);          //22
        System.out.println(++c + c++);          //26
        System.out.println(c-- - --c);              //2
        System.out.println(--c - c--);            //0
	    System.out.println("**********************");
	    int d=10;
	   System.out.println(d++ + ++d + --d + d--);   //44
	   System.out.println(++d + d++ + d-- + --d);   //44
	   System.out.println("***********************");
	}

}
