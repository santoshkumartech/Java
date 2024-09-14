package com.alpha.thread4;

class Writter2 extends Thread
{
	Movie m;
	String fp;
	public Writter2(Movie m, String fp) 
	{
		this.m = m;
		this.fp = fp;
	}
	public void run()
	{
		m.writeTitle(fp);
	}
}