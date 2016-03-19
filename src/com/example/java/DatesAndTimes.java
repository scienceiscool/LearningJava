// Working with dates and times
// There are 2 different APIs for working with dates and times in Java
	// Original set of classes introduced with Java in the '90s, and
	// a completely new API brought in with Java 8

package com.example.java;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.GregorianCalendar;

public class DatesAndTimes {
	
	public static void main(String[] args) {
		
		// A look at the older version of the API
		
		Date d = new Date(); // current moment in time
		System.out.println(d);
		// --> Sat Mar 19 12:34:29 PDT 2016
		
		// Representing a specific date --> use GregorianCalender
		GregorianCalendar gc = new GregorianCalendar(2009, 1, 28);
		// add a day
		gc.add(GregorianCalendar.DATE, 1); // add 1 to the date
		Date d2 = gc.getTime(); // because it returns a Date object
		System.out.println(d2);
		// --> Sun Mar 01 00:00:00 PST 2009
			// Why March? In the original API months start at 0
			// Jan is 0, Feb is 1, ...
			// Feb 28 + 1 --> Mar 1
		
		// Format Date
		DateFormat df = DateFormat.getDateInstance(DateFormat.FULL);
		System.out.println(df.format(d2));
		
		// A look at the Java 8 version of the API
		
		// Equivalent to constructing Date object with no parameters
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);
		// --> 2016-03-19T12:41:30.866
			// UNIX time stamp
		
		LocalDate ld = LocalDate.of(2009, 1, 28);
		System.out.println(ld);
		// --> 2009-01-28
			// Notice: Month numbering starts at 1, not 0 like in the older API
		
		// Format LocalDate
		//DateTimeFormatter dtf = DateTimeFormatter.ISO_DATE;
		// --> 2009-01-28
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("M/d/yyyy");
		// --> 1/28/2009
		System.out.println(dtf.format(ld));
		
	}

}
