package com.alpha.session39;
import java.util.Scanner;
public class AddMultiDimensionalArray {

	public static void main(String[] args) 
	{		
				Scanner s=new Scanner(System.in);
				System.out.println("enter the number of rows");
				int row1=s.nextInt();
				System.out.println("enter the number of column");
				int column1=s.nextInt();
				
				int n[][]=new int[row1][column1];
				System.out.println("enter the number you want to add");
				for (int i = 0; i<row1; i++) 
				{
				  for (int j=0;j<column1;j++)
				  {
						n[i][j] = s.nextInt();
				  }
				}
				System.out.println("================================");
				System.out.println();
				System.out.println("enter the number of rows");
				int row2=s.nextInt();
				System.out.println("enter the number of column");
				int column2=s.nextInt();
				
				int m[][]=new int[row2][column2];
				System.out.println("enter the number you want to add");
				for (int i = 0; i<row2; i++) 
				{
				  for (int j=0;j<column2;j++)
				  {
						m[i][j] = s.nextInt();
				  }
				}
				System.out.println("================================");
				System.out.println();
				
				System.out.println("your first matrix "+ row1+"*"+column1+" is :");
				for (int i = 0; i < row1; i++) 
				{
					 for (int j = 0; j <column1; j++) 
						{
							System.out.print(n[i][j]+" ");
						}
						System.out.println();
				}
				System.out.println("================================");
				System.out.println();
				System.out.println("your second matrix "+ row2+"*"+column2+" is :");
				for (int i = 0; i < row1; i++) 
				{
					 for (int j = 0; j <column1; j++) 
						{
							System.out.print(m[i][j]+" ");
						}
						System.out.println();
				}	
				System.out.println("================================");
				System.out.println();
				if(row1==row2 && column1==column2)
				{
					System.out.println("addition of first matrix and second matrix is : ");
				   for (int i = 0; i < row1; i++) 
				   {
					 for (int j = 0; j <column1; j++) 
						{
							System.out.print(m[i][j]+n[i][j]+" ");
						}
						System.out.println();
				   }
				}  
				else
				{
					System.out.println("matrix 1 and matrix 2 are not matching");
					return;
				}
	}
}
