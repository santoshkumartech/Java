package commenlyAskedInterviewQuestions;

public class LeapYearBetweenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int min =2000;
		int max =3000;
		int leapCount = 0;
		int nonLeap =0;
		for(int i = min+1;i<=max;i++)
		{
			if((i%4==0 && i %100 !=0 ) || i %400==0)
			{
				System.out.println(i +" is a leap year");
				leapCount++;
		//		if(leapCount==150)
		//		{
		//			System.out.println(i);
		//			System.out.println(loopCount);
			//	System.out.println(loopCount-leapCount);
		//		break;
		//		}
			}
			else
				nonLeap++;
		}
		System.out.println("total num  of leap years between 2000 to 3000 "+ leapCount);
		System.out.println("non leap year count "+ nonLeap);
	}

}
