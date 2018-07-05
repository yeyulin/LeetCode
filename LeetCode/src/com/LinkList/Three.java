package com.LinkList;

/**
 * @Function 反转链表
 * @author yeyulin
 * @data 2018/06/25
 * 
 *       输入: 1->2->3->4->5->NULL 输出: 5->4->3->2->1->NULL
 *
 */
public class Three {
	public ListNode reverseList(ListNode head) {
		if (head == null) {
			return head;
		}
		ListNode nodeA = head;
		ListNode nodeB = head.next;
		ListNode nodeResult = nodeA; //

		while (nodeB != null) {
			nodeA.next = nodeB.next;
			nodeB.next = nodeResult;
			nodeResult = nodeB;
			nodeB = nodeA.next;
		}

		return nodeResult;
	}

	public ListNode reverseList2(ListNode head) {

		return reverseNodes2(null,head);
	}

	private ListNode reverseNodes(ListNode preNode, ListNode currNode) {
		if (currNode == null) { // 跳出条件
			return preNode;
		}
		ListNode tempNode = currNode.next;

		currNode.next = preNode;

		return reverseNodes(currNode, tempNode);
	}
	private ListNode reverseNodes2(ListNode preNode, ListNode currNode) {
		//preNode 要返回的结果
		//currNode 要截取的链表
		if(currNode==null) {
			return preNode;
		}
		ListNode next = currNode.next;
		currNode.next=preNode;
		return reverseNodes2(currNode,next);
	}

	public static void main(String[] args) {
		Three three = new Three();
		ListNode node = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(4);
		ListNode node5 = new ListNode(5);
		node.next = node2;
		node2.next = node3;
		node3.next=node4;
		node4.next=node5;
		ListNode removeNthFromEnd = three.reverseList2(node);
		System.out.println(removeNthFromEnd);
	}
}
