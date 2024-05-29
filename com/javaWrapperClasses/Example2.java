package com.javaWrapperClasses;

public class Example2 {

	public static void main(String[] args) {

		// Integer object with value
		
		@SuppressWarnings("removal")
		Integer intObject = new Integer(20);

		// int age = intObject
		int age = intObject.intValue();//unboxing

		System.out.println(age);

	}

}
