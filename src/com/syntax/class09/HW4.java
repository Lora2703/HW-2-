package com.syntax.class09;

public class HW4 {

	public static void main(String[] args) {
	

		int[] numbers = {5, 9, 25, 17, 24, 48};
		int sum1 = 0;
		int sum2=0;
		
		for (int num : numbers) {
			sum1+=num;
		}
		
		for (int i=0; i<numbers.length; i++) {
			sum2+=numbers[i];
		}
		
		System.out.println(sum1+" "+sum2);
		
	}

}
