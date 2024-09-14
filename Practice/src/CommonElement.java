import java.util.*;
public class CommonElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		        int[] array1 = {1, 2, 3, 4, 5};
		        int[] array2 = {1,2,3,4};
		        int[] array3 = {1,2,3};

		        
		        List<Integer> commonElements = findCommonElements(array1, array2, array3);
		        System.out.println("Common elements: " + commonElements);
		    }

		    public static List<Integer> findCommonElements(int[]... arrays) {
		        if (arrays == null || arrays.length == 0) {
		            return Collections.emptyList();
		        }

		        Set<Integer> commonElements = new HashSet<>();
		        // Add all elements from the first array to the set
		        for (int element : arrays[0]) {
		            commonElements.add(element);
		        }

		        // Iterate through the remaining arrays
		        for (int i = 1; i < arrays.length; i++) {
		            Set<Integer> currentSet = new HashSet<>();
		            // Add all elements from the current array to a temporary set
		            for (int element : arrays[i]) {
		                currentSet.add(element);
		            }
		            // Intersect the current set with the common elements set
		            commonElements.retainAll(currentSet);
		        }

		        return new ArrayList<>(commonElements);
		    }
		
	

}
