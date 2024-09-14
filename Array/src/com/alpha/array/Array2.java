package com.alpha.array;
import java.util.Scanner;
public class Array2 {

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int arr[]= new int[5];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("enter the "+(i+1)+" digit");
			arr[i]=s.nextInt();
		}
		System.out.println("elements of array are");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
