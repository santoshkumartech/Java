package com.alpha.serializastion;

import java.io.Serializable;

public class Student implements Serializable {
	
	private static final long serialversionUID =1234l;
    transient   String Sname;
	int sid;
	public Student(String sname, int sid) {
		super();
		Sname = sname;
		this.sid = sid;
	}
	

}
