package com.syntax.class06;

public class EnhancedLargestNumber {

	public static void main(String[] args) {
		
		int num1=20;
		int num2=22;
		int num3=22;
		
		int largest = 0;
		
		if (num1 >= num2 && num1 > num3) {
			largest = num1;
		} else if (num3 >= num1 && num3 >= num2) {
			largest = num3;
		} else if (num2 >= num1 && num2 > num3) {
			largest = num2;
		} else {
			System.out.println("All number are equal");
		}
		
		if (largest != 0) {		
		System.out.println("The largest number is "+largest);
		//The variable largest may not have been initialized
		}
	}

}
