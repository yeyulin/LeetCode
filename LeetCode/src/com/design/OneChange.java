package com.design;

import java.util.Random;

/**
 * @Function
 * @author yeyulin
 * @data 2018/07/13
 *
 */
public class OneChange {
	private int[] array;

	public OneChange(int[] nums) {
		array = nums;
	}

	public int[] reset() {
		return array;
	}

	public int[] shuffle() {
		int length = array.length;
		int[] temp = new int[length];
		System.arraycopy(array, 0, temp, 0, length);
		Random random=new Random();
		for (int i = 0; i < length; i++) {
			int second = random.nextInt(length-i)+i;
			int t = temp[i];
			temp[i] = temp[second];
			temp[second] = t;
		}
		return temp;
	}
}
