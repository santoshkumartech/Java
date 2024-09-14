package com.alpha.thread4;

public class Reader extends Thread
{
	Book b;
	String fp;
	Reader()
	{
	}
	Reader(Book b,String fp)
	{
		this.b=b;
		this.fp=fp;
	}
	public void run()
	{
		b.readtTitle(fp);
		
	}
}
