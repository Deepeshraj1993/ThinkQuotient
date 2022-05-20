package com.Stringprograms;

public class StringProgram6 {

	public static void main(String[] args) {
		
		//to reverse the String
		String s="Manual Tester";
		String s1="";
		//o/p-retseT launaM
		int n=s.length()-1;
		for(int i=n;i>=0;i--)
		{
			char c=s.charAt(i);
			s1+=c;
		}
          System.out.println(s1);
	}

}
