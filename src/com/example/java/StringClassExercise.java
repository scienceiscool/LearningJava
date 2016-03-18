// String class

package com.example.java;

public class StringClassExercise {
	
	public static void main(String[] args) {
		
		String s1 = "This is a String";
		System.out.println(s1);
		
		String s2 = new String("This is also a String!");
		System.out.println(s2);
		
		String s3 = "Shirt size: ";
		String s4 = "M";
		System.out.println(s3 + s4 + ", Qty: " + 4);
		// number --> String during compilation process
		
		char[] chars = {'H', 'e', 'l', 'l', 'o'};
		String s6 = new String(chars);
		System.out.println(s6);
		
		// s6 is instance of the String class and
		// toCharArray is an instance method that is a member of this class
		char[] chars2 = s6.toCharArray();
		for (char c : chars2) { // for each char in the characters array
			System.out.println(c);
		}
		
	}

}
