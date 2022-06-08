package com.syntax.class03;

public class IfStatement {
	public static void main(String[] args) {
		
		/*
		 * declare a variable rate.
		 * If rate is more than 5 --> I am not buying a house
		 */
		
		double mortgageRate=5.5;
		
		if(mortgageRate>5) {
			System.out.println("I am not buying a house");
		}
		
		/*
		 * declare temperature. If temp is higher than 75 -->
		 * I will go for a walk
		 */
		
		int temp = 68;
		if(temp>75) {
			System.out.println("I will go for a walk");
		} else {
			System.out.println("I am going to study Java");
		}
		
		System.out.println("-----------------------------");
		
		char gender='f';
		
		if (gender=='f') {
			System.out.println("You like shopping");
		}else {
			System.out.println("You like watching sports");
		}
		
		System.out.println("------------------------");
		
		String browser = "chrome";
		
		if (browser.equals("chrome")){
			System.out.println("All tests cases will be exeuted on crome");
		}else {
			System.out.println("I am not executing any test cases");
		}
	}

}
