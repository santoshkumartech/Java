package arrays;
import java.util.*;

public class CommonElementsInArray {
	public static void main(String[] args)
	{
		Integer[] a1 = {1,2,3,4,5,6};
		Integer[] a2 = {5,8,1,2};
		Integer[]a3= {4,5,1};
		
		//converting array to list
		
		List<Integer> list1 = Arrays.asList(a1);
		List<Integer>list2 = Arrays.asList(a2);
		List<Integer>list3= Arrays.asList(a3);
		
		// finding the common elements
		
		Set<Integer> commonElements = new HashSet<>(list1);
		commonElements.retainAll(list2);
		commonElements.retainAll(list3);
		
		System.out.println("common elements are "+ commonElements);
	}

}
