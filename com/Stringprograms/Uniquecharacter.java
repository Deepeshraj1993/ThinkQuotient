package com.Stringprograms;

public class Uniquecharacter {

	public static void main(String[] args) {
		String s="Java Developer";
		//o/p=jav Devlopr;
		String s1="Jav";
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(s1.indexOf(c)==-1)
			{
				s1=s1+c;
			}
		}
          System.out.println(s1);
	}

}
