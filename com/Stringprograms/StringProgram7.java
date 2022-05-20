package com.Stringprograms;

public class StringProgram7 {

	public static void main(String[] args) {
		//
		String s="Java3737373Program33uu300993";
		String s1="";
		//o/p=373737333300993
		//s=s.toLowerCase();
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c>='a'&&c<='z')
			{
				s1=s1+c;
			}else if(c>='A'&&c<='Z') {
				s1=s1+c;
			}
		}
		System.out.println(s1);

	}

}
