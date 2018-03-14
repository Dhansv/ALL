package com.dthoperator.service;

import java.util.ArrayList;
import java.util.List;

import com.dthoperator.bean.RechargeDetails;

public class RechargeCollectionHelper {

static List<RechargeDetails> list=new ArrayList<RechargeDetails>();

static{
	
	RechargeDetails obj1=new RechargeDetails("Airtel",1089343431,"Monthly",210,4567);
	RechargeDetails obj2=new RechargeDetails("DishTV",(int)3033221222L,"Yearly",1260,2345);
	RechargeDetails obj3=new RechargeDetails("Reliance",(int)8923434304L,"Quaterly",650,1234);
	
	list.add(obj1);
	list.add(obj2);
	list.add(obj3);
}
	
	public void addRechargeDetails(RechargeDetails refrence)
	{
		list.add(refrence);
	}
	public static void displayRechargeDetails(int transactionID) {
		for(Object object: list)
		{
			RechargeDetails drd=(RechargeDetails)object;
			if(drd.getTransactionID()==transactionID)
			{
				System.out.println(object);
			}
		}
	
}
}
