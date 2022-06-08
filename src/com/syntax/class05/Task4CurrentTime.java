package com.syntax.class05;

import java.util.Scanner;

public class Task4CurrentTime {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input current time");
		int time = scanner.nextInt();
		
		if (time>=1 && time<=11) {
			System.out.println("Morning");
		} else if (time>=12 && time<=15) {
			System.out.println("Afternoon");
		} else if (time>=16 && time<=20) {
			System.out.println("Evening");
		} else {
			System.out.println("Night");
		}
	}
}
