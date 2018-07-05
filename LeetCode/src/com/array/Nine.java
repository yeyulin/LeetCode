package com.array;

import java.util.Arrays;

/**
 * @Function
 * @author yeyulin
 * @data 2018/06/06
 *
 */
public class Nine {
	public int[] twoSum(int[] nums, int target) {
		int length=nums.length;
		int []arr=new int[2];
		for(int i=0;i<length;i++) {
			for(int j=i+1;j<length;j++) {
				if(nums[i]+nums[j]==target) {
					arr[0]=i;
					arr[1]=j;
					return arr;
				}
			}
		}
		return arr;
	}
	public static void main(String[] args) {
		Nine nine=new Nine();
		int[] nums = {3,2,4};
		int target = 6;
		System.out.println(Arrays.toString(nine.twoSum(nums, target)));
	}
}
