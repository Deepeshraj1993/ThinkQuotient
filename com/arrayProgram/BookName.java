package com.arrayProgram;

public class BookName {

	public static void main(String[] args) {
	Book[] b1=new Book[4];
	b1[0]=new Book("Testing");
     b1[1]=new Book("java");
     b1[2]=new Book(".net");
     b1[3]=new Book("Data Science");
     for(Book b:b1) {
    	 System.out.println(b.toString());
     }
	}

}
class Book{
	String title;
	public Book(String title) {
	this.title=title;
	}
	
	public String toString() {
		return "Titlt:-"+title;
	} 
	
	
	
	
}