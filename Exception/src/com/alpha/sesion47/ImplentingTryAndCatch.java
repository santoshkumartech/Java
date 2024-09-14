package com.alpha.sesion47;

import javax.print.attribute.standard.PrinterState;

//import jdk.internal.org.objectweb.asm.tree.TryCatchBlockNode;

//import java.util.Scanner;

public class ImplentingTryAndCatch {
	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		//System.out.println("enter number1");
		//System.out.println("enter number2");
		int num1 =10;
	
		int num2 = 0;
		int result =0;
	try 
	{
		result = num1/num2;
		//result=10/0;
	}
	catch(ArithmeticException e) 
	{
		e.printStackTrace();
		//e.getMessage();
	}
 }
}