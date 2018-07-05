package com.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @Function 二叉树的层次遍历
 * @author yeyulin
 * @data 2018/07/03
 *
 */
public class Four {
	public List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>>lists=new LinkedList<>();
		if(root==null) {
			return lists;
		}
		Queue<TreeNode>queue=new LinkedList<>();
		queue.offer(root);
		TreeNode treeNode;
		while(!queue.isEmpty()) {
			int size = queue.size();
			List<Integer>list=new LinkedList<>();
			for(int i=0;i<size;i++) {
				treeNode = queue.poll();
				list.add(treeNode.val);
				if(treeNode.left!=null) {
					queue.offer(treeNode.left);
				}
				if(treeNode.right!=null) {
					queue.offer(treeNode.right);
				}
			}
			lists.add(list);
		}
		return lists;
	}
}
