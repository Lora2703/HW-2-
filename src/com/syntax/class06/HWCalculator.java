package com.syntax.class06;

import java.util.Scanner;

public class HWCalculator {

	public static void main(String[] args) {

		Scanner scanner = new Scanner (System.in);
		System.out.println("Please enter two numbers and operator");
		double num1 = scanner.nextDouble();
		double num2 = scanner.nextDouble();
		char operator = scanner.next().charAt(0);
		double result =0;
		
		switch (operator) {
		case '+':
			result = num1+num2;
			break;
		case '-':
			result = num1-num2;
			break;
		case '*':
			result = num1*num2;
			break;
		case '/':
			result = num1/num2;
			break;
		default:
			System.out.println("Operator is not defined");		
		}
		if (result != 0) {
			System.out.println(num1+" "+operator+" "+num2+" = "+result);
		}
		
		System.out.println("----------------------------");
		
		if (operator == '+') {
			result = num1+num2;
		} else if (operator == '-') {
			result = num1-num2;
		} else if (operator == '*') {
			result = num1*num2;
		} else if (operator == '/') {
			result = num1/num2;
		} else {
			System.out.println("Operator is not defined");	
		}
		if (result != 0) {
			System.out.println(num1+" "+operator+" "+num2+" = "+result);
		}
		scanner.close();
	}
}
