package com.string;

/**
 * @Function
 * @author yeyulin
 * @data 2018/06/09
 *
 */
public class One {
	public String reverseString(String s) {
		
		char[] charArray = s.toCharArray();
		int length=charArray.length-1;
		StringBuilder stringBuilder=new StringBuilder();
		for(int i=length;i>=0;i--) {
			stringBuilder.append(charArray[i]);
		}
		return stringBuilder.toString();
	}
}
