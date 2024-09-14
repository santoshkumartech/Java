package com.alpha.practice;
import java.util.*;
public class P5 {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("welcome to hotel");
		System.out.println("enter 1.idly \n2.voda \n3.tea");
		int choice = sc.nextInt();
		switch(choice)
		{
		case 1 : System.out.println("you ordered idly");
		break;
		case 2: System.out.println("you  ordered sambar");
		break;
		case 3: System.out.println("you ordered tea");
		break;
		default : System.out.println("you enterd incorrect option");
		}
	}

}
