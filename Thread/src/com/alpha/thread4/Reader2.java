package com.alpha.thread4;

public class Reader2 extends Thread 
{
	Movie m;
	String fp;
	public Reader2(Movie m, String fp) 
	{
		this.m = m;
		this.fp = fp;
	}
	public void run()
	{
		m.readtTitle(fp);
	}
}
