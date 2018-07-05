package com.string;

/**
 * @Function 最长公共前缀
 * @author yeyulin
 * @data 2018/06/20
 *
 */
public class Nine {
	public String longestCommonPrefix(String[] strs) {
		String s="";
		if(strs==null) {
			return s;
		}
		int length = strs.length;
		if(length==0) {
			return s;
		}
		String low =strs[0];
		for (int i = 1; i < length ; i++) {
			low = Just(low, strs[i]);
		}
		char[] charArray = low.toCharArray();
		boolean flag = false;
		StringBuilder builder = new StringBuilder();
		builder.append(s);
		for (int i = 0; i < charArray.length; i++) {
			char temp = charArray[i];
			flag = false;
			for (int j = 0; j < length; j++) {
				if (temp != strs[j].charAt(i)) {
					flag = true;
					break;
				}
			}
			if(flag) {
				break;
			}
			builder.append(temp);
		}
		return builder.toString();
	}

	public String Just(String one, String two) {
		return compareTo(one, two) > 0 ? two : one;
	}

	public int compareTo(String string, String anotherString) {
		int len1 = string.length();
		int len2 = anotherString.length();
		if (len1 < len2) {
			return -1;
		}
		if(len1 >len2) {
			return 1;
		}
		int lim = Math.min(len1, len2);
		char v1[] = string.toCharArray();
		char v2[] = anotherString.toCharArray();

		int k = 0;
		while (k < lim) {
			char c1 = v1[k];
			char c2 = v2[k];
			if (c1 != c2) {
				return c1 - c2;
			}
			k++;
		}
		return len1 - len2;
	}

	public static void main(String[] args) {
		String[] strs = { "flower", "flow", "flight" };
		//	String[]  strs= {"c","acc","ccc"};
		//	String[]  strs= {"aac","ab"};
		//	String[]  strs= {"","cbc","c","ca"};
		//	String[]  strs= {"aa","a"};
		//	String[] strs = {"aca","cba"};
		Nine nine = new Nine();
		String longestCommonPrefix = nine.longestCommonPrefix(strs);
		System.out.println(longestCommonPrefix);
	}
}
