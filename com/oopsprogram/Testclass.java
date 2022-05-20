package com.oopsprogram;

public class Testclass {

	public static void main(String[] args) {
		Address ad=new Address("Bangalore","Karnataka","India");
		Student s=new Student("Shyam", 23,"Science", ad);
		//System.out.println(s);
		s.display();
		

	}

}
