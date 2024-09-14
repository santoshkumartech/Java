package com.alpha.array;

import java.util.Scanner;

public class PrimeNumber 
{
		public static void main(String[] args)
		{
			Scanner s = new Scanner(System.in);
			System.out.println("enter the number");
			int a = s.nextInt();
			int arr[]=new int[a];
			for (int i = 0; i < arr.length; i++) {
				if(arr[i]%2!=0)
				{
					if(arr[i]%a==0)
						System.out.println(arr[i]+"is a prime number");
					else
						System.out.println("is not a prime number");
				}
			}
			
	}

}
