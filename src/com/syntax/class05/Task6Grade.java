package com.syntax.class05;

import java.util.Scanner;

public class Task6Grade {

	public static void main(String[] args) {


		Scanner scanner = new Scanner (System.in);
		System.out.println("Input your quiz score");
		int quizScore = scanner.nextInt();
		
		System.out.println("Input your mid term score");
		int midTermScore = scanner.nextInt();
		
		System.out.println("Input your final score");
		int finalScore = scanner.nextInt();
		
		int avgScore = (quizScore+midTermScore+finalScore)/3;
		
		System.out.println("Your average score is "+avgScore);
		if (avgScore>=90) {
			System.out.println("Your grade is A");
		} else if (avgScore>=70 && avgScore<90) {
			System.out.println("Your grade is B");
		} else if (avgScore>=50 && avgScore<70) {
			System.out.println("Your grade is C");
		} else if (avgScore<50) {
			System.out.println("Your grade is F");
		}
		scanner.close();
	}
}
