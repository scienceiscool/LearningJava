// Using mathematical operators and the Math class

package com.example.java;

public class MathOps {

	public static void main(String[] args) {
		
		int intValue1 = 56;
		int intValue2 = 42;
		
		int result1 = intValue1 + intValue2;
		System.out.println("Addition: " + result1);
		
		int result2 = intValue1 - intValue2;
		System.out.println("Subtraction: " + result2);
		
		int result3 = intValue1 * intValue2;
		System.out.println("Multiplication: " + result3);
		
		double result4 = (double) intValue1 / intValue2;
		System.out.println("Division: " + result4);
		// before type cast --> 1
		// after type cast --> 1.3333333333333333
		
		double result5 = (double) intValue1 % intValue2;
		System.out.println("Remainder: " + result5);
		// before type cast --> 14
		// after type cast --> 14.0
		
		double doubleValue = -3.99999;
		long rounded = Math.round(doubleValue);
		System.out.println("Rounded: " + rounded);
		// --> -4
		
		double absValue = Math.abs(doubleValue);
		System.out.println("Absolute: " + absValue);
		// --> 3.99999
		
	}

}
