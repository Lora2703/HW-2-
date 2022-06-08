package com.syntax.class02;

public class Variables {

	public static void main(String[] args) {
		
		String name = "John";
		String lastName = "Doe";
		char grade = 'A';
		String city = "Las Vegas";
		String state = "Nevada";
		long phoneNumber = 1234567890L;
		
		System.out.println("My name is "+name+" and my last name is "+lastName);
		System.out.println("I am "+grade+" student");
		System.out.println("I live in city "+city+" and state "+state);
		System.out.println("And my phone number is "+phoneNumber);
		
		grade = 'B';
		city = "Fairfax";
		state = "Virginia";
		phoneNumber = 9876543210L;
		
		System.out.println("My name is "+name+" and I moved to new city "+city+
				" and new state "+state);
		System.out.println("My new phone number is "+phoneNumber);
		System.out.println("Now I am "+grade+" student");
		

	}

}
