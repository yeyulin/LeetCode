package com.dynamic;

/**
 * @Function 打家劫舍 g[i] = max(g[i-1],g[i-2]+nums[i])，即打劫到第i-1家时的最大收益与打劫到第i-2家的最大收益加上打劫第i家获得的金钱(nums[i])。
 * @author yeyulin
 * @data 2018/07/12
 *
 */
public class Four {
	public int rob(int[] nums) {
		int mid = nums.length;
		int value = getValue(nums, 0);
		for (int i = 1; i < mid; i++) {
			value = Math.max(value, getValue(nums, i));
		}
		return value;
	}

	private int getValue(int[] nums, int n) {
		int result = 0;
		for (int i = n; i < nums.length; i += 2) {
			result += nums[i];
		}
		return result;
	}

	public int rob2(int[] nums) {
		int len = nums.length;
		if (len == 0) {
			return 0;
		}
		if (len == 1) {
			return nums[0];
		}
		// g[i-1],g[i-2]
		int result = 0, temp = 0;
		for (int i = 0; i < len; i++) {
			int t = result;
			result = Math.max(result, temp + nums[i]);
			temp = t;
		}

		return result;

	}

	public static void main(String[] args) {
		Four four = new Four();
		int[] arr = { 1, 2 };
		int rob = four.rob(arr);
		System.out.println(rob);
	}
}
