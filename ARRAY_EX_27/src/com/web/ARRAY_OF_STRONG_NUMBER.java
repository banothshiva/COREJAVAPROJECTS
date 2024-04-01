package com.web;

public class ARRAY_OF_STRONG_NUMBER 
{

	public static void main(String[] args)
	{
		int[] numbers = {121,131,145};
		for (int i = 0; i < numbers.length; i++) {
			int temp = numbers[i];
			int index =i;
			int sum = 0;
			while (numbers[i]!=0)
			{
				int digit = numbers[i]%10;
				int fact =1;
				for (int j = 1; j <= digit; j++) {
					fact = fact*j;
					
				}
				sum = sum+fact;
				numbers[i]=numbers[i]/10;
				
			}
			if (temp == sum) {
				System.out.println("STRONG NUMBER ......"+temp+"........"+"INDEX NUMBER ..."+index);
			}
		}

	}

}
