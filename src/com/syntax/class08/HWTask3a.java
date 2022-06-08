package com.syntax.class08;

public class HWTask3a {

	public static void main(String[] args) {

		for (int a=0; a<=2; a++) {
			for (int b=0; b<=9; b++) {
				for (int c=0; c<6; c++) {
					for (int d=0; d<=9; d++) {
						if(a==2 && b>=4) {
							break;
						}else {
						System.out.println(a+""+b+":"+c+""+d);
						}
					}
				}
			}
		}

	}
}
