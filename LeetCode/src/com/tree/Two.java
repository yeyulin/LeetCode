package com.tree;

/**
 * @Function 验证二叉搜索树
 * @author yeyulin
 * @data 2018/06/30
 *
 */
public class Two {
	public boolean isValidBST(TreeNode root) {
		return isValidBST(root, null, null);
	}
	private boolean isValidBST(TreeNode root,Integer max,Integer min) {
		if(root==null) {
			return true;
		}
		//如果左节点大于父节点的值返回假
		if(max!=null && root.val>=max) {
			return false;
		}
		//如果右节点小于父节点的值返回假
		if(min!=null && root.val<=min) {
			return false;
		}
		// 递归判断左子树和右子树
		return isValidBST(root.left, root.val, min) && isValidBST(root.right, max, root.val);
	}
	
}
