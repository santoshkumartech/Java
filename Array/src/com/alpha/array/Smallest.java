package com.alpha.array;

public class Smallest {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int[]arr=new int[]{2,11,8,67,56};
			int min=arr[0];
			for (int i = 0; i < arr.length; i++) {
				if(arr[i]<min)
					min=arr[i];
			}
			System.out.println(min);
				
		}

	}


