package practice;
import java.util.Scanner;

public class ArraysInsitiate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s= new Scanner(System.in);
		System.out.println("enter the values");
		int[] numbers = new int[5];
		for (int i = 0; i < numbers.length; i++)
		{
			numbers[i]=s.nextInt();
		}
		for (int i = 0; i < numbers.length; i++)
		{
			System.out.print(numbers[i]+",");
		}
		
	//	numbers[0] = 1;
	//	numbers[3]=9;
		
	}

}
