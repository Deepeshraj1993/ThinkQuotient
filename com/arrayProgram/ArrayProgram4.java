package com.arrayProgram;

import java.util.Arrays;

public class ArrayProgram4 {

	public static void main(String[] args) {
		int [] arr= {2,5,83,47,44,38,93,37,94,74,1,92,67,68};//unsorted Array
		//inbuilt function
		//Arrays.sort(arr);
		sortanarray(arr);
		for(int a:arr) {
			System.out.println(a);
		}

	}

	private static void sortanarray(int[] arr) {
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j]) {
					int temp;
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		
	}

}
