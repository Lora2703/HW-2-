package com.syntax.groupexercise1;

public class Task7 {
	public static void main(String[] args) {
		int num = 8;
		boolean prime = false;
		
		for (int i=2; i<=num/2; i++) {
			if(num%i==0) {
				prime = false;
				break;
			}else {
				prime = true;
			}
		}
		if (prime) {
			System.out.println("Prime");
		} else {
			System.out.println("Not Prime");
		}
	}

}
