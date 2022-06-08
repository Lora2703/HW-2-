package com.syntax.class05;

import java.util.Scanner;

public class Task1Loan {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("What amount of loan do you need");

		int loan = scanner.nextInt();
		
		if (loan<=200000) {
			System.out.println("Your loan is approved");
		} else {
			System.out.println("I have to reject");
		}
		scanner.close();
	}
}
