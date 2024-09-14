package com.alpha.filehandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class MiniStatementDriver
{

	public static void main(String[] args)
	{
		MiniStatement m = new MiniStatement(454545464l, 1234, 50000);
		Scanner sc = new Scanner(System.in);
		FileOutputStream f = null ;
		PrintWriter p= null;
		try
		{
		f = new FileOutputStream("D:/eclipse/java Progaram/src/MiniStatement.txt",true);
		}
		catch(FileNotFoundException fn)
		{
			System.out.println("exception handled");
		}
		p = new PrintWriter(f);
		System.out.println("Account Number");
		p.println(m.AccNo);
		System.out.println("Account Balance");
		p.println(m.bal);
		p.println("-----------------------------");
		p.flush();
		boolean control = true;
		while(control)
		{
			System.out.println("enter 1 to writhdraw \n2 to deposit");
			int choice = sc.nextInt();
			switch(choice)
			{
			case 1 :
			{
				System.out.println("enter the password");
				int p1 =sc.nextInt();
				System.out.println("enter amount to withdraw");
				int amt1 = sc.nextInt();
				double status = m.withDraw(p1, amt1);
				if(status==0)
				{
					System.out.println("insufficiant fund");
				}
				else if(status==2)
				{
					System.out.println("withdraw "+amt1+" successful");
					p.print("amount deducted");
					p.println(m.bal);
					p.println("----------------------------");
					
				}
				else
					System.out.println("invalid pwd");
				}
			p.flush();
			break;
			}
		}
	}
}
