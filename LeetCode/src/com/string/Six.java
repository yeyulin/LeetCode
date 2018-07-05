package com.string;

/**
 * @Function 实现 atoi，将字符串转为整数。
 * @author yeyulin
 * @data 2018/06/15
 *
 */
public class Six {
	public int myAtoi(String str) {
		String z="+";
		String j="-";
		str = str.trim();
		if(str.length()==0) {
			return 0;
		}
		char[] charArray = str.toCharArray();
		int INT_MIN=Integer.MIN_VALUE;
		int INT_MAX =Integer.MAX_VALUE ;
		StringBuilder builder=new StringBuilder(charArray.length);
		if(charArray[0]=='+' || charArray[0]=='-' || (charArray[0]>='0' && charArray[0]<='9')) {
			builder.append(charArray[0]);
			for(int i=1;i<charArray.length;i++) {
				if(charArray[i]>='0' && charArray[i]<='9') {
					builder.append(charArray[i]);
				}else {
					break;
				}
			}
			String string = builder.toString();
			if(string.equals(z) || string.equals(j)) {
				return 0;
			}
			double parseDouble = Double.parseDouble(string);
			if(parseDouble>INT_MAX) {
				return INT_MAX;
			}
			if(parseDouble<INT_MIN) {
				return INT_MIN;
			}
			return (int)parseDouble;
		}
		return 0;
	}
	public static void main(String[] args) {
		Six six=new Six();
		String str="42";
		str="   -42";
		str="4193 with words";
		str="words and 987";
		str="-91283472332";
		str="";
		str="+";
		str="--";
		str="20000000000000000000";
		int myAtoi = six.myAtoi(str);
		System.err.println(myAtoi);
	}
}
