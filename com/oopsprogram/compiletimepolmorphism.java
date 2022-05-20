package com.oopsprogram;

public class compiletimepolmorphism {
	
	static void m1() {
		System.out.println("m1 with no parmas");
	}
	static void m1(int a) {
		System.out.println("m1 with in parmas");
	}
	static void m1(double d,String s)
	{
		System.out.println("m1 with double and string parmas");
	}
	
	

	public static void main(String[] args) {
		m1();
		m1(87);
       m1(82872.72,"Demo");
	}

}
