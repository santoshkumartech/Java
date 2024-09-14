package string;
import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter any data to know the reverse of it");
		String data = s.next();
		String  rev ="";
		for(int i=data.length()-1; i>=0 ;i--)
		{
			rev+= data.charAt(i);
		//	System.out.print( data.charAt(i));
		}
		System.out.println("reverse of the given data "+ rev);
	}
	
	public static String palindrome(String data)
	{
		String rev ="";
		for(int i=data.length()-1;i>=0;i--)
		{
			rev+=data.charAt(i);
		}
		return rev;
	}
}
