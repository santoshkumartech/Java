package strings;
import java.util.*;

public class ReverseString {
	public static void  main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter the any data to have to find reverse of it");
		String input = s.next();
		String reverse = "";
		int count = 0;
		for(int i = input.length()-1; i>=0 ; i--)
		{
			reverse+= input.charAt(i);
			count++;
		}
		System.out.println("reverse of given string is "+ reverse);
		System.out.println("number of character in entered string  is "+ count);
	}
}
