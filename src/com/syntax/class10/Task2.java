package com.syntax.class10;

public class Task2 {

	public static void main(String[] args) {
	

		//Create an array to store char values
		//and then print those in reverse order
		
		char[] array = {'b', 'k', 'R', 'a', 'c', 'Z'};
		
		for (int i=array.length-1; i>=0; i--) {
			System.out.print(array[i]+" ");
		}
	}

}
