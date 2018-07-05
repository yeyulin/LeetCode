package com.string;

/**
 * @Function 给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
 * @author yeyulin
 * @data 2018/06/14
 *
 */
public class Five {
	public boolean isPalindrome(String s) {
		String lowerCase = s.toLowerCase();
		System.out.println("lowerCase "+lowerCase);
		StringBuilder builder=new StringBuilder(lowerCase);
		StringBuilder reverse = builder.reverse();
		String string = reverse.toString();
		System.out.println("string "+string);
		if(lowerCase.equals(string)) {
			return true;
		}
		return false;
	}
	public boolean isPalindrome2(String s) {
		String lowerCase = s.toLowerCase();
		int startIndex=0;
		int endIndex=s.length()-1;
		char[] charArray = lowerCase.toCharArray();
		while(startIndex<endIndex) {
			char preChar=charArray[startIndex];
			char aftChar=charArray[endIndex];
			if(!((preChar>='a' && preChar<='z') || (preChar>='0' && preChar<='9'))) {
				startIndex++;
				continue;
			}
			if(!((aftChar>='a' && aftChar<='z') || (aftChar>='0' && aftChar<='9'))) {
				endIndex--;
				continue;
			}
			if(preChar!=aftChar){
				return false;
			}
			startIndex++;
			endIndex--;
		}
		return true;
	}
	public static void main(String[] args) {
		String s="0P";
		Five five=new Five();
		boolean palindrome = five.isPalindrome2(s);
		System.out.println(palindrome);
		
	}
}
