package com.alpha.sesion47;

public class Account {
	double bal;
	int pwd;
	public Account(double bal, int pwd) {
		this.bal = bal;
		this.pwd = pwd;
	}
	public double checkBalance(int pwd)
	{
		if(pwd==this.pwd)
		{
			return bal;
		}
		else
			throw new WrongPwdException();
	}
	public double balanceWithdraw(double bal , double withdraw)
	{
		if(withdraw >= this.bal)
		{
			throw new WrongPwdException();
		}
		else
			bal-=withdraw;
		return bal;
	}
}
