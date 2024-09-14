package com.alpha.array;
import java.util.Scanner;
public class StudentsDetailsDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		StudentsDetail s[] = new StudentsDetail[3];
		StudentsDetail s1= new StudentsDetail("snt",25);
		StudentsDetail s2= new StudentsDetail("msk",20);
		StudentsDetail s3= new StudentsDetail("xyz",26);
		s[0]=s1;
		s[1]=s2;
		s[2]=s3;	
		System.out.println("enter the id to check the name registeredd with it");
		int sid = sc.nextInt();
		for (int i = 0; i < s.length; i++) {
			if(sid==s[i].sid)
			{
				System.out.println(s[i].sname);
			}
			
				
		}
	}

}
