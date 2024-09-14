package com.alpha.thread3;

import java.io.IOException;
import java.io.PrintWriter;

public class Printer extends Thread
{
	Book b1;
	String fp ;
	Printer(Book b1, String fp)
	{
		this.b1=b1;
		this.fp=fp;
	}
	public void run()
	{
		PrintWriter pw = null;
		try {
			pw=new PrintWriter(fp);
			for (int i = 0; i <b1.title.length(); i++)
			{
				pw.print(b1.title.charAt(i));
				System.out.println(getName() + " writes into file "+ fp);
				pw.flush();
			}
			
			}
		catch (IOException e) 
		{
			System.out.println(".....!!");
		}
		catch (Exception e) {
			
		}
	}
}
