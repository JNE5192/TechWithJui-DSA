package com.jne5.array.easy;

public class SecondLargestElement {
	public static void main(String[] args) {
		//input array
		int[] nums = {1,7,3,8,2,2,3,5,6};
		int result = findSecondLargest(nums);
		System.out.println("2nd max :" + result);
	}
	
	public static int findSecondLargest(int[] nums) {
		int max = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		
		
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] > max) {
				//set secondMax as previous max
				secondMax = max;
				//update max
				max = nums[i];
			} else if(nums[i] > secondMax && nums[i] < max) {
				secondMax = nums[i];
			}
		}
		return secondMax;
	}

}
