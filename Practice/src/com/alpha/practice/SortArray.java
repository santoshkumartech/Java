package com.alpha.practice;

public class SortArray {

	public static void main(String[] args) 
	{
		int arr[]= new int [] {2,5,4,7,9,8,6,3};
		int temp=0;
		System.out.println("elements in array initially");
		for (int i = 0; i < arr.length; i++)
		{
		 System.out.print(arr[i]+",");	
		}
		for (int i = 0; i < arr.length; i++)
		{
			for (int j = i+1; j < arr.length; j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println();
		System.out.println("elements after sorting ");
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.print(arr[i]+",");
		}
	}
}
