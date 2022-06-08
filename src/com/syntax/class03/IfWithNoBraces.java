package com.syntax.class03;

public class IfWithNoBraces {

	public static void main(String[] args) {

		String time = "Morning";

		if (time.contentEquals("Morning"))
			System.out.println("Say Good Morning");
		else
			System.out.println("Say Good Day");

		System.out.println("End of the code");

	}

}
