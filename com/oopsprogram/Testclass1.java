package com.oopsprogram;

public class Testclass1 {

	public static void main(String[] args) {
		//Polymorphism in java
		Animal a1,a2,a3;
		a1=new Animal();
		a1.make_sound();
            a2=new Dog();//Upcasting
             a2.make_sound();//Dog class method
             a3=new cat();
             a3.make_sound();//cat class method
	}

}
