package com.arrayProgram;

public class Lineaserachprogram {

	public static void main(String[] args) {
		int [] arr= {2,5,83,47,44,38,93,37,94,74,92,67,68};
		System.out.println(linearsearchforelement(arr,74));
		System.out.println(linearsearchforelement(arr,99));

	}

	private static int linearsearchforelement(int[] arr, int ele) {
	 for(int i=0;i<arr.length;i++)
	 {
		  if(arr[i]==ele) {
			  return i; 
		  }
	  }
		
	 return -1;
	}
	

}
