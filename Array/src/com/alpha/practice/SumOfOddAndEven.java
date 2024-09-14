package com.alpha.practice;
import java.util.*;
public class SumOfOddAndEven {

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("To find the sum of even and odd between the range of m and n");
		System.out.println("enter the value of m");
		int m = s.nextInt();
		System.out.println(" enter the value of n");
		int n = s.nextInt();
		int sum = 0;
		for (int i = 1; i <=n; i++) 
		{
			if(n%i!=0)
			{
				sum+=i;
			}
		}
		System.out.println("sum of odd number is"+ sum);
		for (int i = 1; i <=n; i++) 
		{
			if(n%i==0)
			{
				sum+=i;
			}
		}
		System.out.println("sum of even number is"+ sum);
			
		}

}
