package com.syntax.class08;

import java.util.Scanner;

public class HWTask1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.println("Please enter start point");
		int startPoint = scanner.nextInt();
		System.out.println("Please enter end point");
		int endPoint = scanner.nextInt();
		
		int sumEven=0;
		int sumOdd=0;
		
		for (int i=startPoint; i<=endPoint; i++) {
			if (i%2==0) {
				sumEven+=i;
			} else {
				sumOdd+=i;
			}
		}
		System.out.println("Sum of the even numbers is "+sumEven);
		System.out.println("Sum of the odd numbers is "+sumOdd);
		scanner.close();
	}
}
