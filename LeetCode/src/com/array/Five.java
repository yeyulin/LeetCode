package com.array;

import java.util.Arrays;

public class Five {
	public int singleNumber(int[] nums) {
		Arrays.sort(nums);
		int length=nums.length;
		for(int i=0;i<length;i=i+2) {
			if(i+1>=length) {
				return nums[i];
			}
			if(nums[i]!=nums[i+1]) {
				return nums[i];
			}
			
		}
		return 0;
	}
	public static void main(String[] args) {
		//
		int []arr= {4,1,2,1,2};
		Five five=new Five();
		System.err.println(five.singleNumber(arr));
	}
}
