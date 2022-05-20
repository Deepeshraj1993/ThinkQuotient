package com.Stringprograms;

public class reverseusinfstringbuilder {

	public static void main(String[] args) {
		System.out.println(reversestring("java Program"));

	}

	public static String reversestring(String s) {
		StringBuilder sb=new StringBuilder();
		//StringBuffer sb1=new StringBuffer();
		 //ThreadSafe or Synchronised
		for(int i=s.length()-1;i>=0;i--)
		{
			sb.append(s.charAt(i));
		}
		return sb.toString();
	}
	
	
}
