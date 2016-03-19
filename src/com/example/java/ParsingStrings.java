// Parsing Strings

package com.example.java;

public class ParsingStrings {
	
	public static void main(String[] args) {
		
		String s1 = "Welcome to California!";
		System.out.println("Length of string: " + s1.length());
		
		int position = s1.indexOf("California");
		System.out.println("Position of substrig: " + position);
		// --> 11
		// but since this is the index, it's actually the 12th character
		
		String sub = s1.substring(11); // from index 11 to end of String
		System.out.println(sub);
		// --> California!
		
		String s2 = "Welcome!                  ";
		int len1 = s2.length();
		System.out.println(len1);
		// --> 26
		String s3 = s2.trim(); // trims whitespace
		System.out.println(s3.length());
		// --> 8
		
	}

}
