package com.dynamic;

/**
 * @Function 最大子序和
 * @author yeyulin
 * @data 2018/07/11
 *
 */
public class Three {
	public int maxSubArray(int[] nums) {
		int length = nums.length;
		int ans = 0, max = Integer.MIN_VALUE;
		for (int i = 0; i < length; i++) {
			if (ans < 0) {
				ans = 0;
			}
			ans += nums[i];
			max = Math.max(max, ans);
		}
		return max;
	}

	public int maxSubArray2(int[] nums) {
		int max = nums[0];
		int sum = nums[0];
		for (int i = 1; i < nums.length; i++) {
			if (sum < 0) {
				sum = nums[i];
			} else {
				sum = sum + nums[i];
			}
			if (sum > max) {
				max = sum;
			}
		}
		return max;
	}

	public static void main(String[] args) {
		Three three = new Three();
		int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		int maxSubArray = three.maxSubArray(arr);
		System.out.println(maxSubArray);
	}
}
