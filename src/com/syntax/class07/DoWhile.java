package com.syntax.class07;

public class DoWhile {

	public static void main(String[] args) {
		
		int num=1;
		
		while(num<=3) {
			System.out.println(num+" ");
			num++;
		}
		
		System.out.println("---------------------");
		
		do {
			System.out.println(num+" ");
			num++;
		} while (num<=3);
		
		//print even numbers from 70 to 30
		
		int num2 =70 ;
		do {
			System.out.print(num2+" ");
			num2-=2  ;
			} while (num2>=30);

	}

}

