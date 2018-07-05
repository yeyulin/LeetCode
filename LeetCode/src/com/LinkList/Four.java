package com.LinkList;

/**
 * @Function 合并两个有序链表
 * @author yeyulin
 * @data 2018/06/26
 *
 */
public class Four {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if (l1 == null && l2 == null) {
			return l1;
		}
		// 维护两个链表下标，dummy代表只添加，curNode 代表当前使用链表
		// 将两个链表小的数值放入到新的链表
		ListNode dummy = new ListNode(0);
		ListNode curNode = dummy;
		while (l1 != null && l2 != null) {
			if (l1.val <= l2.val) {
				curNode.next = l1;
				l1 = l1.next;
			} else {
				curNode.next = l2;
				l2 = l2.next;
			}
			curNode = curNode.next;
		}
		curNode.next = (l1 != null) ? l1 : l2;
		return dummy.next;
	}

	public ListNode mergeTwoLists2(ListNode l1, ListNode l2) {
		if (l1 == null) {
			return l2;
		}
		if (l2 == null) {
			return l1;
		}

		ListNode mergedHead = null;
		if (l1.val <= l2.val) {
			mergedHead = l1;
			mergedHead.next = mergeTwoLists2(l1.next, l2);
		} else {
			mergedHead = l2;
			mergedHead.next = mergeTwoLists2(l1, l2.next);
		}
		return mergedHead;
	}

	public ListNode mergeTwoLists3(ListNode l1, ListNode l2) {
		if (l1 == null) {
			return l2;
		}
		if (l2 == null) {
			return l1;
		}
		ListNode dummy = new ListNode(0);
		ListNode curNode = dummy;
		while (l1 != null && l2 != null) {
			// 得到当前数值较小的链表
			if (l1.val <= l2.val) {
				curNode.next = l1;
				l1 = l1.next;
			} else {
				curNode.next = l2;
				l2 = l2.next;
			}
			// 保存当前链表，继续下一的节点
			curNode = curNode.next;
		}
		// 这时链表不为null的链表是最大的直接保存到curNode的下一个节点
		curNode.next = (l1 != null) ? l1 : l2;
		// 此时dummy.next节点就是结果
		return dummy.next;
	}

	public ListNode mergeTwoLists4(ListNode l1, ListNode l2) {
		if (l1 == null) {
			return l2;
		}
		if (l2 == null) {
			return l1;
		}
		if (l1.val < l2.val) {
			l1.next = mergeTwoLists4(l1.next, l2);
			return l1;
		} else {
			l2.next = mergeTwoLists4(l1, l2.next);
			return l2;
		}
	}

	public static void main(String[] args) {
		Four four = new Four();
		ListNode node = new ListNode(1);
		ListNode node2 = new ListNode(10);

		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(4);
		node.next = node2;

		node3.next = node4;
		ListNode mergeTwoLists2 = four.mergeTwoLists4(node, node3);
		System.out.println(mergeTwoLists2);
	}
}
