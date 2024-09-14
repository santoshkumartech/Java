package practice;

import java.util.Scanner;

public class CopyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] st = new String[5];
		String[] d = new  String[5];
		Scanner s = new Scanner(System.in);
		System.out.println("enter your names");
		for(int i=0; i<st.length;i++)
		{
			st[i]=s.nextLine();
			d[i]=st[i];
		}
		
		for (int i = 0; i < st.length; i++) {
			System.out.print(st[i]);
		}
		System.out.println();
		for (int i = 0; i < d.length; i++) {
			System.out.print(d[i]);
		}
	
	
	}
}
