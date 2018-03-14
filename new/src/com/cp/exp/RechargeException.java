package com.cp.exp;

import java.lang.Exception;
//TO create user defined exception class	
public class RechargeException extends Exception{

		
		public RechargeException()
		{
			

		}
		public RechargeException(int a)//To overload the constructor and use it during negative choice input
		{
			System.out.println(" Choice can't be a negative integer");

		}


}
