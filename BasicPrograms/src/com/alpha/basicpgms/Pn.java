package com.alpha.basicpgms;
import java.util.Scanner;
public class Pn {

		public static void main(String[] args)
		{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int num = sc.nextInt();
		checkPrimeNumber(num);
		}
		public static void checkPrimeNumber(int num)
		{
		if(num>1)
		{
			if(num==2||num%2!=0)
			{
				if(num/10==0||num/10!=0)
				{
				System.out.println( "is a prime number");
				}
				else
					System.out.println( "is not a prime number");
			}
		}
		else
			System.out.println( "is a prime number");
			
		}

	}

