package com.array;

/**
 * @Function
 * @author yeyulin
 * @data 2018/05/24
 *
 */
public class One {
    public int removeDuplicates(int[] nums) {
    	int length=nums.length;
    	if(length==0) {
    		return 0;
    	}
    	int number=0;
    	for(int i=0;i<length;i++) {
    		if(nums[i]!=nums[number]) {
    			number++;
    			nums[number]=nums[i];
    		}
    	}
    	number+=1;
		return number;
    }
    public static void main(String[] args) {
    	One lt = new One();  
        int []num = {1,2,2,3};  
        System.out.println(lt.removeDuplicates(num));  
	}
}
