package com.alpha.practice;

public class SortAcending {

	public static void main(String[] args) 
	{
		int a[]= {9,2,3,6,7};
		for(int i = 1 ;i<a.length;i++)
		{
			for (int j = 1; j < a.length; j++) 
			{
				if(a[i-1]>a[i])
				{
					int temp = a[i-1];
					a[i-1]=a[i];
					temp= a[i-1];
				}
			}
		}
		for (int i = 0; i < a.length; i++) 
		{
		 System.out.println(a[i]);	
		}

	}

}
