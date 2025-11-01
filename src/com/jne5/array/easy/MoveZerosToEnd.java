package com.jne5.array.easy;

import java.util.Arrays;

public class MoveZerosToEnd {
	public static void main(String[] args) {
		int[] nums = {9, 0, 2, 3, 0, 8, 0, 0, 4, 5, 6, 1};
		moveZerosToEnd(nums);
		System.out.println(Arrays.toString(nums));
	}

	static void moveZerosToEnd(int[] nums) {
		int count = 0;

		for(int i = 0; i < nums.length; i++) {
			if(nums[i] != 0) {
				//swap nums[i] and nums[count]
				int temp = nums[i];
				nums[i] = nums[count];
				nums[count] = temp;

				//increment count
				count += 1;
			}
		}
	}

}
