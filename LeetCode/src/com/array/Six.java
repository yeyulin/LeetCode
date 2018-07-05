package com.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Function
 * @author yeyulin
 * @data 2018/06/01
 *
 *       ��������������Ȼ�������������ֱ���������������ʼλ�ã�������������������������ȣ������ִ������У���������������1�������һ����������������ִ���ڶ�����������1����֮��Ȼ��
 */
public class Six {
	public int[] intersect(int[] nums1, int[] nums2) {
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		int ilength = nums1.length;
		int jlength = nums2.length;
		List<Integer> list = new ArrayList<>();
		int i = 0;
		int j = 0;
		while (i < ilength && j < jlength) {
			if (nums1[i] == nums2[j]) {
				list.add(nums1[i]);
				i++;
				j++;
			} else if (nums1[i] > nums2[j]) {
				j++;
			} else {
				i++;
			}
		}
		int[] result = new int[list.size()];
		for (int l = 0; l < list.size(); l++) {
			result[l] = list.get(l);
		}
		return result;
	}
}
