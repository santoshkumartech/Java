package com.alpha.programmingSession2;

public class Pattern7
{
	public static void main(String[] args) 
	{
		for(int i =0;i<=4;i++)
		{
			for(int j = 4; j>0; j--)
			{
			 if(j>i)
			 {
				 System.out.print("*");
			 }
			 else
				 System.out.print(" ");	
			}
			System.out.println();
		}
	}
}

