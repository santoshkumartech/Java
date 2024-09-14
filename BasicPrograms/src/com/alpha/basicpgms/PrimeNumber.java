package com.alpha.basicpgms;
import java.util.Scanner;
public class PrimeNumber {

	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the number");
	int num = sc.nextInt();
	System.out.println(checkPrimeNumber(num));
	}
	public static String checkPrimeNumber(int num)
	{
	if(num>1)
	{
		if(num==2||num%2!=0)
		{
			return "is a prime number";
		}
		else
			return "is not a prime number";
	}
	else
		return "is not a prime number";
	}

}
