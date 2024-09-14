package com.alpha.filehandling;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class ReadAndStore {

	public static void main(String[] args) throws IOException
	{
		Scanner sc = new Scanner(System.in);
		
		FileOutputStream fos =  new FileOutputStream("D:/eclipse/java Progaram/src/StudentDetails3.txt",true);
		PrintWriter p = new PrintWriter(fos);
		System.out.println("enter the name");
		String s = sc.nextLine();
		System.out.println("enter your age");
		int i = sc.nextInt();
		
		p.println(" student details");
		p.println("-----------------------------");
		p.println("name of student - " + s);
		p.print("age of student - ");
		p.println(i);
		p.flush();
		System.out.println("details stored successfully");
	}

}
