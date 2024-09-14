package com.alpha.thread4;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;

public class Book implements Comparable , Serializable {
	String title;
	Book(String title)
	{
		this.title=title;
	}
	public void readtTitle(String fp) 
	{
		PrintWriter pw = null;
		try
		{
		pw = new PrintWriter(fp);
		for (int i = 0; i < title.length( ); i++)
		{
			pw.flush();
			pw.print(title.charAt(i));
			System.out.println("writing");
			Thread.sleep(2000);
		}
		System.out.println("done....!");
		} 
		catch (IOException e) 
		{
			System.out.println("exception in thread "+ Thread.currentThread().getName());
			System.out.println("unableto open file");
		}
		catch (InterruptedException e)
		{
			System.out.println("exception in thead "+ Thread.currentThread().getName());
			System.out.println("interrupted Exception...!");
		}
		finally 
		{
			if(pw!=null)
			{
				pw.close();
			}
		}
	}
		public void writeTitle(String title)
		{
			this.title=title;
		}
		@Override
			public int compareTo(Object o)
			{
			return	this.title.compareTo(((Book)o).title);
			}
			public String toString()
			{
				return "[book title "+title +"]";
			}
			public boolean equals(Object o)
			{
				Book temp = (Book)o;
				return this.title.equals(temp.title);
			}
			public int hashCode()
			{
				return this.title.hashCode();
			}
}
