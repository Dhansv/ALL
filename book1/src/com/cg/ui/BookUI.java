package com.cg.ui;

import java.util.Scanner;

import com.cg.bean.BookSchema;
import com.cg.exception.BookException;
import com.cg.service.BookCollectionHelper;
import com.cg.service.BookDataValidator;

public class BookUI {
	static Scanner sc=new Scanner(System.in);
	static BookCollectionHelper collectionhelper=null;
	
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice=0;
		collectionhelper=new BookCollectionHelper();
		
		while(true)
		{
			System.out.println("1:Add New Book \n"+
					"2:Find total count of books \n3:Exit");

			System.out.println("\nEnter UR Choice: ");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:	enterNewBookDetails();break;
			case 2: collectionhelper.displayBookCount();break;
			default:System.exit(0);			
			}
		}
	}
	
	private static void enterNewBookDetails() 
	{
system.out.println("How many new books ? ");
		//System.out.println("Enter count of book purchased by shopkeeper? ");
		
		int bcount=sc.nextInt();
		
		while (bcount!=0) {
		
		System.out.println("Enter Book Id:");
		String bookId=sc.next();
		try 
		{
			if(BookDataValidator.validateBookId(bookId))
			System.out.println("Enter Book name:");
			String bookName=sc.next();
			if(BookDataValidator.validateBookName(bookName))
			{
				System.out.println("Enter Price ");
				String bookPrice =sc.next();
				if(BookDataValidator.validateBookPrice(/*Integer.parseInt*/(bookPrice)))
				{
						BookSchema book=new BookSchema(Integer.parseInt(bookId), bookName, Double.parseDouble(bookPrice));
						collectionhelper.addNewBookDetails(book);
						//System.out.print(bcount+""+"Book Added Successfully in the Inventory\n");
				}	
			}
						
		} 
		catch (BookException e)
		{			
			System.out.println(e.getMessage());
		}
		bcount--;
}
		
	}
}
