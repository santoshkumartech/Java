package com.alpha.basicpgms;
import java.util.Scanner;
public class AboluteNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int num = sc.nextInt();
		checkAbsoluteNumber(num);
		System.out.println("the absolute number of "+num+ " is "+checkAbsoluteNumber(num));
	}
	public static int checkAbsoluteNumber(int num) {
		if(num<0)
			return num*(-1);
		else
			return num;
		
	}
		

}

