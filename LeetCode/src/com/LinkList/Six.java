package com.LinkList;

/**
 * @Function 环形链表
 * @author yeyulin
 * @data 2018/06/28
 * 用快慢指针法，快指针每次移动2步，慢指针每次移动1步。如果有环，快指针会先进入环中，
 * 等slow进入环中就变成了追及问题。每次追一步，一定会相遇，相遇就说明有环。否则，快指针会先到尾部，即没有环。
 */
public class Six {
	public boolean hasCycle(ListNode head) {
		if(head==null || head.next==null) {
			return false;
		}
		ListNode fast=head.next.next;
		ListNode slow=head;
		while(fast!=null) {
			if(fast==slow) {
				return true;
			}
			if(fast.next==null) {
				return false;
			}
			if(fast.next!=null) {
				fast=fast.next.next;
				slow=slow.next;
			}
		}
		return false;
	}
}
