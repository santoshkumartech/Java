package com.alpha.array;

import java.util.Scanner;

public class Array4 
{
	public static void main(String[] args)
	{
	Scanner s = new Scanner(System.in);
	String arr[]= new String[5];
	for(int i = 0; i < arr.length; i++)
	{
		System.out.println("enter the "+(i+1)+" name");
		arr[i]=s.nextLine();
	}
	System.out.println("elements of array are");
	for (int i = 0; i < arr.length; i++)
	{
		System.out.println(arr[i]);
	}

}

}

