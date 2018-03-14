package com.dthoperator.ui;
import com.cp.exp.RechargeException;
import com.dthoperator.service.*;
import com.dthoperator.bean.*;
//importing all the necessary packages that includes our required class
import java.util.Random;
import java.util.Scanner;

public class RechargeClient {
	static Scanner cin=new Scanner(System.in);//using scanner class to input

	public static void main(String[] args) {
		RechargeClient r =new RechargeClient();int ch;
		try{
			//to try and catch wrong input entered
			while(true){
				System.out.println("Enter \n1.\tMake a Recharge \n2. \tDisplay Recharge Details \n3. \tExit");
				System.out.println("Please enter your choice");
				ch=cin.nextInt();
				if(ch>0){
				switch(ch){
					case 1:
						System.out.println("Recharge Details.");
						r.addRechargedetails();
						
						break;

					case 2:
						System.out.println("Enter the transaction ID for which you want to display");
						int t1=cin.nextInt();
						RechargeCollectionHelper.displayRechargeDetails(t1);
						break;
					case 3:System.out.println("Thank you");
						System.exit(0);
						break;	
					
					default:System.out.println("choose from the options given in the menu");
						System.exit(0);break;
					}
				}else {int ex=1;
				throw new RechargeException(ex);
				}
				}
			}
			catch(Exception e)
			{
				System.out.println("Enter correct choice format");}
	}
	
	public void addRechargedetails()
	{
		System.out.println("Enter Number of Recharges to be made");
		
		int Num_r;
		Num_r=cin.nextInt();//inputing no of recharges to be made at a time
		
		while(Num_r!=0)
		{
			
			System.out.println("Select DTH Operator (Airtel / DishTV / Reliance / TATASky)");
			String dth=cin.next();
			
			if(!RechargeDataValidator.validatedthOperator(dth)) 
			{System.out.println("Recharge failed!");
				System.exit(0);
			}
			System.out.println("Enter Registered Consumer No.:");
			String cNo=cin.next();
			if(!RechargeDataValidator.validateConsumerNo(cNo))
			{System.out.println("Recharge failed!");
				System.exit(0);
			}
			System.out.println("Select Plan(Monthly / Quaterly / Half yearly / Annual) :");
			String pln=cin.next();
			if(!RechargeDataValidator.validatePlan(pln))
			{System.out.println("Recharge failed!");
				System.exit(0);
			}
			System.out.println("Enter Amount (Rs.):");
			String price=cin.next();
			if(!RechargeDataValidator.validateAmount(price))
			{System.out.println("Recharge failed!");
				System.exit(0);
			}
 			
			       
			

			Random randomGenerator = new Random();
			int txn_id = randomGenerator.nextInt(9999);//generating random 4 digit number
			//int id=Integer.parseInt(item_id);
			RechargeDetails rd=new RechargeDetails(Integer.parseInt(cNo),Integer.parseInt(price),dth,pln,txn_id);
			RechargeCollectionHelper.addRechargeDetails(rd);
			System.out.println("“Successful Recharge. Transaction ID : <"+txn_id+">");
			
			Num_r--;
		
	}
	}
		
		
		// TODO Auto-generated method stub

	}


