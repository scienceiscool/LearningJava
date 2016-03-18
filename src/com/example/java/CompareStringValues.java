// Comparing String values

package com.example.java;

public class CompareStringValues {
	
	public static void main(String[] args) {
		
		String str1 = "Hello";
		String str2 = "Hello";
		
		if (str1 == str2) {
			System.out.println("They match!");
		} else {
			System.out.println("They don't match!");
		}
		// --> They match!
		// but not for the reason you think
		
		String str3 = "hello";
		
		if (str1 == str3) {
			System.out.println("They match!");
		} else {
			System.out.println("They don't match!");
		}
		// --> They don't match!
		// expected
		
		String part1 = "Hello ";
		//String part2 = "World";
		String part2 = "WORLD";
		String str4 = part1 + part2;
		String str5 = "Hello World";
		// str4 and str5 should match
		
		if (str4 == str5) {
			System.out.println("They match!");
		} else {
			System.out.println("They don't match!");
		}
		// --> They don't match!
		
		// for a more accurate comparison of Strings in java ...
		
		//if (str4.equals(str5)) {
		if (str4.equalsIgnoreCase(str5)) {
			System.out.println("They match!");
		} else {
			System.out.println("They don't match!");
		}
		// --> They match!
		
	}

}
