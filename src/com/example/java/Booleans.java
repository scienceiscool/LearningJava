// Booleans

package com.example.java;

public class Booleans {

	static boolean bDef;
	
	public static void main(String[] args) {
		
		// default value for a boolean variable is false
		// if not initialized when declared
		// can't demonstrate that within this method
		// local variables must be initialized
		// see bDef above --> default value is false
		boolean b1 = true;
		boolean b2 = false;
		
		System.out.println("The value of b1 is: " + b1);
		System.out.println("The value of b2 is: " + b2);
		System.out.println("The value of bDef is: " + bDef); // --> false
		
		boolean b3 = !b1; // negation
		System.out.println("The value of b3 is: " + b3);
		
		int i1 = 0;
		boolean b4 = (i1 != 0);
		System.out.println("The value of b4 is: " + b4);
		
		String sBoolean = "true";
		boolean parsed = Boolean.parseBoolean(sBoolean);
		System.out.println("Parsed: " + parsed);
		
	}

}
