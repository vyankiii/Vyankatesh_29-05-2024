package com.allTypeCasting;
// Widening type casting

/*Converting a lower data type into a higher one is called widening type casting.
 * It is also known as implicit conversion or casting down.It is done automatically.*/

// byte -> short -> char -> int -> long -> float -> double  

public class WideningTypeCasting {

	public static void main(String[] args) {
		int x = 7;

		long y = x;

		float z = y;
		System.out.println("int value " + x);
		System.out.println("long value " + y);
		System.out.println("float value " + z);
	}
}
