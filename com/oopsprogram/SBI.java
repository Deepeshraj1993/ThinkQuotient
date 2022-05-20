package com.oopsprogram;

//Inheritance in java(Parent(Super)-child(Subclass) relation or is a relationship)
public class SBI extends RBI {
	// Method Overriding in java
	
	protected    void interest_rate() 
	  { 
		  System.out.println("Interest rate 9%");
		  }
	 
public static void main(String[] args) {
	SBI s=new SBI();
	s.interest_rate();
}
}
