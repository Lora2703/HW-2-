package com.syntax.class04;

public class Task4 {

	public static void main(String[] args) {
		double mortgageRate = 3;
		double mortgagePrice = 60000;

		if (mortgageRate > 4.5) {
			System.out.println("I will not buy a house");
		} else if (mortgagePrice > 50000) {
			System.out.println("I will take a loan");
		} else {
			System.out.println("I will pay cash");
		}

	}

}
