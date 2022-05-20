package com.oopsprogram;

public class Encap {

	private int salary;
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public static void main(String[] args) {
		Encap e=new Encap();
		e.setSalary(432222);
		System.out.println(e.getSalary());
	}
}
