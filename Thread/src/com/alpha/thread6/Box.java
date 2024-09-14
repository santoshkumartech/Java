package com.alpha.thread6;

import java.util.ArrayList;

public class Box {
	
	ArrayList<Biscuit> box = new ArrayList<>();	//generic arraylist
	
	//method for add biscuit into the box
	
	public void addBiscuit(int n)
	{
		synchronized (this)
		{
			for (int i = 0; i < n; i++) 
			{
				box.add(new Biscuit () );
				System.out.println("biscruit added by "+ Thread.currentThread().getName());
				try
				{
					Thread.sleep(2000);	
				} 
				catch (InterruptedException e) 
				{
				System.out.println("interrupted....!");
				}
			}
			this.notify();
		} //end of synchronized
	}
	
	// to remove biscuit from box
	
	public void  removeBiscuit(int n)
	{
		synchronized (this)
		{
			while( n != 0)
			{
				if(box.size() == 0)
				{
					try 
					{
						this.wait();
					}
					catch (InterruptedException e)
					{
					
					}
				}
				else
				{
					box.remove(0);
					System.out.println("biscuit removed by......"+Thread.currentThread().getName());
					n--;
					try 
					{
						Thread.sleep(2000);
					}
					catch (InterruptedException e)
					{
						System.out.println("interrupted.....!");
					}
				}
				
			}
		}
	}
}
