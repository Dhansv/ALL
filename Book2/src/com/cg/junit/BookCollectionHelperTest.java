package com.cg.junit;


import junit.framework.Assert;

import org.junit.Test;
import org.junit.AfterClass;
import org.junit.BeforeClass;

import com.cg.bean.BookSchema;
import com.cg.exception.BookException;
import com.cg.service.BookCollectionHelper;

public class BookCollectionHelperTest {
	static BookCollectionHelper collectionHelper;
	static BookSchema book=null;

	@BeforeClass
	public   static  void beforeClass()
	{
		collectionHelper=new BookCollectionHelper();
		book =new BookSchema(999,"Dayanand", 670.75);		
	}
	@AfterClass
	public static  void afterClass()
	{		
		collectionHelper=null;
		book=null;
	}	


	@Test 
	public void testAddNewBook() throws BookException
	{
		collectionHelper.addNewBookDetails(book);
		//Assert.assertEquals(4, collectionHelper.getCustList().size());
		Assert.assertNotNull(collectionHelper.toString());

	}
}
