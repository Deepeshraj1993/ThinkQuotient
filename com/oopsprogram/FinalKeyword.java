package com.oopsprogram;

public  class FinalKeyword {
	
	public final int a = 0;
	//final method can be inherited but can be overridden 
	final public void Test1() {
		System.out.println("Test method");
	}

	public static void main(String[] args) {
		FinalKeyword f=new FinalKeyword();
		//f.a=3456;
           System.out.println(f.a);
	}

}
