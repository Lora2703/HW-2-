package com.syntax.class05;

import java.util.Scanner;

public class Task3YearAndSalary {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter numbers of worked years");
		int years = scanner.nextInt();
		
		
		if (years>=5) {
			System.out.println("You are eligible for the bonus");
			
			System.out.println("Please enter your annual salary");
			int salary = scanner.nextInt();
			
			if (salary>50000) {
				System.out.println("Your bonus is 5000");
			} else {
				System.out.println("your bonus is 3000");
			}
		} else {
			System.out.println("You are not eligible for the bonus");
		}
		scanner.close();
	}
}
