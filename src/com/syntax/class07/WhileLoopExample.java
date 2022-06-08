package com.syntax.class07;

public class WhileLoopExample {

	public static void main(String[] args) {

		// print numbers from 1 to 10
		int num = 1;
		while (num <= 10) {
			System.out.println(num);
			num++;
		}

		// print numbers from 100 to 50
		System.out.println("---------------");

		int c = 100;
		while (c >= 50) {
			System.out.print(c + " ");
			c--;
		}
		System.out.println("-----------------------");

		// print numbers from -1 to -10

		int d = -1;
		while (d >= -10) {
			System.out.print(d + " ");
			d--;
		}

		int k = 2;

		while (k <= 20) {
			System.out.println(k + " ");
			k += 2;
		}
	}

}
