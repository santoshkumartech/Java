package com.alpha.practice;

public class P3 
{
	static int a ;
	public static void main(String[] args)
	{
		greeting();
		System.out.println(add(5,6));
		add();
		System.out.println(add(56.01,58.23));
	}
	public static void greeting() {
		System.out.println("hii");
	}
	public static int add(int a,int b)
	{
		return a+b;
	}
	public static void add()
	{
		System.out.println("bye");
	}
	public static double add(double s , double t)
	{
		return s+t;
	}
	static
	{
		System.out.println("my name is sunil");
	}
	
}
