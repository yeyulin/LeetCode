package com.sort;

/**
 * @Function 合并两个有序数组
 * @author yeyulin
 * @data 2018/07/05
 *
 */
public class One {
	public void merge(int[] nums1, int m, int[] nums2, int n) {
		int i=m-1;
		int j=n-1;
		int index=m+n-1;
		//先当两个数组都有元素的时候填充大的到末尾，如果有一个数组的数用完了，说明剩下的那个数组的所有数都小于当前填充的位置
		while(i>=0 && j>=0) {
			nums1[index--]=nums1[i]>nums2[j]?nums1[i--]:nums2[j--];
		}
		//如果是第一个数组用完了，说明剩下的(最小的那些)全是数组2，把数组2填充进去就好了  
		// 如果是第二个数组用完了，说明剩下的全是数组1，不用填充了，他们已经在了 不考虑这种情况
		while(j>=0) {
			nums1[index--]=nums2[j--];
		}
	}
	public static void main(String[] args) {
	int arr	[1,2,3,0,0,0]
				3
				[2,5,6]
	}
}
