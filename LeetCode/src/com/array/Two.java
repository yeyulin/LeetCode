package com.array;

/**
 * @Function
 * @author yeyulin
 * @data 2018/05/25
 *
 */
public class Two {
	public int maxProfit(int[] prices) {
	      int profits = 0;  
	      int length=prices.length;
	       for(int i=0;i<length-1;i++){
	    	   int temp=prices[i+1]-prices[i];
	    	   if(temp>0) {
	    		   profits+=temp;
	    	   }
	       }
		return profits;
	 }
	public static void main(String[] args) {
		
	}
}
