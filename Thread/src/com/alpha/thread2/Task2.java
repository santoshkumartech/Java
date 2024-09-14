package com.alpha.thread2;
import java.util.*;
public class Task2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number to start");
		int m=sc.nextInt();
		System.out.println("enter a value till where youwant to print");
		int n = sc.nextInt();
		Printer p = new Printer(m,n);
		Printer p2 = new Printer(m,n);
		p.start();
		p2.start();

	}

}
