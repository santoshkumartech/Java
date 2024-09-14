package com.alpha.array;

import java.util.Scanner;

public class EvenOdd 
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number");
		int a = s.nextInt();
		int arr[]=new int[a];
		for (int i = 1; i <= arr.length; i++)
		{
			if (i%2==0)
			{
			System.out.println(i +" is odd number");
			}
			else
				System.out.println(i+" is not a even number");
		}
		
		}
}
