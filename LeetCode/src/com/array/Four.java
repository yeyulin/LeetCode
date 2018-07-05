package com.array;

/**
 * @Function
 * @author yeyulin
 * @data 2018/05/30
 *
 */
public class Four {
	public boolean containsDuplicate(int[] nums) {
		int temp;
		for(int i=0;i<nums.length;i++){
			temp=nums[i];
			for(int j=i+1;j<nums.length;j++) {
				if(temp==nums[j]) {
					return true;
				}
			}
		}
		return false;

	}
	public static void main(String[] args) {
		
	}
}
