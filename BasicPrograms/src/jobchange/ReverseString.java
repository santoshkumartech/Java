package jobchange;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Santosh";
		String rev = "";
		int count  =0;
		for(int i = s.length()-1;i>=0;i--)
		{
			rev+= s.charAt(i);
			count++;
		}
		System.out.println("Reverse of given string " +rev + " total count of characters in entered string is "+ count);
	}

}
