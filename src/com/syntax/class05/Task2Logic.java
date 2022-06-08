package com.syntax.class05;

public class Task2Logic {

	public static void main(String[] args) {
		
		int numberOfDay = 10;
		
		if (numberOfDay>=1 && numberOfDay<=5) {
			System.out.println("It is a weekday");
		} else if(numberOfDay==6 || numberOfDay==7) {
			System.out.println("It is a weekend");
		} else {
			System.out.println("Invalid day");
		}
		

	}

}
