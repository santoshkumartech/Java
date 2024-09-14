package com.alpha.array;
import java.util.Scanner;
public class LargestIdD {

	public static void main(String[] args) {
		LargestId i[] = new LargestId[3];
				Scanner sc = new Scanner(System.in);
				for (int j = 0; j < i.length; j++) {
					System.out.println("enter the " +(j+1)+ " student name");
					String sname = sc.next();
					System.out.println("enter "+sname+" id");
					int sid = sc.nextInt();
					i[j]= new LargestId(sname,sid);
				}
				int largest = i[0].sid;
				for (int j = 0; j < i.length; j++) {
					if(i[j].sid>largest)
					{
						largest=i[j].sid;
					}
				}
				for (int j = 0; j < i.length; j++) {
					if(i[j].sid==largest)
					{
						System.out.println(i[j].sname+" has largest id");
					}
					
				}
		// TODO Auto-generated method stub

	}

}
