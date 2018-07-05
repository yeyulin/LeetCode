package com.array;

import java.util.Arrays;

/**
 * @Function
 * @author yeyulin
 * @data 2018/06/04
 *
 */
public class Eight {
	public void moveZeroes(int[] nums) {
		Arrays.sort(nums);
		int length=nums.length;
		for(int i=0;i<length;i++) {
			if(nums[i]==0) {
				for(int j=i+1;j<length;j++) {
					if(j+1==length) {
						nums[j]=nums[i];
						break;
					}
					nums[j]=nums[j+1];
				}
			}
		}
	}
	public void moveZeroes2(int[] nums) {
		int k = 0;//[0,k)的元素均为非0  
        
        for(int i =0;i<nums.length;i++){  
            if(nums[i]!=0){  
                if( i != k){//若数组全为0  
                	//此时nums[k]=0
                    int tem = nums[k];  
                    nums[k] = nums[i];  
                    nums[i] = tem;  
                    k++;  
                }else{ //i == k  
                    k++;  
               }  
           }  
        }        
	}
	public static void main(String[] args) {
		int[]arr= {0,1,0,16,12};
		Eight eight=new Eight();
		eight.moveZeroes2(arr);
		System.err.println(Arrays.toString(arr));
	}
}
