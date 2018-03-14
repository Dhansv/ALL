package com.dthoperator.service;

import java.util.regex.*;


import com.dthoperator.exception.OnlineRechargeException;

public class RechargeDataValidator {
	
	public  static  boolean validateDthOperator(String dthOperator)throws OnlineRechargeException
	{
		if(dthOperator.toLowerCase().equals("airtel")||dthOperator.toLowerCase().equals("dishtv")||dthOperator.toLowerCase().equals("reliance")||dthOperator.toLowerCase().equals("tatasky"))
		{
			return true;
		}
		else
		{
			throw new OnlineRechargeException("Invalid DTHOperator");
		}
	}
	
	public  static  boolean validateConsumerNo(String consumerNo)throws OnlineRechargeException
	{
		String pattern="\\d{10}";
		if(Pattern.matches(pattern,consumerNo))
		{
			return true;
		}
		else
		{
			throw new OnlineRechargeException("Consumer No. should contain only a 10-digit number.");
		}
	}
	
	public  static  boolean validateRechargePlan(String rechargePlan)throws OnlineRechargeException
	{
		if(rechargePlan.toLowerCase().equals("monthly")||rechargePlan.toLowerCase().equals("quaterly")||rechargePlan.toLowerCase().equals("half yearly")|rechargePlan.toLowerCase().equals("annual"))
		{
			return true;
		}
		else
		{
			throw new OnlineRechargeException("Invalid RechargePlan");
		}
	}
	public  static  boolean validateAmount(String amount)throws OnlineRechargeException
	{
		
			String pattern = "[1-9]{1}[0-9]{2,3}";
			if(Pattern.matches(pattern,amount))
			{
				return true;
			}
			else
			{
			throw new OnlineRechargeException("Only numbers(paisa)is Allowed");
			}
		
	}
	
	public  static  boolean validateTransactionID(String transactionID)throws OnlineRechargeException
	{
		String pattern="\\d{4}";
		if(Pattern.matches(pattern,transactionID))
		{
			return true;
		}
		else
		{
			throw new OnlineRechargeException("Only 4-digit Transaction ID is Allowed");
		}
	}

}
