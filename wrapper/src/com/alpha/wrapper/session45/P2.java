package com.alpha.wrapper.session45;

public class P2 {

		public static void main(String[] args)
		{
			
			System.out.println(args.length);
			add('2',7,3);
			add('a',1,9,3,7,4,3);
			add('b',1.5,3);	

		}
		public static void add(char ch,double... a)
		{
			double sum = 0;
			for (int i = 0; i < a.length; i++) {
				sum+=a[i];
			}
			System.out.println(sum);
			
		}

	}


