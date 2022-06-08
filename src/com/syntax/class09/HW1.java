package com.syntax.class09;

public class HW1 {

	public static void main(String[] args) {
		

		String[] cars = new String[6];
		cars[0]="Mitsubisi";
		cars[1]="Porche";
		cars[2]="BMW";
		cars[3]="Mercedes";
		cars[4]="Toyota";
		cars[5]="Lexus";
		
		for (int i=0; i<6; i++) {
			System.out.println(cars[i]);
		}
		
		System.out.println("----------------------");
		
		for (String car:cars) {
			System.out.println(car);
		}
		
	}

}
