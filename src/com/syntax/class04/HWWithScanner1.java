package com.syntax.class04;

import java.util.Scanner;

public class HWWithScanner1 {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your first name");
		String firstName = scanner.next();
		
		System.out.println("Enter your last name");
		String lastName = scanner.next();
		
		System.out.println("Enter your state");
		String state = scanner.next();
		
		System.out.println("My name is "+firstName+" "+lastName+" and I live in "+state);
		scanner.close();

	}

}
