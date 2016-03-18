// Formatting numbers
// Formatting numeric values as Strings

package com.example.java;

import java.text.NumberFormat;
//import java.util.Locale;

public class Main {
	
	public static void main(String[] args) {
		
		//Locale locale = new Locale("da", "DK");
		
		double doubleValue = 1_234_567.89;
		
		NumberFormat numF = NumberFormat.getNumberInstance();
		//NumberFormat numF = NumberFormat.getNumberInstance(locale);
		System.out.println("Number: " + numF.format(doubleValue));
		// --> comma separated String
		
		NumberFormat curF = NumberFormat.getCurrencyInstance();
		//NumberFormat curF = NumberFormat.getCurrencyInstance(locale);
		System.out.println("Currency: " + curF.format(doubleValue));
		// --> currency value
		
		NumberFormat intF = NumberFormat.getIntegerInstance();
		System.out.println("Integer: " + intF.format(doubleValue));
		// --> rounded integer version
		
	}

}
