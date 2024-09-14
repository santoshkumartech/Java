package com.alpha.thread4;

public class Writter1 extends Thread
{
	Movie m;
	String fp;
	public Writter1(Movie m, String fp) 
	{
		this.m = m;
		this.fp = fp;
	}
	public void run()
	{
		m.writeTitle(fp);
	}
}
