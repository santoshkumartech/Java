package com.alpha.thread2;

public class Printer extends Thread {
	int m,n;
	public void run()
	{
		for (int i = m; i <= n; i++)
		{
			System.out.println(i);
			try
			{
				sleep(1000);
			}
			catch(Exception e)
			{
				
			}
		}
	}
			Printer(int m,int n)
			{
				this.m=m;
				this.n=n;
			}
			Printer(){
				
			}
			Printer(String name)
			{
				super(name);
			}
			

}
