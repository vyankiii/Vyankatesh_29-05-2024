package com.javaWrapperClasses;

import java.util.ArrayList;
import java.util.List;

public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List values = new ArrayList();
		values.add(1234);
		values.add(1234.54);
		values.add("1234");
		values.add(true);

		for(Object value: values)
		{
			System.out.println(value);
		}
		
		System.out.println("-------------------------------------");
		
		List<Integer> intValues = new ArrayList<Integer>();
		intValues.add(1234);
		intValues.add(1267);
		intValues.add(2026);
		intValues.add(6789);
		
		intValues.remove(0);

		for(Object value: intValues)
		{
			System.out.println(value);
		}
	}

}
