package com.oopsprogram;

public class Demo1 extends Demo {

	
	
	
	@Override
	public void Test1() {
		System.out.println("Test1 in Demo1");
		
	}

	@Override
	public void Test2() {
		System.out.println("Test2 in Demo1");
		
	}
public static void main(String[] args) {
	Demo d=new Demo1();
	Demo d1=new Demo() {

		@Override
		public void Test1() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void Test2() {
			// TODO Auto-generated method stub
			
		}
		
	};
	d1.Test1();
	d1.Test2();
	d.Test2();
	
	System.out.println(Browser.name);
}
}
