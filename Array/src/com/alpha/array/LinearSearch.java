package com.alpha.array;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {6,8,5,7,50,45,85};
		int key = 50;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==key)
			{
				System.out.println("found");
				return;
			}
		}
		System.out.println("not found");
	}

}
