package com.tree;

/**
 * @Function 将有序数组转换为二叉搜索树
 * @author yeyulin
 * @data 2018/07/04
 *
 */
public class Five {
	/**
	 * 递归思想，每次找到数组中间的元素为根节点，然后把左边的构建成左子树，右边的构建成右子树。
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
