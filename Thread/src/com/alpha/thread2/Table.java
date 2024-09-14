package com.alpha.thread2;

public class Table extends Thread 
{
	int m;
	Table(int m)
	{
		this.m=m;
	}
	public void run()
	{
		System.out.println(getName() +" hii from thread");
		for (int i = 1; i<=10; i++) 
		{
			
			System.out.println(m+" * "+i+" = "+ i*m);
			try
			{
				sleep(1000);
			}
			catch(Exception e)
			{
				
			}
		}
	}
}
