package com.tcs;

public class MyOwnException  extends Exception
{
	private int price;

	public MyOwnException(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "MyOwnException [price MyOwnException [price should not be a negitive value" + price + "]";
	}
	
}
