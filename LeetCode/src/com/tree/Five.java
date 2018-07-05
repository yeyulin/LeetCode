package com.tree;

/**
 * @Function ����������ת��Ϊ����������
 * @author yeyulin
 * @data 2018/07/04
 *
 */
public class Five {
	/**
	 * �ݹ�˼�룬ÿ���ҵ������м��Ԫ��Ϊ���ڵ㣬Ȼ�����ߵĹ��������������ұߵĹ�������������
	 */
	public TreeNode sortedArrayToBST(int[] nums) {
		TreeNode root = sortedArrayToBST(nums, 0, nums.length);
		return root;
	}

	private TreeNode sortedArrayToBST(int[] nums, int start, int end) {
		if (start > end) {
			return null;
		}
		int mid = start + (end - start) / 2;
		TreeNode root = new TreeNode(nums[mid]);
		root.left = sortedArrayToBST(nums, start, mid - 1);
		root.right = sortedArrayToBST(nums, mid + 1, end);
		return root;
	}
}
