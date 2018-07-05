package com.LinkList;

/**
 * @Function 删除链表的倒数第N个节点
 * @author yeyulin
 * @data 2018/06/22
 *
 */
public class Two {
	public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode p = head;
		ListNode q = head;
		int count=0;
		while(head.next!=null) {
			 head = head.next;
			count++;
		}
		System.out.println(count+1);
		for (int i = 0; i < n; i++) {
			p = p.next;
			System.out.println( p);
		}
		System.out.println(head);
		System.out.println(q);
		if (p == null) {
			head = head.next;
			return head;
		}
		while (p.next != null) {
			p = p.next;
			q = q.next;
		}
		
		System.out.println( q.next.next);
		System.out.println( q.next);
		System.out.println(head);
		q.next = q.next.next;
		System.out.println( q);
		System.out.println(head);
		return head;
	}
	public static void main(String[] args) {
		Two two=new Two();
		ListNode node=new ListNode(1);
		ListNode node2=new ListNode(2);
		ListNode node3=new ListNode(3);
		ListNode node4=new ListNode(4);
		ListNode node5=new ListNode(5);
		node.next=node2;
		node2.next=node3;
		node3.next=node4;
		node4.next=node5;
		ListNode removeNthFromEnd = two.removeNthFromEnd(node,4);
		System.out.println(removeNthFromEnd);
	}
}
