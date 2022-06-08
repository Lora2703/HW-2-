package com.syntax.class10;

public class AnotherWayOf2DArray {

	public static void main(String[] args) {
		

		String[][] usa = {
				{"New York", "Albany", "Buffalo"},
				{"Los Angeles", "San Fransisco", "San Jose", "San Diego", "Redding"},
				{"Miami", "Orlando", "Niceville", "Tampa"},
				{"McLean", "Richmond", "Leesburg"}
		};
		System.out.println(usa[1][2]);//San Jose
		System.out.println("I want to go to "+usa[2][0]);//Miami
		
		System.out.println("Total # of 1D arrays in array usa = "+usa.length);
		
		int elem1array = usa[0].length;
		System.out.println("Number of elements in 1 array ="+elem1array);
		

		int elem2array = usa[1].length;
		System.out.println("Number of elements in 2 array ="+elem2array);

		
		
	}

}
