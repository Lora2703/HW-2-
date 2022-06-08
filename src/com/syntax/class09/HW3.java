package com.syntax.class09;

public class HW3 {

	public static void main(String[] args) {
		

		double[] numbers = {5.1, 12.8, 6.3, 7.4};
		
		for (int i=0; i<numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		System.out.println("------------------------------");
		
		for (double num : numbers) {
			System.out.println(num);
		}
	}

}
