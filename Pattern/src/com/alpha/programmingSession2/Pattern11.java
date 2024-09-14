package com.alpha.programmingSession2;

public class Pattern11
{
		public static void main(String[] args)
		{

			int countLine=5;
			int countStar=1;
	        int mid=(countLine+1)/2;
			String str="*";
			for(int i=1; i<=countLine; i++)
			{
				
				for(int j=1; j<=countStar; j++)
				{
					System.out.print(str+" ");
				}
				System.out.println();
				if(i<mid)
				{
				countStar++;
				}
				else
					countStar--;
			}                           
	}
}
