package com.sort;

/**
 * @Function ��һ������İ汾
 * @author yeyulin
 * @data 2018/07/06
 *
 */
public class Two extends VersionControl {
	public int firstBadVersion(int n) {
		int l=1;
		int r=n;
		int mid=l+(r-l)/2;;
		while(l<r) {
			if(isBadVersion(mid)) {
				r=mid;
			}else {
				l=mid+1;
			}
			mid=l+(r-l)/2;
		}
		return l;
	}

	@Override
	boolean isBadVersion(int mid) {
		
		return false;
	}
}
