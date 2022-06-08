package com.syntax.class04;

public class LargestNumberAmongThreeNumbers {

	public static void main(String[] args) {
		
		int num1=15;
		int num2=18;
		int num3=48;
		int max;
		
		if (num1>num2) {
			if (num1>num3) {
				max=num1;
			}else {
				max=num3;
			}				
		}else {
			if (num2>num3) {
				max=num2;
			}else {
				max=num3;
			}			
		}
		System.out.println("The largest number is "+max);
	}
}
