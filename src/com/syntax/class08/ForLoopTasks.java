package com.syntax.class08;

public class ForLoopTasks {

	public static void main(String[] args) {

		int i;
		for(i=1; i<=100; i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		for (i=100; i>=1; i--) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		for (i=20; i>=2; i-=2) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		for (i=20; i>=1; i--) {
			if (i%2 == 0) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
		
		for (i=21; i<=50; i+=2) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		for (i=20; i<=50; i++) {
			if (i%2 != 0) {
				System.out.print(i+" ");
			}
		}
	}
}
