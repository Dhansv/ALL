package com.dthoperator.bean;

public class RechargeDetails 
//preparing the schema of the application
{

	public int consumerNo;
	public String dthOperator;
	public String rechargePlan;
	public int amount;
	public int transactionID;
	public RechargeDetails()
	{
		}

	public RechargeDetails(int consumerNo,int amount,String dthOperator,String rechargePlan,int transactionID)
	{
		this.consumerNo=consumerNo;  // using this operator to remove ambiguity among variables
		this.dthOperator=dthOperator;
		this.rechargePlan=rechargePlan;
		this.amount=amount;
		this.transactionID=transactionID;}


	public String toString()  //overloading toString method
	{
		return "dthOperator=" + dthOperator + ", consumerNo=" + consumerNo
				+ ", rechargePlan=" + rechargePlan + ", transactionID=" + transactionID;
	}

	
}
