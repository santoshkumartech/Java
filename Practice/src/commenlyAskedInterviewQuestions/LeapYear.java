package commenlyAskedInterviewQuestions;
import java.util.Scanner;
public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a year to check whether it's leap year or not");
		int year =s.nextInt();
		if((year%4==0 && year %100 !=0 ) || year %400==0)
		{
			System.out.println(year +" is a leap year");
		}
		else
			System.out.println(year +" is not a leap year");

	}

}
