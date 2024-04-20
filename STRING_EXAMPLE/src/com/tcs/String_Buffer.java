package com.tcs;

public class String_Buffer {

	public static void main(String[] args) {
		String msg = " ";
		for (int i = 0; i < 10; i++) {
			msg = msg +1;
		}
		System.out.println(msg); 	//123456789
		StringBuffer buffer = new StringBuffer();
		for (int i = 1; i < 10; i++) {
			buffer.append(i);
		}
		System.out.println(buffer);

	}

}
/* OUT PUT 
1111111111
123456789
*/
