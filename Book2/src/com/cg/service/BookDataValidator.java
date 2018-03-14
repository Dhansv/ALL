package com.cg.service;

import java.util.regex.Pattern;

import com.cg.exception.BookException;

public class BookDataValidator {
	public  static  boolean validateBookName(String bookName)throws BookException
	{
		String custPattern="[A-Za-z]{6,20}";
		if(Pattern.matches(custPattern, bookName))
		{
			return true;
		}
		else
		{
			throw new BookException("Book Name should start with CAPITAL & Min 6 and Max 20 characters Allowed");
		}
	}
	
	public  static  boolean validateBookId(String bookId)throws BookException
	{
		String IdPattern="\\d{3}";
		if(Pattern.matches(IdPattern, bookId))
		{
			return true;
		}
		else
		{
			throw new BookException("Only 3-digit BookID is Allowed");
		}
	}
	
	public  static  boolean validateBookPrice(int bookPrice)throws BookException
	{
		
		if(bookPrice>1000)
		{
			throw new BookException("Enter price less than 1000");
		}
		String pricePattern="[0-9]+";
		if(Pattern.matches(pricePattern,Integer.toString(bookPrice)))
		{
			
			return true;
		
		}
		else
		{
			throw new BookException("Only numbers(paisa)is Allowed");
		}
		
	}
}
