package com.syntax.class05;

import java.util.Scanner;

public class Task1Logic {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("please enter your weight");

		int height = scanner.nextInt();
		
		if (height<60) {
			System.out.println("You are short");
		} else {
			if (height>=60 && height<=72) {
				System.out.println("You are medium");
			} else {
				System.out.println("You are tall");
			}
		}
		scanner.close();
	}

}
