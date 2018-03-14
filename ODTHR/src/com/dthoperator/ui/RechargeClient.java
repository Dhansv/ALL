package com.dthoperator.ui;

import java.util.Scanner;

import com.dthoperator.exception.OnlineRechargeException;
import com.dthoperator.service.RechargeCollectionHelper;
import com.dthoperator.bean.RechargeDetails;

public class RechargeClient {
	
	//creating object for bean class to access getters and setters
	RechargeDetails rechargeDetails=new RechargeDetails();
	
	//creating object for Recharge Collection Helper class to access the collector
	RechargeCollectionHelper reCollection=new RechargeCollectionHelper();
	
	//to get user inputs
	Scanner scanner=new Scanner(System.in);
	
	//method to make a recharge
	public void makeaRecharge()throws OnlineRechargeException
	{
		//to get the dthOperator 
		System.out.println("Select DTH Operator(Airtel / DishTV / Reliance / TATASky) :");
		String dthOperator=scanner.next();
		rechargeDetails.setDthOperator(dthOperator);

		//to get Registered Consumer No.:
		System.out.println("Enter Registered Consumer No.:");
		int consumerNo=scanner.nextInt();
		rechargeDetails.setConsumerNo(consumerNo);

		//to get the rechargePlan
		System.out.println("Select Plan(Monthly / Quaterly / Half yearly / Annual) :");
		String rechargePlan=scanner.next();
		rechargeDetails.setRechargePlan(rechargePlan);

		//to get amount
		System.out.println("Enter Amount (Rs.):");
		int amount=scanner.nextInt();
		rechargeDetails.setAmount(amount);	
		
		//save the bean details in the collection
		reCollection.addRechargeDetails(rechargeDetails);
		
		System.out.println("Successful Recharge. Transaction ID :"+rechargeDetails.getTransactionID());
	}
	
	//method to Display Recharge Details
	public void displayRechargeDetails()throws OnlineRechargeException
	{
		System.out.println("Enter the transaction ID to display your recharge details:");
		int transactionId=scanner.nextInt();
		
		//get the details from  collection
		reCollection.displayRechargeDetails(transactionId);
		
	}
	
public static void main(String[] args) {
		
		RechargeClient rechargeClient=new RechargeClient ();
		
		Scanner scanner=new Scanner(System.in);
		
		do{
		System.out.println("************Online DTH Recharge Application*************\n1.Make a Recharge\n2.Display Recharge Details\n3.Exit\nEnter your choice:");
		int userChoice=scanner.nextInt();
		
		switch (userChoice) {
		case 1:
			try {
				
				rechargeClient.makeaRecharge();
				
			} catch (OnlineRechargeException e) {
				System.out.println("There is a problem in recharging your mobile with the details yopu have given. Please check the deatils once and try again...");
			}
			break;
			
		case 2:
			
			try {
				
				rechargeClient.displayRechargeDetails();
				
			} catch (OnlineRechargeException e) {
				System.out.println("There is problme in viewing your recharge details. Please try again later..");
			}
			
			break;
			
		case 3:
			System.exit(0);
			break;
		}
		
		}while(true);
	}


}


