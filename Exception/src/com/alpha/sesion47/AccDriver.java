package com.alpha.sesion47;

public class AccDriver {

	public static void main(String[] args) {
		Account a = new Account(50000,1234);
		System.out.println("main starts");
		
		try {
			a.checkBalance(500000);
			System.out.println("try block gets executed");
		}
		catch(WrongPwdException w)
		{
			System.out.println(w.getMessage());
			System.out.println("catch block gets executed");
		}

	}

}
