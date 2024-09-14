package com.alpha.thread4;

public class Reader1 extends Thread 
{
	Movie m;
	String fp;
	public Reader1(Movie m, String fp) 
	{
		this.m = m;
		this.fp = fp;
	}
	public void run()
	{
		m.readtTitle(fp);
	}
}
