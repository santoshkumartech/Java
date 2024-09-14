package jobchange;
import java.util.*;

public class Swapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the data 1 to swap");
		System.out.println("enter the data 2 to swap");
		String a = scan.next();
		String b = scan.next();
		String c = "";
		c=a;a=b;b=c;
		System.out.println("after swapping data 1 "+ a + " and after swapping data 2 "+b);
		
	}

}
