package com.alpha.thread3;
import java.util.*;
public class PrintDriver {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter book name");
	String name = sc.next();
		Book b1 = new Book(name);
		Printer p1 = new Printer(b1, "D:\\book1.txt");
		Printer p2 = new Printer(b1, "D:\\book2.txt");
		p1.start();
		p2.start();	
	}
}
