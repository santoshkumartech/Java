package com.alpha.practice;

public class P2 {

	public static void main(String[] args)
	{
		char a = 'A';
		int n = 1;
	for (int i = 1; i <=4; i++)
	{
		for (int j = 1; j <=4; j++)
		{
			if(j%2==0)
			{
				System.out.print(n+" ");
				n++;
			}
			else
			{
				System.out.print(a+" ");
				a++;
			}
		}
		System.out.println();
	}	

	}

}
