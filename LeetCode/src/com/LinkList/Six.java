package com.LinkList;

/**
 * @Function ��������
 * @author yeyulin
 * @data 2018/06/28
 * �ÿ���ָ�뷨����ָ��ÿ���ƶ�2������ָ��ÿ���ƶ�1��������л�����ָ����Ƚ��뻷�У�
 * ��slow���뻷�оͱ����׷�����⡣ÿ��׷һ����һ����������������˵���л������򣬿�ָ����ȵ�β������û�л���
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
