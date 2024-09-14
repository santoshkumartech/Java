package commenlyAskedInterviewQuestions;

import java.util.*;

public class CountOccuranceOfCharacter {

	public static void main(String[] args) {

		String  input="santosSh";
		char[] chars = input.toCharArray();
		
		Map<Character,Integer> map= new HashMap();
		for(char ch: chars)
		{
			if(!map.containsKey(ch)) {
				map.put(ch, 1);
			}
			else
			{
				int value = map.get(ch);
				map.put(ch, value+1);
			}	
		}
		System.out.println(map);
		
	}

}
