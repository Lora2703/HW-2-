package com.syntax.class08;

public class HWTask3 {
	
	/*
	 * Using nested loop, create a 24 hour clock that will display
	 * 2 digits for an hour and 2 digits for a minute.
	 */
	


	public static void main(String[] args) {
		for (int hour=0; hour<24; hour++) {
			if (hour<=9) {
				for (int minute=0; minute<60; minute++) {
					if (minute<=9) {
						System.out.println("0"+hour+":0"+minute);
					} else {
						System.out.println("0"+hour+":"+minute);
					}
				}
			} else {
				for (int minute=0; minute<60; minute++) {
					if (minute<=9) {
						System.out.println(hour+":0"+minute);
					} else {
						System.out.println(hour+":"+minute);
					}
				}
			}
		}

	}

}
