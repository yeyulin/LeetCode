package com.string;

/**
 * @Function 实现strStr()
 * @author yeyulin
 * @data 2018/06/15
 *
 */
public class Seven {
	public int strStr(String haystack, String needle) {
		if (needle.length() == 0) {
			return 0;
		}
		if (haystack.length() < needle.length()) {
			return -1;
		}
		char[] haystackArray = haystack.toCharArray();
		char[] needleArray = needle.toCharArray();
		int length = haystackArray.length;
		int nlength = needleArray.length;
		int index = 0;
		for (int i = 0; i < length; i++) {
			index = i;
			if (needleArray[0] == haystackArray[i]) {
				if (i + nlength > length) {
					return -1;
				}
				for (int j = 0; j < nlength && i < length; j++) {
					if (needleArray[j] != haystackArray[i++]) {
						return -1;
					}
				}
				return index;
			}

		}
		return -1;
	}
	public int strStr2(String haystack, String needle) {
		for (int i = 0;; i++) {
			for (int j = 0;; j++) {
				// 1. 当找到匹配的串
				if (j == needle.length())
					return i;
				// 3. `haystack`和`needle`同时遍历完毕，还未找到匹配的串。
				if (i + j == haystack.length())
					return -1;
				// 2. 遍历过程中存在不相同的字符时，从新取`haystack`的子串进行匹配
				if (needle.charAt(j) != haystack.charAt(i + j))
					break;
			}
		}
	}
	public int strStr3(String haystack, String needle) {
        if (haystack.length() == 0) {
            if (needle.length() == 0) {
                return 0;
            } else {
                return -1;
            }
        }
        if (needle.length() == 0) {
            return 0;
        }
        int m = haystack.length();
        int n = needle.length();
        if (m < n) {
            return -1;
        }
        for (int i = 0; i <= m - n; i ++) {
            int j = 0;
            for (j = 0; j < n; j ++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    break;
                }
            }
            if (j == n) {
                return i;
            }
        }
        return -1;
    }
	public static void main(String[] args) {
		Seven seven = new Seven();
		String haystack = "bbaa";
		String needle = "aab";
		haystack = "hello";
		needle = "ll";
		haystack = "mississippi";
		needle = "issip";
		System.out.println(haystack.indexOf(needle));
		int strStr = seven.strStr(haystack, needle);
		System.out.println(strStr);
		int strStr2 = seven.strStr2(haystack, needle);
		System.out.println(strStr2);
		int strStr3 = seven.strStr3(haystack, needle);
		System.out.println("strStr3:"+strStr3);
	}
}
