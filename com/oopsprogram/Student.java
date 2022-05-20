package com.oopsprogram;

public class Student {
String name;
int age;
String sub;
Address adr;
public Student(String name,int age,String sub,Address adr) {
this.name=name;
this.age=age;
this.sub=sub;
this.adr=adr;
}

public void display() {
	System.out.println("[Name="+name+",Age="+age+",Subject="+sub+"]");
	adr.display();
}




}
