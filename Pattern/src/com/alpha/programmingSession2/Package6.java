package com.alpha.programmingSession2;

public class Package6 
{
	public static void main(String[] args) 
	{
		for(int i =1;i<=4;i++)
		{
			int num = 0;
			for (int j = 4; j >=1; j--)
			{
			 if (i>=j)
			 {
				 System.out.print(num);
				 if(num==0)
					 num=1;
				 else
					 num=0;
			 }
			 else
				 System.out.print(" ");	
			}
			System.out.println();
		}
	}
}
