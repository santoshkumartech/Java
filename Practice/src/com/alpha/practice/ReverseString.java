package com.alpha.practice;
import java.util.*;
public class ReverseString {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the name to get reverse of it");
		String ori = sc.next();
		String rev = " ";
		char ch;
		System.out.println("original name "+ori);
		for (int i = 0; i < ori.length(); i++) 
		{
			ch=ori.charAt(i);
			rev=ch+rev;
		}
		System.out.println("reversed word is "+rev);
	}
}
