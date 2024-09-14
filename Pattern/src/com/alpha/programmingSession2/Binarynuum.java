package com.alpha.programmingSession2;

import java.util.Scanner;

public class Binarynuum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		String bin="";
		while(num>0)
		{
			bin=(num%2)+bin;
			num=num/2;			
		}
		System.out.println(bin);
	}

}
