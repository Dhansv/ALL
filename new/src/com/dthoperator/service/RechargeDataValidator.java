package com.dthoperator.service;

import  com.cp.exp.*;
//To perform validation on recharge details inputs
import java.util.regex.*;
public class RechargeDataValidator {
	
	public static boolean validatedthOperator(String dthOperator) //to validate operator
	{
		String pattern = "(Airtel|DishTV|Reliance|TATASky)";
		try{
			//To try and catch if error generates
		
		if(Pattern.matches(pattern,dthOperator))
			//Pattern.matches(patternString, content);
		{
			return true;
		}
		else
		
			throw new RechargeException();//throwing our own defined exception
			
			
		}
		catch(RechargeException e){
			System.out.println("Wrong dthOperator selected");
			return false;
			
		}
	}
	
	public static boolean validateConsumerNo(String consumerNo) //to validate consumer number 
	{
		String pattern = "[0-9]{10}";
		try{
			
		if(Pattern.matches(pattern,consumerNo))
		{
			return true;
		}
		else
		{
			throw new RechargeException();
			
		}
		}
		catch(RechargeException e){
			System.out.println("Wrong Consumer number entered");
			return false;
			}
		}
	
	public static boolean validatePlan(String plan) //to validate plan
	{
		String pattern = "(Monthly|Quaterly|Half yearly|Annual)";
		try{
			
		if(Pattern.matches(pattern,plan))

		{
			return true;
		}
		else
		{
			throw new RechargeException();
			//return false;
		}
		}
		catch(RechargeException e){
			System.out.println("Wrong plan Entered");
			return false;
		}
	}
	public static boolean validateAmount(String amount) //to validate amount
	{
		String pattern = "[0-9]{3,4}";
		try{
			
		if(Pattern.matches(pattern,amount))

		{
			return true;
		}
		else
		{
			throw new RechargeException();
			
		}
		}
		catch(RechargeException e){
			System.out.println("Wrong amount Entered");
			return false;
		}
	}

}
