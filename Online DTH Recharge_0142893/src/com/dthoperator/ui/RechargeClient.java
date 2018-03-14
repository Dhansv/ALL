package com.dthoperator.ui;

import java.util.Random;
import java.util.Scanner;

import com.dthoperator.exception.OnlineRechargeException;
import com.dthoperator.service.RechargeCollectionHelper;
import com.dthoperator.service.RechargeDataValidator;
import com.dthoperator.bean.RechargeDetails;

public class RechargeClient {
	static Scanner scanner=new Scanner(System.in);
	
	
	public static void main(String[] args) throws OnlineRechargeException
	{
		 int userChoice=0;
		 while(true)
		 {
			 System.out.println("************Online DTH Recharge Application*************\n"
			 		+ "1.Make a Recharge\n"
			 		+ "2.Display Recharge Details\n"
			 		+ "3.Exit\n"
			 		+ "Enter your choice:");
			 
		
	
		int userchoice=scanner.nextInt();
		
		 	switch(userchoice)
		 	{
		 	case 1:{
		 		System.out.println("1. Make a Recharge");
		 		makeaRecharge();
		 		break;
		 		}
		 	
		 	case 2:{
		 		System.out.println("2. Display Recharge Details");
		 		System.out.println("Enter Transaction ID");
		 		int transactionID=scanner.nextInt();
		 		RechargeCollectionHelper.displayRechargeDetails(transactionID);
		 		break;
		 		}

		 	case 3:{
		 		System.exit(0);
		 		break;
		 		}
		 	
		 	}
		 }

	
	public static void makeaRecharge() throws OnlineRechargeException{
		
		System.out.println("DTH Recharge Details for Home ");
		int dthoperatorcount=2;
		
		while(dthoperatorcount!=0)
		{
			
			System.out.println("Select DTH Operator (Airtel / DishTV / Reliance / TATASky");
			String dthoperator=scanner.next();
			try {
			if(!RechargeDataValidator.validateDthOperator(dthoperator)) 
			{
				System.out.println("Invalid dthoperator");
			}
			
			System.out.println("Enter Registered Consumer No.");
			String consumerNo=scanner.next();
			if(!RechargeDataValidator.validateConsumerNo(consumerNo)) 
			{
				System.out.println("Invalid consumerNo");
			}
			
			System.out.println("Select Plan(Monthly / Quaterly / Half yearly / Annual)");
			String rechargePlan=scanner.next();

			if(!RechargeDataValidator.validateRechargePlan(rechargePlan)) 
			{
				System.out.println("Invalid recharge plane");
			}
			
			System.out.println("Enter Amount (Rs.)");
			String amount=scanner.next();

			if(!RechargeDataValidator.validateAmount(amount)) 
			{
				System.out.println("Invalid amount");
			}

			

			//double c_id=Double.parseDouble(consumer_id);
			//int amount=Integer.parseInt(amount);
			Random random=new Random();
			int transactionID=random.nextInt(10000);
			
			RechargeDetails obj=new RechargeDetails(dthoperator,consumerNo,rechargePlan,amount,transactionID);
			RechargeCollectionHelper.addRechargeDetails(obj):
			
			catch(OnlineRechargeException e)
			{
				System.out.println("Invalid");
				
			}
			dthoperatorcount--;
			if(dthoperatorcount==1)
			System.out.println("DTH Recharge Details for Office ");
			
		}	
		
	

}


