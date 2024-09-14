package com.alpha.session39;

import java.util.Scanner;

public class ArrayAdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the numbers for row");
		int a = sc.nextInt();
		System.out.println("enter the number for column");
		int b = sc.nextInt();
		System.out.println("you chossed "+a+"*"+b+"matrix enter your numbers");
		int n[][]=new int[a][b];
		
		for (int i = 0; i < a; i++) {
			for (int j = 0; j <b; j++) {
				
				n[i][j]=sc.nextInt();
			}
		}
		for (int i = 0; i <a; i++) {
			for (int j = 0; j < b; j++) {
				System.out.print(n[i][j]+" ");
			}
			System.out.println();

	}

}
}
