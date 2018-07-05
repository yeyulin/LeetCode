package com.tree;

/**
 * @Function ¶Ô³Æ¶þ²æÊ÷
 * @author yeyulin
 * @data 2018/07/02
 *
 */
public class Three {
	public boolean isSymmetric(TreeNode root) {
		if(	root==null) {
			return true;
		}
		return isSymmetric(root.right, root.left);
	}

	private boolean isSymmetric(TreeNode right, TreeNode left) {
		if (right == null && left == null) {
			return true;
		}
		if (right == null || left == null) {
			return false;
		}

		if (left != null && right != null) {
			if (left.val != right.val) {
				return false;
			}
			return isSymmetric(left.left, right.right) && isSymmetric(left.right, right.left);
		}
		return false;
	}
}
