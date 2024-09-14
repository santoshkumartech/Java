package com.alpha.thread5;

public class Res1
{
	public synchronized void m1(Res2 o2) 
	{
		System.out.println(Thread.currentThread().getName()+" under execution");
		  try 
		  {
			Thread.sleep(2000);
		  } 
		  catch (InterruptedException e)
		  {
			
		  }
		  System.out.println(Thread.currentThread().getName()+" got access");
		  o2.n2();
	}
	public synchronized void m2()
	{
		System.out.println(Thread.currentThread().getName()+ " job done");
	}
}

