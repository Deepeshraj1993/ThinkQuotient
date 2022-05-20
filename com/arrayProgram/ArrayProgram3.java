package com.arrayProgram;

public class ArrayProgram3 {

	public static void main(String[] args) {
		int[] ar= {2,4,23,20,29,72,9,73,65};
		//o/p--73
		int bigger=0;//29
		for(int a:ar)
		{
			if(bigger<a)
			{
				bigger=a;
			}
		}
		System.out.println("Bigger:-"+bigger);

	}

}
