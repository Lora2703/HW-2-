package com.syntax.class05;

import java.util.Scanner;

public class Task2CelsiusToFahrenheit {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please input your city");
		String city = scanner.next();
		
		System.out.println("Please input temperature in Fahrenheit");
		double tempFahrenheit = scanner.nextDouble();
		
		
		double tempCelsius = (tempFahrenheit-32)/1.8;
		
		System.out.println("The temperature in the city "+city+" is "+tempCelsius);
		scanner.close();
	}
}
