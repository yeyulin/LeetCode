package com.string;

import java.util.Random;

import org.apache.commons.lang3.StringUtils;

/**
 * @Function 给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。
 * @author yeyulin
 * @data 2018/06/12
 *
 */
public class Three {
	public int firstUniqChar(String s) {
		char[] charArray = s.toCharArray();
		if(charArray.length==0) {
			return -1;
		}
		int length=charArray.length-1;
		for(int i=0;i<length;i++) {
			char temp=charArray[i];
			int index=i;
			int noExis=i;
			for(int j=i+1;j<=length;j++) {
				if(temp==charArray[j]) {
					noExis++;
					break; 
				}
				index++;
				if(index==length) {
					return i;
				}
			}
			if(noExis==length) {
				return -1;
			}
		}
		return 0;
	}
	public int firstUniqChar2(String s) {
		if(s.length()==1) {
			return 0;
		}
		char[] charArray = s.toCharArray();
		int length=charArray.length;
		for(int i=0;i<length;i++) {
			char temp=charArray[i];
			int index=0;
			for(int j=0;j<length;j++) {
				if(i==j) {
					continue;
				}
				if(temp==charArray[j]) {
					index++;
					break; 
				}
			}
			if(index==0) {
				return i;
			}
		}
		return -1;
	}
	public int getIndex(String str){
	    for (int i= 0; i<str.length();i++){
	        int count = getCount(str, str.charAt(i));
	        if(count == 1){
	            return  str.indexOf(str.charAt(i));
	        }
	    }
	    return  -1;
	}

	public int getCount(String str, char ch){
	    int count = 0;
	    for (int i = 0; i < str.length(); i++) {
	        if (ch == str.charAt(i)) {
	            count++;
	        }
	    }
	    return count;
	}
	public static void main(String[] args) {
		Three three=new Three();
		String s = "leetcode";
		s = "loveleetcode";
		s="";
		s="aa";
		String base="abcdefghijklmnopqrstuvwxyz";
		StringBuilder builder=new StringBuilder(100000);
		Random random=new Random();
		for(int i=0;i<100000;i++) {
			int number=random.nextInt(base.length()-1);
			builder.append(base.charAt(number));
		}
		String test=builder.toString();
		System.out.println(three.firstUniqChar2(test));
		System.out.println(three.getIndex(test));
	}
}
