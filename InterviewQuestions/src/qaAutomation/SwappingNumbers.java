package qaAutomation;

import java.util.Scanner;

public class SwappingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int x,y,z;
		System.out.println("Enter First number");
		x = s.nextInt();
		System.out.println("Enter second number");
		y= s.nextInt();
		z=x; x=y;y=z;
		System.out.println("Entered number after swapping 1st number is " +x+ " and 2nd number is " + y);
	}

}
