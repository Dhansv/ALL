package com.cg.junit;

import com.dthoperator.service.*;
import com.cp.exp.*;
import org.junit.*;

//To perform unit testing on RechargeDataValidator class
public class Valitest {

	RechargeDataValidator aa=new RechargeDataValidator();
	@Test
	public void DTHOperator() throws RechargeException {

		Assert.assertEquals(true,aa.validatedthOperator("Reliance"));//to check positive testing
		Assert.assertEquals(true,aa.validatedthOperator("RelianCe"));//To check negative testing
	}
	
	@Test//Test annotation
	public void ConsumerNo() throws RechargeException {

		Assert.assertEquals(true,aa.validateConsumerNo("0909898988"));
		
	}
	@Test
	public void Plan() throws RechargeException {

		Assert.assertEquals(true,aa.validatePlan("Monthly"));
		
	}
	@Test
	public void Amount() throws RechargeException {

		Assert.assertEquals(true,aa.validateAmount("998"));
		
	}
	

}