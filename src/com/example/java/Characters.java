// Characters

package com.example.java;

public class Characters {
	
	public static void main(String[] args) {
		
		// a character is a primitive data type and consists of a single character
		// a string is a complex object and can consist of many characters
		char c1 = '1';
		char c2 = '2';
		char c3 = '3';
		
		System.out.println("Char 1: " + c1);
		System.out.println("Char 2: " + c2);
		System.out.println("Char 3: " + c3);
		
		char dollarSign = '\u0024'; // unicode number for the dollar sign character
		System.out.println("Currency: " + dollarSign);
		
		// manipulate characters using the helper class for the char data type
		char a1 = 'a';
		char a2 = 'b';
		char a3 = 'c';
		System.out.print(Character.toUpperCase(a1));
		System.out.print(Character.toUpperCase(a2));
		System.out.println(Character.toUpperCase(a3));
		
	}

}
