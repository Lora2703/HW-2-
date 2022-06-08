package com.syntax.class04;

public class Task3 {

	public static void main(String[] args) {

		boolean hasDiploma = false;

		double gpaScore = 3;
		if (hasDiploma) {
			System.out.println("Congratulations!");
			if (gpaScore >= 3.5) {
				System.out.println("You are eligible for scholarship");
			} else {
				System.out.println("You should have studied harder");
			}
		} else {
			System.out.println("You should get degree");

		}
	}

}
