package com.sathya.cjava.loops.ex;

import java.util.Iterator;

public class LoopFirstExample_1 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
        for (int i = 0; i <=10; i++)
        {
          System.out.println("Good Mornig shiva******"+i);
        }
        System.out.println("****************");
		// taking the foor loop starts from 6 and end from 12 increment 2
        for (int i = 5; i <=12 ; i+=2) 
        {
			System.out.println("increment of 2....."+i);
		}
        System.out.println("**************************");
		
		// taking iteration foro starts=10 and end=30 increment  5
        for (int i = 10; i <=30; i+=5) 
        {
			System.out.println("increment of 5...."+i);
		}
		System.out.println("*********************************");
	}

}
