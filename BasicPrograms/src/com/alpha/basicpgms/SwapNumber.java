package com.alpha.basicpgms;
import java.util.Scanner;
public class SwapNumber {
		public static void main(String[] args) 
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter A value _");
			int a=sc.nextInt();
			System.out.println("Enter B number _");
			int b=sc.nextInt();
			a=a+b;
			b=a-b;
			a=a-b;
			System.out.print("A = "+a+" B = "+b);

		}

}
