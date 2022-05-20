package com.oopsprogram;

 abstract public class Demo {
	 Demo(){
		 System.out.println("Demo constructor");
	 }
//abstract method	 
   abstract public void Test1(); //incomplete method
   abstract public void Test2();
   //complete method or concrete method
   public void Test3() {
	   
   }
}
