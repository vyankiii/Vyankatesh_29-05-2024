package com.allTypeCasting;

public class WrapperClass {
	// Java Program to convert all primitives into its corresponding wrapper objects
	// and vice-versa

	public static void main(String args[]) {
		byte b = 10;
		short s = 20;
		int i = 30;
		long l = 40;
		float f = 50.0F;
		double d = 60.0D;
		char c = 'a';
		boolean b2 = true;

		// Autoboxing: Converting primitives into objects
		System.out.println("Autoboxing: Converting primitives into objects......");
//	Byte byteobj=b;
		Byte byteobj = Byte.valueOf(b);

//	Short shortobj=s;  
		Short shortobj = Short.valueOf(s);

//	Integer intobj=i; 
		Integer intobj = Integer.valueOf(i);

//	Long longobj=l;  
		Long longobj = Long.valueOf(l);

//	Float floatobj=f;  
		Float floatobj = Float.valueOf(f);

//	Double doubleobj=d;
		Double doubleobj = Double.valueOf(d);

//	Character charobj=c;
		Character charobj = Character.valueOf(c);

//	Boolean boolobj=b2;
		Boolean boolobj = Boolean.valueOf(b2);

		// Printing objects
		System.out.println("---Printing object values---");
		System.out.println("Byte object: " + byteobj);
		System.out.println("Short object: " + shortobj);
		System.out.println("Integer object: " + intobj);
		System.out.println("Long object: " + longobj);
		System.out.println("Float object: " + floatobj);
		System.out.println("Double object: " + doubleobj);
		System.out.println("Character object: " + charobj);
		System.out.println("Boolean object: " + boolobj);

		System.out.println("========================================================================================");
		System.out.println();
		System.out.println("Unboxing: Converting Objects to Primitives...");
		// Unboxing: Converting Objects to Primitives

//		byte bytevalue = byteobj;
		byte bytevalue = byteobj.byteValue();

//		short shortvalue = shortobj;
		short shortvalue = shortobj.shortValue();

//		int intvalue = intobj;
		int intvalue = intobj.intValue();

//		long longvalue = longobj;
		long longvalue = longobj.longValue();

//		float floatvalue = floatobj;
		float floatvalue = floatobj.floatValue();

//		double doublevalue = doubleobj;
		double doublevalue = doubleobj.doubleValue();

//		char charvalue = charobj;
		char charvalue = charobj.charValue();

//		boolean boolvalue = boolobj;
		boolean boolvalue = boolobj.booleanValue();

		// Printing primitives
		System.out.println("---Printing primitive values---");
		System.out.println("byte value: " + bytevalue);
		System.out.println("short value: " + shortvalue);
		System.out.println("int value: " + intvalue);
		System.out.println("long value: " + longvalue);
		System.out.println("float value: " + floatvalue);
		System.out.println("double value: " + doublevalue);
		System.out.println("char value: " + charvalue);
		System.out.println("boolean value: " + boolvalue);
	}
}
