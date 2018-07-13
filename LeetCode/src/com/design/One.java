package com.design;

import java.util.Arrays;

/**
 * @Function 打乱一个没有重复元素的数组。
 * @author yeyulin
 * @data 2018/07/13
 *
 */
public class One {
	private int[] array;

	public One(int[] nums) {
		array = nums;
	}

	public int[] reset() {
		return array;
	}

	public int[] shuffle() {
		int[] temp = Arrays.copyOfRange(array, 0, array.length);
		int length = temp.length;
		for (int i = 0; i < length; i++) {
			int second = (int) (Math.random() * (length - i) + i);
			swap(temp, i, second);
		}
		return temp;
	}

	private void swap(int arr[], int first, int second) {
		int i = arr[first];
		arr[first] = arr[second];
		arr[second] = i;
	}

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3 };
		One one = new One(nums);
		int[] shuffle = one.shuffle();
		System.out.println(Arrays.toString(shuffle));

		int[] reset = one.reset();
		System.out.println(Arrays.toString(reset));
		int[] shuffle2 = one.shuffle();
		System.out.println(Arrays.toString(shuffle2));
	}
}
