package com.tree;

/**
 * @Function ��������������
 * @author yeyulin
 * @data 2018/06/29
 *
 */
public class One {
	public int maxDepth(TreeNode root) {
		if(root==null) {
			return 0;
		}
		int maxLeft=maxDepth(root.left)+1;
		int maxRight=maxDepth(root.right)+1;
		return max(maxLeft, maxRight);
	}
	private int max(int a,int b) {
		return (a >= b) ? a : b;
	}
}
