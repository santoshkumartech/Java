package com.alpha.thread1;

public class Example1 {

	public static void main(String[] args) {
		
		Thread t = Thread.currentThread();
		System.out.println(t.getName());
		System.out.println(t.getId());
		System.out.println(t.getPriority());
		System.out.println(t.getState());
		System.out.println(t.getName());

	}

}
