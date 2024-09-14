package com.alpha.pgm2;

public class Mobile
{
	Sim s;
	private String Brand;
	private double price;
	public Mobile(String brand, double price , Sim s) 
	{
		Brand = brand;
		this.price = price;
		this.s=s;
	}
	Mobile(String brand, double price)
	{
		Brand = brand;
		this.price = price;
	}
	public String getBrand() {
		return Brand;
	}
	public void setBrand(String brand) {
		Brand = brand;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void mobileDetails()
	{
		System.out.println(Brand);
		System.out.println(price);	
	}
	public void mobileAndSimDetails() 
	{
		System.out.println(Brand);
		System.out.println(price);
		System.out.println(s.getSimNum());
		System.out.println(s.getS_P_N());
	}
	public void insertSim(Sim s)
	{
		if(this.s!=null)
		{
			System.out.println("insert simcard");
		}
		else
		{
			this.s=s;
			System.out.println("simcard inserted");
		}
	}
	public void removeSim()
	{
		this.s=null;
		System.out.println("sim removed successfully");
	}
	
}
