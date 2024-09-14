package com.alpha.practice;
import java.util.*;
public class SortingByUserInput {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size array");
		int size = sc.nextInt();
		int arr[]= new int [size];
		for (int i = 0; i < arr.length; i++)
		{
			System.out.println("enter the values");
			arr[i]=sc.nextInt();
		}
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
