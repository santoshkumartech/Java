package commenlyAskedInterviewQuestions;
import java.util.ArrayList;

public class ArrayListBasicAddRemove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> names = new ArrayList<>();
		names.add("santosh");  //to add data into the arrayList
		names.add("kumar");
		names.add("m");
		
		for(int i=0;i<=names.size()-1;i++)
		{
			System.out.println(names.get(i));
		}
		names.remove(0);   //remove by using index
		System.out.println(names);
		names.remove("kumar");
		System.out.println(names);
		
	}
}
