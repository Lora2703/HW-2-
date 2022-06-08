package com.syntax.class05;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Do you have a credit card?");
		String haveCard = scanner.next();
		
		if (haveCard.equalsIgnoreCase("yes")) {
			System.out.println("What is the balance pf your card?");
			double balance = scanner.nextDouble();
			
			if (balance>1000) {
				System.out.println("Please pay off immediately");
			} else {
				System.out.println("You can spend more");
			}
		} else {
			System.out.println("I would like to offer you a credit card");
		}
		scanner.close();
	}
}
