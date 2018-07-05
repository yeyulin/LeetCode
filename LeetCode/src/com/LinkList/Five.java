package com.LinkList;

/**
 * @Function 回文链表
 * @author yeyulin
 * @data 2018/06/27
 *
 */
public class Five {
	public boolean isPalindrome(ListNode head) {
		if (head == null || head.next == null) {
			return true;
		}
		ListNode fast = head;
		ListNode slow = head;
		// 寻找中点
		while (fast.next != null && fast.next.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}
		// 记录第二段链表的第一个节点
		ListNode secondHead = slow.next;
		ListNode p1 = secondHead;
		ListNode p2 = p1.next;
		// 将第一段链表的尾巴置空
		slow.next = null;
		while (p1 != null && p2 != null) {
			ListNode tmp = p2.next;
			p2.next = p1;
			p1 = p2;
			p2 = tmp;
		}
		// 将第二段链表的尾巴置空
		secondHead.next = null;
		while (p1 != null) {
			if (head.val != p1.val)
				return false;
			head = head.next;
			p1 = p1.next;
		}
		return true;
	}
	
	
	 private ListNode reverse(ListNode head) {
	        if (head == null || head.next == null) {
	            return head;
	        }
	        ListNode result = reverse(head.next);
	        head.next.next = head;
	        head.next = null;
	        return result;
	    }

	    public boolean isPalindrome2(ListNode head) {
	        if (head == null || head.next == null) {
	            return true;
	        }
	        int len = 0;
	        ListNode halfRoot = head;
	        while (halfRoot != null) {
	            halfRoot = halfRoot.next;
	            ++len;
	        }
	        if (len % 2 == 0) {
	            len = len / 2;
	        } else {
	            len = (len + 1) / 2;
	        }
	        halfRoot = head;
	        for (int i = 0; i < len; ++i) {
	            halfRoot = halfRoot.next;
	        }
	        halfRoot = reverse(halfRoot);
	        while (halfRoot != null) {
	            if (head.val != halfRoot.val) {
	                return false;
	            }
	            head = head.next;
	            halfRoot = halfRoot.next;
	        }
	        return true;
	    }
	public static void main(String[] args) {
		Five five = new Five();
		ListNode node = new ListNode(1);
		ListNode node2 = new ListNode(2);

		ListNode node3 = new ListNode(2);
		ListNode node4 = new ListNode(1);
		node.next = node2;

		node2.next = node3;
		node3.next=node4;
		boolean palindrome = five.isPalindrome2(node);
		System.out.println(palindrome);
	}
}
