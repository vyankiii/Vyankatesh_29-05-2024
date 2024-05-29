package com.javaTypeCasting;

public class Example4 {

	public static void main(String[] args) {

		float value1 = 200.67f, value2 = 300.78f;

		// Type mismatch: cannot convert from float to int
		int result = (int) (value1 + value2);// explicit/externally

		System.out.println(result);// 501

	}

}
