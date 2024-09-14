package com.alpha.thread6;

public class Producer extends Thread
{
	int max_limit;
	Box b;

	Producer(Box b ,int max_limit , String name) 
	{
		super(name);
		this.max_limit = max_limit;
		this.b = b;
	}
	
	public void run() 
	{
		while(max_limit > 0)
		{
			b.addBiscuit(5);
			max_limit -= 5 ;
			try
			{
				sleep(5000);
			}
			catch (InterruptedException e)
			{
				System.out.println("interrupted....!");
			}
		}
		System.out.println(getName() + " done for the day........!");
	}
}
