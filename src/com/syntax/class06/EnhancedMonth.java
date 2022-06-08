package com.syntax.class06;

import java.util.Scanner;

public class EnhancedMonth {

	public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
		
		System.out.println("Please enter your birth month");
		String month = scanner.next();
		String season = "";
		
		if (month.equalsIgnoreCase("December") || month.equalsIgnoreCase("January") || month.equalsIgnoreCase("Fabruary")) {
			season = "Winter";
		}else if (month.equalsIgnoreCase("March") || month.equalsIgnoreCase("April") || month.equalsIgnoreCase("May")) {
			season = "Spring";
		} else if (month.equalsIgnoreCase("June") || month.equalsIgnoreCase("July") || month.equalsIgnoreCase("August")) {
			season = "Summer";
		} else if (month.equalsIgnoreCase("September") || month.equalsIgnoreCase("October") || month.equalsIgnoreCase("November")) {
			season = "Autumn";
		}else {
			season="Invalid";
		}
		
		if (season != "Invalid") {		
		System.out.println("You were born in season "+season);
		}
		scanner.close();

	}

}
