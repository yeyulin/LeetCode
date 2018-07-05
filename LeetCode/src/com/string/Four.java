package com.string;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @Function
 * @author yeyulin
 * @data 2018/06/13
 *
 */
public class Four {
	boolean anagramSolution1(String s1,String s2)
	{
	    if(s1.length()!=s2.length())
	        return false;
		char[]sArray=s1.toCharArray();
		char[]tArray=s2.toCharArray();
	    boolean stillOk=true;
		for (int i = 0; i < sArray.length && stillOk;i++)
	    {
	    	boolean found=false;
	        for(int j=0;j<tArray.length&&!found;j++)
	        {
	            if(tArray[j]==sArray[i])
	            {
	            	tArray[j]=0;
	                found=true;
	            }
	        }
	        if(found)
	        {
	            stillOk=true;
	        }
	        else
	        {
	            stillOk=false;
	        }
	    }
	    return stillOk;
	}
	public boolean isAnagram(String s, String t) {
		if(s.equals(t)) {
			return true;
		}
		if(s.length()!=t.length()) {
			return false;
		}
		char[]sArray=s.toCharArray();
		char[]tArray=t.toCharArray();
		int length=s.length();
		int[]sA=new int[26];
		int[]sT=new int[26];
		for(int i=0;i<sArray.length;i++) {
			sA[sArray[i]-'a']++;
		}
		for(int i=0;i<tArray.length;i++) {
			sT[tArray[i]-'a']++;
		}
		for(int i=0;i<length;i++) {
			if(sA[sArray[i]-'a']!=sT[sArray[i]-'a']) {
				return false;
			}
		}
		return true;
	}
	private void getIndex(String str){
		byte[] bytes = str.getBytes();
		for (int i = 0; i < bytes.length; i++) {
			byte b = bytes[i];
			System.out.println(b);
		}
	}
	public static void main(String[] args) {
		String s="aad";
		String t="cab";
		
		Four four=new Four();
		boolean anagram = four.isAnagram(s, t);
		System.out.println(anagram);
		boolean anagram1=four.anagramSolution1(s,t);
		System.out.println(anagram1);
		four.getIndex("z");
	}
}
