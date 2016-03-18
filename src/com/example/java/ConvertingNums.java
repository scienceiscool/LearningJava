// Converting numbers

package com.example.java;

public class ConvertingNumbers {

	public static void main(String[] args) {
		
		int intValue1 = 56;
		int intValue2 = intValue1; // copy of the value, not a reference
		System.out.println("The 2nd value is " + intValue2);
		// --> 56
		
		// when you go from a small amt of memory to a large
		// amt of memory, that's called widening the type
		// ^^^ automatic
		
		long longValue1 = intValue1;
		System.out.println("The long value is " + longValue1);
		// --> 56
		
		// when you go from a larger to a smaller, that's called
		// narrowing the type
		// always at risk of losing data
		
		short shortValue1 = (short) intValue1;
		System.out.println("The short value is " + shortValue1);
		// --> 56
		
		int intValue3 = 1024;
		byte byteValue = (byte) intValue3;
		System.out.println("The byte value is " + byteValue);
		// --> 0
		// conversion failed, lost data
		
		double doubleValue = 3.999999d;
		int intValue4 = (int) doubleValue;
		System.out.println("The int value is " + intValue4);
		// --> 3
		// value got truncated
		
	}

}
