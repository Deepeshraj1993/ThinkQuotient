package com.arrayProgram;

public class ArrayProgram1 {

	public static void main(String[] args) {
		//int a=27262;
         //Syntax to create Array
		int[] ar=new int[4];
		ar[0]=43;
		ar[1]=33;
		ar[2]=22;
		ar[3]=82;
		System.out.println(ar);
		/*
		 * for(int i=0;i<ar.length;i++) { System.out.println(ar[i]); }
		 */
	//for each loop
		//Syntax
		 
		   for(int a:ar)
		   {
			 System.out.println(a);  
		   }
		    
		
		
		
	}

}
