package com.javaWrapperClasses;

public class Example1 {

	public static void main(String[] args) {

		// primitive data type value
		int age = 20;

		// Integer intObject = age;

		// Object type value
		Integer intObject = Integer.valueOf(age);// auto boxing

		System.out.println(intObject);

	}

}
