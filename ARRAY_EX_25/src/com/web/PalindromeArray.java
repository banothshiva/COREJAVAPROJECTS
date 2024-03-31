package com.web;

public class PalindromeArray {

	public static void main(String[] args) {
		int[] numbers = {101,121,122,131,252};
		for (int i = 0; i < numbers.length; i++) {
			int temp = numbers[i];
			int reverse = 0,index =i;
			while (numbers[i]!= 0)
			{
				int digit = numbers[i]%10;
				reverse = reverse*10+digit;
				numbers[i]=numbers[i]/10;
				
			}
			if (temp ==reverse) {
				System.out.println("palindrome number ..."+temp+"......"+"With Index "+index);
			}
		}
	}

}
