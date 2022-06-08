package com.syntax.class07;

public class TaskLoop {

	public static void main(String[] args) {
		
		//print eve number from 20 to 100
		
		int num = 20;
		while(num<=100) {
			System.out.print(num+" ");
			num+=2;
		}		
		
		//print only odd numbers from 100 to 1
		
		int num1=100;
		while(num1>=1) {
			if(num1%2!=0) {
				System.out.print(num1+" ");
			}
			num1--;
		}

	}

}
