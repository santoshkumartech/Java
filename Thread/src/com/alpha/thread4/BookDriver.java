package com.alpha.thread4;
import java.util.*;
public class BookDriver {

	public static void main(String[] args) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the movie name");
		String Mname=sc.next();
		Book b = new Book(Mname);
		System.out.println("enter the file path where you want to create");
		String Add=sc.next();
		Reader r = new Reader(b,Add);
		System.out.println("enter name to modify");
		String modify = sc.next();
		Writer w = new Writer(b,modify);
		//Thread.sleep(1000);
		r.start();
		Thread.sleep(1000);
		w.start();
		sc.close();
	}
}
