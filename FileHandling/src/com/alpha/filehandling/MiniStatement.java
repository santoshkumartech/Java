package com.alpha.filehandling;

public class MiniStatement
{
	long AccNo;
	int pwd;
	double bal;
	public MiniStatement(long accNo, int pwd, double bal) {
		this.AccNo = AccNo;
		this.pwd = pwd;
		this.bal = bal;
	}
	public double withDraw(int pwd,double amt)
	{
		if(pwd==this.pwd)
		{
			if(amt<=bal)
			{
			bal -= amt;
			return 2;
			}
			else if(amt>bal)
			{
				return 0;
			}
		}
		return 1;
	}
	public boolean deposit(int pwd, double amt)
	{
		if(pwd==this.pwd)
		{
			bal += amt;
			return true;
		}
		else
		{
			return false;
		}
}
}