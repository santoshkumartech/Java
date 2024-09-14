package com.alpha.pgm2;

public class MobileDriver {

	public static void main(String[] args) 
	{
		Mobile m  = new Mobile("iphone13", 130000.00);
		//m.mobileDetails();
		//m.removeSim();
		m.insertSim(new Sim(8861069888l,"airtel"));
		m.mobileAndSimDetails();
		m.removeSim();
		m.mobileDetails();
		
		
	}

}
