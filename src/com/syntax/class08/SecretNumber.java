package com.syntax.class08;

import java.util.Scanner;

public class SecretNumber {

	public static void main(String[] args) {
		
		int secretNum = 25;
		int num;
		
		Scanner scanner = new Scanner (System.in);
		do {
		System.out.println("Guess my secret number");
		num = scanner.nextInt();
		} while (num != secretNum);
		
		System.out.println("The secret number is "+num);
		scanner.close();

	}

}
