package com.dthoperator.service;




import com.dthoperator.bean.*;

import java.util.*;
public class RechargeCollectionHelper { 
	static List<RechargeDetails> li=new ArrayList<RechargeDetails>();
	static{
		
		RechargeDetails obj1=new RechargeDetails(1089343431,210,"airtel","Monthly",4567);
		li.add(obj1);
		RechargeDetails obj2=new RechargeDetails(303322122,1260,"DishTV","Yearly",2345);
		li.add(obj2);
		RechargeDetails obj3=new RechargeDetails(892343430,650,"Reliance","Quaterly",1234);
		li.add(obj3);
	}//To store already present Recharge details
	
	
	public static void addRechargeDetails(RechargeDetails r)
	{
		li.add(r);
		System.out.println("Record Added");
	}//To Add the objects containing recharges details
	public static void displayRechargeDetails(int t)
	{int x1=0;
		 List<RechargeDetails> al;
		Iterator itr=li.iterator();  
		  //traversing elements of ArrayList object by using iterator class object 
		  while(itr.hasNext()){  
		    RechargeDetails st=(RechargeDetails)itr.next();  
		      if(st.transactionID==t)
		      {x1++;
			
		    	System.out.print("Recharge details for "+t+":\t\t");  System.out.print("DTH Operator "+st.dthOperator+"\t");
		      System.out.print("Plan"+st.rechargePlan+"\t");
		      System.out.print("Consumer number "+st.consumerNo+"\t");
		      System.out.print("Amount "+st.amount+"\t");
		      System.out.print("Transaction ID "+st.transactionID+"\t");}
		      
		  }
		  if(x1==0)
			  System.out.println("Transaction ID doesn't exist");
		  }
}
