package com.syntax.class08;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		
		int i;
		
		for (i=1; i<=50; i++) {
			if (i%3 == 0) {
				continue;
			}
			System.out.println(i);
			
		}
		System.out.println("------------------");
		
		String answer;
		
		Scanner scanner = new Scanner(System.in);
		do {
		System.out.println("Do you apply a credit card?");
		answer = scanner.next();
		} while (!answer.equalsIgnoreCase("yes"));
		
		System.out.println("You said yes");

	}

}
