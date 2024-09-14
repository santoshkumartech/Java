package com.alpha.array;

import java.util.Arrays;
import java.util.Scanner;

public class LarId {

	public static void main(String[] args) {
		Lar i[] = new Lar[3];
				Scanner sc = new Scanner(System.in);
				for (int j = 0; j < i.length; j++) {
					System.out.println("enter the " +(j+1)+ " student name");
					String sname = sc.next();
					System.out.println("enter "+sname+" id");
					int sid = sc.nextInt();
					i[j]= new Lar(sname,sid);
				}
				Arrays.sort(i);
		}
}
