package com.oopsprogram;






//Method Hiding in java

public class Hidingclass2 extends Hidingclass {
	static void m1() {
		System.out.println("static method m1 Hidingclass2");
	}
	static void m2() {
		System.out.println("static method m1 Hidingclass2");
	}

public static void main(String[] args) {
	Hidingclass2 h=new Hidingclass2();
	h.m1();
}

}
