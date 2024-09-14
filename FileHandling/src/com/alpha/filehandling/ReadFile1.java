package com.alpha.filehandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile1 {

	public static void main(String[] args) throws IOException
	{
	FileReader f = new FileReader("D:/eclipse/java Progaram/src/StudentDetails3.txt");	
	BufferedReader br = new BufferedReader(f);
	String s= br.readLine();   //buffer reader will read one full line 
	int count = 0;
	while(s!=null)
	{
		System.out.println(s);
		s=br.readLine();
		count++;
	}
	System.out.println(count);
	}

}
