package commenlyAskedInterviewQuestions;
import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter the name");
		String name = s.nextLine();
		String reverse = "";
		for (int i = name.length()-1; i >= 0; i--)
		{
			reverse += name.charAt(i); //System.out.print(name.charAt(i));
		}
		System.out.println("Reverse name is "+ reverse);
	}

}
