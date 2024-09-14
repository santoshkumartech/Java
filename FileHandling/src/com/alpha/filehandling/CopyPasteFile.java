package com.alpha.filehandling;


	import java.io.FileOutputStream;
	import java.io.PrintWriter;
	import java.io.BufferedReader;
	import java.io.FileNotFoundException;
	import java.io.FileReader;
	import java.io.IOException;
	public class CopyPasteFile 
	{
		public static void main(String[] args)throws IOException {
			FileReader f=new FileReader(args[0]);
			BufferedReader b=new BufferedReader(f);
			//FileOutputStream f1=new FileOutputStream(args[1]);
			//PrintWriter p=new PrintWriter(f1);
			PrintWriter p=new PrintWriter(args[1]);
			String s=b.readLine();
			int count=0;
			while(s!=null){
				System.out.println(s);
				p.println(s);
				p.flush();
				s=b.readLine();
				count++;
			}
			System.out.println(count);
		}
	}

