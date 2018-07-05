package com.array;

import java.util.Arrays;

/**
 * @Function
 * @author yeyulin
 * @data 2018/06/02
 *
 */
public class Seven {
	 public int[] plusOne(int[] digits) {
         int n = digits.length;
         for(int i=n-1;i>=0;i--) {
        	 if(digits[i]<9) {
        		 digits[i]++;
        		 return digits;
        	 }
        	 digits[i]=0;
         }
         int[] result = new int[n+1];
         result[0] = 1;
		return result;
     }
	 public static void main(String[] args) {
		 int[]digits= {4,3,2,9};
		 int[]digits2= {9,9,9};
		 Seven seven=new Seven();
		 System.out.println(Arrays.toString(seven.plusOne(digits2)));
	}
}
