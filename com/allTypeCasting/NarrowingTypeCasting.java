package com.allTypeCasting;
// NarrowingTypeCasting

/*Converting a higher data type into a lower one is called narrowing type casting. 
It is also known as explicit conversion or casting up. It is done manually by the programmer. 
If we do not perform casting then the compiler reports a compile-time error.*/

//double -> float -> long -> int -> char -> short -> byte  
public class NarrowingTypeCasting {

	public static void main(String args[]) {
		double d = 166.66;
//converting double data type into long data type  
		long l = (long) d;
//converting long data type into int data type  
		int i = (int) l;
		System.out.println("Before conversion: " + d);
//fractional part lost  
		System.out.println("After conversion into long type: " + l);
//fractional part lost  
		System.out.println("After conversion into int type: " + i);
	}
}