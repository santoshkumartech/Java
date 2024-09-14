package com.alpha.thread4;
import java.util.*;
public class MovieDriver {

	public static void main(String[] args) throws Exception
	{
		Scanner sc  = new Scanner(System.in);
		System.out.println("enter the title of movie");
		String title = sc.next();
		System.out.println("enter the releasing year");
		int Ryear = sc.nextInt();
		Movie m = new Movie(title, Ryear);
		System.out.println("enter the file path to store in that file");
		String fp = sc.next();
		Reader1 r = new Reader1(m, fp);
		System.out.println("enter name to modify the movie name");
		String modify = sc.next();
		Writter1 w = new Writter1(m, modify);
		Thread.sleep(15000);
		r.start();
		//Thread.sleep(15000);
		w.start();
	}
}
