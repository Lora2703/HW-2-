package com.syntax.class05;

import java.util.Scanner;

public class Task3Logic {

	public static void main(String[] args) {


		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter the integer number");
		int num = scanner.nextInt();
		
		if(num>=1 && num<=10) {
			System.out.println("The number "+num+" is small" );
		} else if(num>=11 && num <=100) {
			System.out.println("The number "+num+" is medium" );
		} else if (num>=101 && num <=1000) {
			System.out.println("The number "+num+" is large" );
		}
		scanner.close();
	}
}
