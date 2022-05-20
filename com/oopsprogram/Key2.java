package com.oopsprogram;

public class Key2 extends Key1 {
	public void keyword12() {
		System.out.println("Keyword12 in Key2 class");
	}
	public void keyword123() {
		System.out.println("Keyword123 in Key class");
	}

	public static void main(String[] args) {
		Key1 k1=new Key1();
		k1.keyword1();
		Key2 k2 =new Key2();
		k2.keyword12();
	Key1 k3=new Key2();//Upcasting in java
         k3.keyword12();//overridden method  implemtation called based instance type
	     
         //Downcasting in java
         if(k3 instanceof Key2)
         {
        	    Key2 k=(Key2)k3;
        	    k.keyword123();
         }
	
	}

}
