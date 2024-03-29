package com.tech;

public class SqureElement {

	public static int[] squreElement(int[] elements) 
	{
		int[] squreValue = new int[elements.length];
		for (int i = 0; i < squreValue.length; i++) {
			squreValue[i]=(elements[i])*(elements[i]);
		}
		return squreValue;
	}
	public static void main(String[] args)
	{
		int[] elements= {2,3,4,5,6,7,8,9,1,55};
		int[] numbers = SqureElement.squreElement(elements);
		for (int num : numbers) {
			System.out.println(num+"");
		}

	}

}
