package com.syntax.class10;

public class MoreExamples {

	public static void main(String[] args) {
		

		int[][] nums = {
				{1,2,3, 5},
				{199, 300, 588, 700},
				{1900, 4578, 98787}
		};
		
		for(int i=0; i<nums.length; i++) {
			for (int j = 0; j < nums[i].length; j++) {
				System.out.print(nums[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("All values using enhanced for loop");
		
		for (int[] num : nums) {
			for (int n:num) {
				System.out.println(n);
			}
		}
	}

}
