package com.LinkList;

/**
 * @Function 删除链表中的节点
 * @author yeyulin
 * @data 2018/06/22
 *
 */
public class One {
	public void deleteNode(ListNode node) {
		node.val = node.next.val;
		node.next = node.next.next;
	}
}
