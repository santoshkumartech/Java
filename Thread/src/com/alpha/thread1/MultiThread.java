package com.alpha.thread1;

import java.util.Scanner;

public class MultiThread {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number from where you want to start");
		int start = sc.nextInt();
		System.out.println("enter the number till where you want to start");
		int end = sc.nextInt();
		System.out.println("enter the number of milli seconds to be delayed after printing a number");
		int delay = sc.nextInt();
		Thread t = Thread.currentThread();
		System.out.println("main thread name is " + t.getName());
		System.out.println("main method thread id is " + t.getId());
		print(start,end,delay);
		System.out.println("print method thread name is " + t.getName());
		System.out.println("print method thread id is " + t.getId());
		
	}
		public static void print(int start,int end,int delay)
		{
		for (int i = start; i <= end; i++)
		{
			if(start>=0&&end<=1000)
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
