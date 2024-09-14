package commenlyAskedInterviewQuestions;
import java.util.ArrayList;
import java.util.Scanner;

public class MultipleUserInputsInArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean b = true;
		ArrayList<String> names = new ArrayList<>();
//		Scanner s  = new  Scanner(System.in);
//		System.out.println("enter the name");
//		names.add(s.next());
		while(true) {
			Scanner s  = new  Scanner(System.in);
			System.out.println("enter name and (stop) to break");
			String name = s.nextLine();
			if(name.equalsIgnoreCase("stop")) {
				break;
			}
			names.add(name);
		
		}
		System.out.println(names);
	}

}
