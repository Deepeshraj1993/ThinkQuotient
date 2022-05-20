package com.Stringprograms;

public class countofcharacter {

	public static void main(String[] args) {
		String s="Java Developer";
		//java Dvlopr-14-11=3
		//o/p=e-3
		System.out.println(getcount(s,'e'));
		System.out.println(getcount(s,'a'));
		System.out.println(getcount(s,'l'));
		System.out.println(getcount(s,'b'));

	}
	
	public static int getcount(String s,char c) {
		return s.length()-s.replace(c+"","").length();
	}

}
