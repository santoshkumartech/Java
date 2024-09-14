package com.alpha.filehandling;
import java.io.FileNotFoundException;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadFile {

	public static void main(String[] args) throws IOException
	{
	FileInputStream fis = new FileInputStream("D:/eclipse/java Progaram/src/StudentDetails3.txt");
	int i = fis.read();
	while(i!=-1)      //file input stram will read  character after character
	{
		System.out.print((char)i);
		i=fis.read();
	}

	}

}
