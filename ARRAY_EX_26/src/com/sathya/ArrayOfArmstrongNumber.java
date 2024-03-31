package com.sathya;
public class ArrayOfArmstrongNumber 
{

	public static void main(String[] args)
	{
		int[] numbers = {153,120,10,170};
		for (int i = 0; i < numbers.length; i++) {
			int temp =  numbers[i];
					int index = i;
					int reverse = 0;
					while (numbers[i]!= 0)
					{
						int digit  = numbers[i]%10;
						reverse =reverse+digit*digit*digit;
						numbers[i]=numbers[i]/10;
						
					}
					if (temp == reverse)
					{
						System.out.println("ARMSTRONG NUMBER...... "+temp+"......."+"WITH INDEX NUMBER...."+index);
					}
		}

	}

}
