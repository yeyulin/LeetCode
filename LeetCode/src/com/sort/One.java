package com.sort;

/**
 * @Function �ϲ�������������
 * @author yeyulin
 * @data 2018/07/05
 *
 */
public class One {
	public void merge(int[] nums1, int m, int[] nums2, int n) {
		int i=m-1;
		int j=n-1;
		int index=m+n-1;
		//�ȵ��������鶼��Ԫ�ص�ʱ������ĵ�ĩβ�������һ��������������ˣ�˵��ʣ�µ��Ǹ��������������С�ڵ�ǰ����λ��
		while(i>=0 && j>=0) {
			nums1[index--]=nums1[i]>nums2[j]?nums1[i--]:nums2[j--];
		}
		//����ǵ�һ�����������ˣ�˵��ʣ�µ�(��С����Щ)ȫ������2��������2����ȥ�ͺ���  
		// ����ǵڶ������������ˣ�˵��ʣ�µ�ȫ������1����������ˣ������Ѿ����� �������������
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
