package com.arrayProgram;

import java.util.Arrays;

public class ArrayProgram5 {

	public static void main(String[] args) {
		int[] ar= {2,5,7,9,13,17,19,24,29,32,55,65,87,92,103,113};//Sorted Array
          //int i= Arrays.binarySearch(ar, 92);
		int i=Binarysearchforele(ar,65);
          System.out.println(i);
          System.out.println(Binarysearchforele(ar,33));
          System.out.println(Binarysearchforele(ar,9));
	}

	private static int  Binarysearchforele(int [] ar, int ele) {
		
		int f=0;
		int l=ar.length-1;
		while(f<l) {
			int m=(f+l)/2;
			if(ar[m]==ele)
			{
				return m;
			}else if(ar[m]>ele) {
				l=m-1;
			}else if(ar[m]<ele)
			{
				f=m+1;
			}
		}
		return -1;
		
	}

}
