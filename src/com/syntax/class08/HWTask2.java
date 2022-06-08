package com.syntax.class08;

import java.util.Scanner;

public class HWTask2 {

	public static void main(String[] args) {		
		/*
		 * Write a program to ask a user to enter item they want to buy
		 * and the price of that item. Every time user enters money,
		 * accumulate the amount and tell the user how much is left
		 * to pay off. If user give more money program should return
		 * a change. Whenever a user done with payments program 
		 * should say “Thank you for shopping!”
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the item");
		String item = scanner.nextLine();
		System.out.println("Please enter the price");
		double price = scanner.nextDouble();
		double cost=0;		
		do {
			System.out.println("What is your payment?");
			double payment = scanner.nextDouble();
			cost+=payment;
			if (cost<price) {
				System.out.println("Left to pay off "+(price-cost));
			} else {
				System.out.println("Your change is "+(cost-price));
				System.out.println("Thank you for shopping!");
			}
		} while (cost<price);
		scanner.close();
	}
}
