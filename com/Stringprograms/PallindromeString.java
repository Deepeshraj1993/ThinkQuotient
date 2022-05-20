package com.Stringprograms;

public class PallindromeString {

	public static void main(String[] args) {
		String s="Madam";
		System.out.println(isPallindrome(s));
		System.out.println(isPallindrome("java"));
	}

	public static boolean isPallindrome(String s)
	{
		s=s.toLowerCase();//madam
		for(int i=0;i<s.length()/2;i++)
		{
			if(s.charAt(i)!=s.charAt(s.length()-1-i))
			{
				return false;
			}
		}
		return true;
	}
}
