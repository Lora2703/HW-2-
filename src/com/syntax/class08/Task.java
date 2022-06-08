package com.syntax.class08;

public class Task {

	public static void main(String[] args) {
		/*
		 * find sum of all even and all odd numbers
		 * from 1 to 70
		 */
		
		int sumEven=0;
		int sumOdd=0;
				
		for (int i=1; i<=70; i++) {
			if (i%2 == 0) {
				sumEven +=i;
			} else {
				sumOdd +=i;
			}			
		}
		System.out.println("Sum even numbers is "+sumEven);
		System.out.println("Sum odd numbers is "+sumOdd);

	}

}
