package com.alpha.thread2;

public class Thread1 extends Thread {
	
	public void run() {
		for (int i = 1; i <=5; i++)
		{
			System.out.println(getName()  + ":"+ i);
		}
	}
  Thread1(){
	  
  }
  Thread1(String name)
  {
	  super(name);
  }


}
