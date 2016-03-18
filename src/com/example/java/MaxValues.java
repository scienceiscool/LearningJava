// Tinkering with the primitive data types to try to figure out how they behave

package com.example.java;

public class MaxValues {

	public static void main(String[] args) {
		
		byte b = 127; // maximum value of data type byte
		short sh = 1;
		int i = 1;
		long l = 1L;
		
		float f = 1f;
		double d = 1d;
		
		System.out.println("Byte: " + b); // --> 127
		System.out.println("Short: " + sh); // --> 1
		System.out.println("Int: " + i); // --> 1
		System.out.println("Long: " + l); // --> 1
		System.out.println("Float: " + f); // --> 1.0
		System.out.println("Double: " + d); // --> 1.0
		
		//b++; --> -128
		// wrapped around, now prints minimum value of data type byte
		
		if (b < Byte.MAX_VALUE) {
			b++; // --> 127
		}
				
		System.out.println("Byte: " + b);
		
	}
	
}
