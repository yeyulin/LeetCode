package com.tree;

/**
 * @Function ��֤����������
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
		//�����ڵ���ڸ��ڵ��ֵ���ؼ�
		if(max!=null && root.val>=max) {
			return false;
		}
		//����ҽڵ�С�ڸ��ڵ��ֵ���ؼ�
		if(min!=null && root.val<=min) {
			return false;
		}
		// �ݹ��ж���������������
		return isValidBST(root.left, root.val, min) && isValidBST(root.right, max, root.val);
	}
	
}
