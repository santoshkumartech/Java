package com.alpha.pgm2;

import java.util.LinkedHashSet;
public final class A {
	
	public static void main(String[] args) {
		
		String s = "lenovohpdellapple";
		LinkedHashSet<Character> set = new LinkedHashSet<>();
		for(int i=0 ; i<s.length() ;i++) {
			set.add(s.charAt(i));
		}
		System.out.println(set);
		
		for(Character ch: set) {
			int count=0;
			for(int j=0 ; j<s.length() ; j++) {
				if(ch==s.charAt(j)) {
					count++;
				}
				
			}
			System.out.println(ch+" repeated "+count);
			
		}
		
		
		
		
		
		
		
		/*String s = "TestY /.,=+-/_antra";
		for(int i=s.length()-1 ; i>=0 ; i--) {
			System.out.print(s.charAt(i));
		}*/
		
		/*String s = "massagessssssssssssssssssssssssss";
		char key = 's';
		int count = 0;//2
		for(int i=0 ; i<=s.length()-1 ; i++) {
			if(s.charAt(i)==key) {
				count++;
			}
		}
		System.out.println(key+" is repeated "+count+" times");
		*/
		
		
		
		
		
		/*String s = "Sachin";
		for(int i=0 ; i<= s.length()-1 ; i++){//arr.length
			for(int j=0 ; j<=i ; j++) {
				System.out.print(s.charAt(j));//arr[j]
			}
			System.out.println();
		
		}*/
	}
}
