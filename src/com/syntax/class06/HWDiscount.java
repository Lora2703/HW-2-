package com.syntax.class06;

import java.util.Scanner;

public class HWDiscount {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("Please enter value for sale: yes or no");
		String sale = scanner.next();
		double price;
		int discount = 0;
		double discountPrice = 0;
		
		switch (sale.toLowerCase()) {
			case "no":
				System.out.println("You are don't going for shopping");
				break;
			case "yes":
				System.out.println("What item do you want to buy and what is it price?");
				price = scanner.nextDouble();
				
				if (price > 0 && price<20) {
					discount = 10;
					discountPrice = price * (100-discount) / 100;
				} else if (price >=20 && price <100) {
					discount = 20;
					discountPrice = price * (100-discount) / 100;
				} else if (price >=100 && price < 500) {
					discount = 30;
					discountPrice = price * (100-discount) / 100;
				} else if (price >= 500){
					discount = 50;
					discountPrice = price * (100-discount) / 100;
				} else {
					System.out.println("You entered invalid price");
				}
				
				if (price > 0) {
				System.out.println("After discount "+discount+"% the price of the item reduce from "+price+" to "+discountPrice);
				scanner.close();
				}
		}
	}
}
