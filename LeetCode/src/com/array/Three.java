package com.array;

import java.util.Arrays;

/**
 * @Function
 * @author yeyulin
 * @data 2018/05/29
 *
 */
public class Three {
	public void rotate(int[] nums, int k) {
		int length=nums.length;
		int temp=0;
		for(int i=0;i<k;i++) {
			 temp=nums[length-1];
			for(int j=length-2;j>=0;j--) {
				int tem=nums[j];
				nums[j+1]=tem;
			}
			nums[0]=temp;
		}
	}
	public void rotate2(int[] nums, int k) {
		int length=nums.length;
		int temp=0;
		int otemp=0;
		int ttemp=0;
		for(int i=0;i<k;i++) {
			 temp=nums[length-1];
			for(int j=0;j<length-2;j++) {
				otemp=nums[j];
				ttemp=nums[j+1];
				
				nums[j+1]=otemp;
			}
			nums[0]=temp;
		}
	}
	public static void main(String[] args) {
		Three three=new Three();
		int []arr= {1,2,3,4,5,6,7};
		three.rotate(arr,3);
		System.out.println(Arrays.toString(arr));
		int []arr2= {1,2,3,4,5,6,7};
		three.rotate2(arr2,3);
		System.out.println(Arrays.toString(arr2));
		
	}
}
