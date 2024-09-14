package com.alpha.wrapper.session45;

public class P1 {

	public static void main(String[] args)
	{
		
		System.out.println(args.length);
		System.out.println(add(2,7,3));
		System.out.println(add(1,9,3,7,4,3));
		

	}
	public static int add(int... a)
	{
		int sum =0;
		for (int i = 0; i < a.length; i++) {
			sum+=a[i];
		}
		return sum;
	}

}
