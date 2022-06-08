package com.syntax.class06;

import java.util.Scanner;

public class HWGrade {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("Please enter your grade (A, B, C or D");
		char grade = scanner.next().charAt(0);
		String explanation;
		
		if (grade == 'A' || grade == 'a') {
			explanation = "Excellent";
		} else if (grade == 'B' || grade == 'b') {
			explanation = "Good";
		} else if (grade == 'C' || grade == 'c') {
			explanation = "Average";
		} else if (grade == 'D' || grade == 'd') {
			explanation = "Bad";
		} else {
			explanation = "Not Acceptable";
		}		
		System.out.println("You entered grade "+grade+" and it's "+explanation);
		
		System.out.println("----------------------------------");
		
		switch (grade) {
		case 'A':
			explanation = "Excellent";
			break;
		case 'B':
			explanation = "Good";
			break;
		case 'C':
			explanation = "Average";
			break;
		case 'D':
			explanation = "Bad";
			break;
		default:
			explanation = "Not Acceptable";
		}
		System.out.println("You entered grade "+grade+" and it's "+explanation);
		scanner.close();
	}

}
