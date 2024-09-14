package com.alpha.serializastion;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialization {

	public static void main(String[] args) throws IOException {
		
		Student s = new Student("msk", 10);
		FileOutputStream fos = new FileOutputStream("D:/Programs/Student.txt");
		ObjectOutputStream os=new ObjectOutputStream(fos);
		os.writeObject(s);
		os.close();	
	}

}
