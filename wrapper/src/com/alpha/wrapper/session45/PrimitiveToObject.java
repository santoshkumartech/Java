package com.alpha.wrapper.session45;

public class PrimitiveToObject {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long l = 309876l;
		Long obj =Long.valueOf(l);
		System.out.println(obj);
		char ch = 'a';
		Character obj2 = Character.valueOf(ch);
		System.out.println(obj2);
		double d = 84.96;
		Double obj3 = Double.valueOf(d);
		System.out.println(obj3);
		System.out.println(obj3+30);
		int  i = 20;
		String s1= String.valueOf(i);
		System.out.println(s1+20);
		int i2= 80;
		String s2 = String.valueOf(i2);
		System.out.println(s2+55);
	}

}
