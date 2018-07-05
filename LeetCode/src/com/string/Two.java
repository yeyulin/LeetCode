package com.string;

/**
 * @Function µßµ¹ÕûÊı
 * @author yeyulin
 * @data 2018/06/11
 *
 */
public class Two {
	public int reverse(int x) {
		String temp=x+"";
		String falg="";
		if(x<0) {
			temp = temp.substring(1, temp.length());
			falg="-";
		}
		char[]array=temp.toCharArray();
		StringBuilder builder=new StringBuilder(array.length);
		//
		for(int i=array.length-1;i>=0;i--) {
			builder.append(array[i]);
		}
		Long long1=Long.parseLong(builder.toString());
		int c=Integer.MAX_VALUE;
		if(long1>c) {
			return 0;
		}
		StringBuilder builder2=new StringBuilder(array.length+1);
		builder2.append(falg).append(builder.toString());
		return Integer.parseInt(builder2.toString());
	}
	public static void main(String[] args) {
		Two two=new Two();
		/*double pow = Math.pow(2,30);
		long va=9646324351L;
		System.out.println(pow);
		if(pow>va) {
			System.out.println("a");
		}
		System.out.println("+9646324351".length());*/
		System.out.println(Integer.MAX_VALUE);
		System.out.println(two.reverse(123));
	}
}
