package com.syntax.class09;

public class HW2 {

	public static void main(String[] args) {
		

		String[] animals = new String[5];
		animals[0]="cat";
		animals[1]="dog";
		animals[2]="horse";
		animals[3]="lion";
		animals[4]="tiger";
		
		
		for (int i=0; i<5; i++) {
			System.out.println(animals[i]);
		}
		
		System.out.println("----------------------");
		
		for (String animal:animals) {
			System.out.println(animal);
		}
	}

}
