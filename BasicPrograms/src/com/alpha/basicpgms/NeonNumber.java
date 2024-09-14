package com.alpha.basicpgms;
import java.util.Scanner;
public class NeonNumber
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int num = sc.nextInt();
		int sqrt = num*num;
		if(checkNeonNumber(num , sqrt) == true)
				{
			  		System.out.println("given number is neon number");
				}
		else
			System.out.println("given number is not a neon number");
	}
	public static boolean checkNeonNumber(int num,int sqrt)
	{
		int sum = 0;
		while(sqrt>0)
		{
			int rem=sqrt%10;
			sum=sum+rem;
			sqrt=sqrt/10;
		}
		return sum==num?true:false;
	}
}
