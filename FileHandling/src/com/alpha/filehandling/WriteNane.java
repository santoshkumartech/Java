package com.alpha.filehandling;

import java.io.FileOutputStream;
import java.io.IOException;

public class WriteNane {

	public static void main(String[] args) throws IOException {
		FileOutputStream f = new FileOutputStream("D:/eclipse/java Progaram/src/Name.text",true);
		byte b[]= {115,97,110,116,117};
		f.write(b);
		}
}

// to create file and write in it we use FileOutputStream
