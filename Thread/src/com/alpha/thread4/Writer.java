package com.alpha.thread4;

public class Writer extends Thread 
{
	Book b;
	String fp;
	Writer()
	{
	}
	Writer(Book b,String fp)
	{
		this.b=b;
		this.fp=fp;
	}
	public void run()
	{
		b.writeTitle(fp);
	}
}
