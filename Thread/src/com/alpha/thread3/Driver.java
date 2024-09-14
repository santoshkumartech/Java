package com.alpha.thread3;

public class Driver {

	public static void main(String[] args) {
		
		Table t1 = new Table(1, "D:\\Tables\\f1.txt");
		Table t2 = new Table(2, "D:\\Tables\\f2.txt");
		Table t3 = new Table(3, "D:\\Tables\\f3.txt");
		Table t4 = new Table(4, "D:\\Tables\\f4.txt");
		Table t5 = new Table(5, "D:\\Tables\\f5.txt");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}

}
