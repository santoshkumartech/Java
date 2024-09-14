package com.alpha.thread3;

import java.io.IOException;
import java.io.PrintWriter;

public class Table extends Thread{
	int m;
	String fp;
	public Table(int m, String fp) 
	{
		this.m = m;
		this.fp = fp;
	}
	
	public void run()
	{
		PrintWriter pw = null;
		try {
			pw=new PrintWriter(fp);
			for (int i = 1; i <=10; i++)
			{
				pw.println(m+"*"+i+"="+(m*i));
				System.out.println(getName()+" writes into file "+ fp);
				sleep(2000);
			}
			} 
		catch (IOException e)
		{
			System.out.println("exception occured in "+ getName());
			System.out.println("unable to create file");
			System.out.println("check for path "+ fp);
			System.out.println("-------------------------------------");
		}
		catch(InterruptedException e)
		{
			System.out.println("exception occured in "+ getName());
			System.out.println("thread got intrupted");
		}
		finally {
			if(pw!=null)
				pw.close();
		}
	}
	
}

