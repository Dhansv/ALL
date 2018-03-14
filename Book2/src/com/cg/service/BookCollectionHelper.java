package com.cg.service;
import java.util.ArrayList;
//import java.util.HashSet;
import java.util.Iterator;

import com.cg.bean.BookSchema;

public class BookCollectionHelper {
	private  static ArrayList<BookSchema> bookList=null;
	//private  static HashSet<BookSchema> bookList=null;
	static
	{
		bookList=new ArrayList<BookSchema>();
		BookSchema b1=new BookSchema(111,"See into the Sea of C",350);
		BookSchema b2=new BookSchema(222,"Learning Java in 21 Days",450.50);
		BookSchema b3=new BookSchema(333,"ASP.Net with C#", 250.75);

		bookList.add(b1);
		bookList.add(b2);
		bookList.add(b3);		
      
		
		//bookList=new HashSet<BookSchema>();
		
	//	HashSet<BookSchema> set=new HashSet<BookSchema>();  
	    //Creating Books  
	
		/*BookSchema b1=new BookSchema(111,"See into the Sea of C",350);
		BookSchema b2=new BookSchema(222,"Learning Java in 21 Days",450.50);
		BookSchema b3=new BookSchema(333,"ASP.Net with C#", 250.75);

		bookList.add(b1);
		bookList.add(b2);
		bookList.add(b3);	*/	
		
		
	}
//public BookCollectionHelper(){}
	
	///*************Add New Book in Hashset************/
	public void addNewBookDetails(BookSchema book) 
	{			
			bookList.add(book);				
	}
	
	/*public static HashSet<BookSchema> getbookList() {
		return bookList;
	}

	public static void setbookList(HashSet<BookSchema> bookList) {
		BookCollectionHelper.bookList = bookList;
	}
*/
	
	/*************Fetch All Book Details ***********/

	public static  void displayBookCount()
	{
		Iterator<BookSchema> bookIt=bookList.iterator();
		BookSchema tempBook=null;
		
		int totalCount=0;
		while(bookIt.hasNext())
		{
			totalCount++;
			tempBook=bookIt.next();
			System.out.println(tempBook);			
		}
		System.out.println("Total Count of Books" + totalCount);
	}
}
