// Primitives to Strings

package com.example.java;

import java.text.NumberFormat;

public class PrimitivesToStrings {
	
	public static void main(String[] args) {
		
		int intValue = 42;
		String fromInt = Integer.toString(intValue); // helper class
		System.out.println(fromInt);
		
		boolean boolValue = true;
		String fromBoolean = Boolean.toString(boolValue); // helper class
		System.out.println(fromBoolean);
		
		// with the above, limited to converting to the default format
		// using classes in the java runtime below that can do more complex formatting
		// NumberFormat is not in java.lang, so need import statement at top
		
		long longValue = 10_000_000;
		NumberFormat formatter = NumberFormat.getNumberInstance();
		String formatted = formatter.format(longValue);
		System.out.println(formatted);
		
	}

}
