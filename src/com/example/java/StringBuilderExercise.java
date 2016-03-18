// String builder
// Building a string from multiple values

package com.example.java;

import java.util.Scanner;

public class StringBuilderExercise {
	
	public static void main(String[] args) {
		
		String str1 = "Hello";
		String str2 = "World!";
		String str3 = str1 + ", " + str2;
		System.out.println(str3);
		
		// if doing a lot of String concatenations,
		// creating three different String objects can
		// be problematic with regard to memory management
		// so instead, use StringBuilder (apart of java.lang package)
		
		// append method returns reference to that StringBuilder object
		// so, one could chain the calls together
		
		/* StringBuilder sb = new StringBuilder("Hello");
		 * sb.append(", ");
		 *sb.append("World!");
		 */
		
		StringBuilder sb = new StringBuilder("Hello")
				.append(", ")
				.append("World!");
		
		System.out.println(sb);
		// now only creating 1 object instead of 3
		
		// can also use StringBuilder to collect data that user provides
		// use ScannerClass (import java.util)
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter value: ");
		String input = scanner.nextLine();
		System.out.println(input);
		
		// delete contents
		sb.delete(0, sb.length());
		for (int i = 0; i < 3; i++) {
			input = scanner.nextLine();
			sb.append(input + "\n");
		}
		
		System.out.println(sb);
		
	}

}
