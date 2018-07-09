package com.dynamic;

/**
 * @Function ÅÀÂ¥Ìİ
 * @author yeyulin
 * @data 2018/07/09
 *
 */
public class One {
	public int climbStairs(int n) {
		if (n == 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		}
		if (n == 2) {
			return 2;
		}
		return climbStairs(n - 1) + climbStairs(n - 2);
	}

	public int climbStairs2(int n) {
		if (n == 1) {
			return 1;
		}
		if (n == 2) {
			return 2;
		}
		int n1=1,n2=2;
		int result = 0;
		for(int i=2;i<n;i++) {
			result=n1+n2;
			//½»»»Öµ¼ÌĞøÀÛ¼Ó
			n1=n2;
			n2=result;
			
		}
		return result;
	}
}
