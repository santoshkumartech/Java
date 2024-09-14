package com.alpha.serializastion;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fs=new FileInputStream("D:/Programs/Student.txt");
		ObjectInputStream os=new ObjectInputStream(fs);
		Student s=(Student)os.readObject();
		System.out.println(s.sid);
		System.out.println(s.Sname);
	}

}
