package com.alpha.filehandling;

import java.io.FileOutputStream;
import java.io.IOException;

public class Name2 
{
		public static void main(String[] args) throws IOException {
			FileOutputStream f = new FileOutputStream("D:/eclipse/java Progaram/src/Name2.text");
			byte b[]= {115,97,110,116,117};
			f.write(b);
			}
	}
