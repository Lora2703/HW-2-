package com.syntax.class05;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("How old are you?");
		int age = scanner.nextInt();
		
		if (age>=18) {
			System.out.println("You can get the driver license");
		} else {
			System.out.println("Please ger a learners permit");
		}
		scanner.close();
	}

}
