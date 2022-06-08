package com.syntax.class04;

public class Donor {

	public static void main(String[] args) {
		
		int age = 17;
		int weight = 112;
		
		if (age>=18) {
			if (weight>110) {
				System.out.println("You are eligible to donate your blood");
			}else {
				System.out.println("We cannot accept such a patient");
			}
		} else {
		System.out.println("We cannot accept such a patient");
		}
	}
}
