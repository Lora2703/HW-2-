package com.syntax.class05;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		
		System.out.println("Please enter name");
		String name = scanner.next();
		
		System.out.println("Please enter age");		
		int age = scanner.nextInt();
		
		System.out.println("Please enter price");
		double price = scanner.nextDouble();
		
		System.out.println("Please enter boolean");
		boolean boo = scanner.hasNextBoolean();
		
		System.out.println("Please enter any character");
		char character = scanner.next().charAt(0);
		

	}

}
