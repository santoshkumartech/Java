package commenlyAskedInterviewQuestions;

import string.ReverseString;

public class SumOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int min=1;
		int max=50;
		int sum =0;
		for (int  i=min; i<=max; i++)
		{
			if(i%2==0)
			sum+=i;
			else
				max-=i;
			
		}
		System.out.println(sum);
		System.out.println(max);
	//	System.out.println(ReverseString.palindrome("dfsdf"));

	}

}
