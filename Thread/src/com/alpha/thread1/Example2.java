package com.alpha.thread1;
import java.util.*;
public class Example2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the alphabet from where you want to start");
		char start = sc.next().charAt(0);
		System.out.println("enter the alphabet till where you want to print");
		char end = sc.next().charAt(0);
		System.out.println("enter the number of milli seconds to be delayed after printing  a letter");
		int delay = sc.nextInt();
		for(char i=start;i<=end;i++)
		{
			if(start>='a'&&end<='z'||start>='A'&&end<='Z')
			{
				System.out.println(i);
				try 
				{
					Thread.sleep(delay);
					
				} 
				catch (Exception e) 
				{
					System.out.println("something went wrong");
				}
			}
		}
	}

}
