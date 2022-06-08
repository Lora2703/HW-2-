package com.syntax.class06;

import java.util.Scanner;

public class HWCountryAndLanguage {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("Please enter your country");
		String country = scanner.nextLine();
		String language;
		
		if (country.toUpperCase().contentEquals("USA")) {
			language = "English";
		} else if(country.toUpperCase().contentEquals("UKRAINA")) {
			language = "Ukrainian";
		} else if(country.toUpperCase().contentEquals("FRANCE")) {
			language = "French";
		} else if(country.toUpperCase().contentEquals("SPAIN")) {
			language = "Spanish";
		} else {
			language = "not defined";
		}
		System.out.println("Your country is "+country.toUpperCase()+" and you language is "+language);
		
		System.out.println("----------------------------------------------------");
		
		switch (country.toUpperCase()) {
		case "USA":
			language = "English";
			break;
		case "UKRAINE":
			language = "Ukrainian";
			break;
		case "FRANCE":
			language = "French";
			break;
		case "SPAIN":
			language = "Spanish";
			break;
		default: 
			language = "not defined";
		}
		System.out.println("Your country is "+country.toUpperCase()+" and you language is "+language);
		scanner.close();
	}

}
