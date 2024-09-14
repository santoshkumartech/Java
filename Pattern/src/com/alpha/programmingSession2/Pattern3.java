package com.alpha.programmingSession2;

public class Pattern3 
{
		public static void main(String[] args) 
		{
			for (int i = 1; i <=5; i++) 
			{
				char ch ='a';
				int a = 1;
				for (int j = 1; j <= 5; j++) 
				{
					if(j%2!=0)
					{
						System.out.print(a+" ");
						a++;
					}
					else
					{
						System.out.print(ch+" ");
						ch++;
					}
				}
				System.out.println();	
			}

		}

	}



