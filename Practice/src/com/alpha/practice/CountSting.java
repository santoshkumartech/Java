package com.alpha.practice;

public class CountSting {
	
	public static void main(String[] args) {
		
		String s = "Karnataka";
		char s1='a';
		int count = 0;
		for (int i = 0; i <s.length(); i++) {
			if (s.charAt(i)!=s1) {
				count++;
			}
		
		}
		System.out.println(count);
	}
}
