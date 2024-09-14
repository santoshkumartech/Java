package com.alpha.thread2;
import java.util.*;
public class Task3 {

	public static void main(String[] args) throws Throwable {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number to get its multiplication table");
		int m = sc.nextInt();
		Table t1 = new Table(m);
		System.out.println(" main method start");
		t1.start();
		t1.sleep(10000);
		System.out.println(" main method end");
		Table t2 = new Table(m);
		t2.start();
		
		
	}

}
