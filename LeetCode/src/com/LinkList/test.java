package com.LinkList;

/**
 * @Function
 * @author yeyulin
 * @data 2018/06/27
 *
 */
public class test {
	private void  textNode(ListNode node) {
		ListNode nodeN=node;
		nodeN.next=new ListNode(10000,null);
		ListNode nodeW=nodeN.next;
		ListNode nodeQ=nodeW;
		nodeW.next=new ListNode(230,null);
	
		System.out.println("node"+node);
		System.out.println("nodeN"+nodeN);
		System.out.println("nodeW"+nodeW);
	
		System.out.println("nodeQ"+nodeQ);
		
	}
	public static void main(String[] args) {
		test test=new test();
		ListNode node=new ListNode(1);
		ListNode node2=new ListNode(2);
		ListNode node3=new ListNode(3);
		node.next=node2;
		node2.next=node3;
		test.textNode(node);
	}
}
