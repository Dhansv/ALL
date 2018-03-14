package com.dthoperator.junit;

import junit.framework.Assert;


import com.dthoperator.exception.OnlineRechargeException;
import com.dthoperator.service.RechargeCollectionHelper;
import com.dthoperator.service.RechargeDataValidator;
import com.dthoperator.bean.RechargeDetails;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;


public class RechargeCollectionHelperTest {
	static RechargeCollectionHelper collectionHelper;
	static RechargeDetails=null;

	@BeforeClass
	public   static  void beforeClass()
	{
		collectionHelper=new RechargeCollectionHelper();
		recharge =new RechargeDetails;		
	}
	@AfterClass
	public static  void afterClass()
	{		
		collectionHelper=null;
		Recharge=null;
	}	


	@Test 
	public void testAddNewBook() throws RechargeCollectionHelper
	{
		collectionHelper.addNewRechargeDetails(recharge);
		//Assert.assertEquals(4, collectionHelper.getCustList().size());
		Assert.assertNotNull(collectionHelper.toString());

	}

}
