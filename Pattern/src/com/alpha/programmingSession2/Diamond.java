package com.alpha.programmingSession2;

public class Diamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int star=1;
int space=3;
for(int i=1;i<=4;i++)
{
	for(int j=1;j<=space;j++)
	{
	System.out.print(" ");
	}
	for(int k=1;k<=star;k++)
	{
		System.out.print("*");
	}
	space--;
	star=star+2;
	System.out.println();
}
	}

}

