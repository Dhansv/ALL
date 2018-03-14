package com.capgemini.contacts.dao;

import java.util.ArrayList;
import java.util.Iterator;

import com.capgemini.contacts.bean.ContactDetails;
import com.capgemini.contacts.exception.ContactIdException;
import com.capgemini.contacts.exception.ContactNameException;

public class ContactDao {
	static ArrayList array = new ArrayList();
	public void addToList (ContactDetails details)throws ContactNameException{
		boolean flag= false;
		Iterator it = array.iterator();
		while(it.hasNext()){
			ContactDetails cd=(ContactDetails) it.next();
			if(cd.getcName().equals(details.getcName())){
				flag=true;
				throw new ContactNameException();
			}
		}
		if(flag==false){
			
			try {
				array.add(details);
			} catch (Exception e) {
				System.out.println("Failed to add the contact");
			}
			System.out.println("Contact Added");
			System.out.println("Contact ID is: " + details.getContactID() );
		}
	
	}
	
	
	
	public void deleteFromList(int contactID) throws ContactIdException{
		Iterator iterator = array.iterator();
		boolean flag=false;
		int i=0;
		while(iterator.hasNext()){
			ContactDetails cd=(ContactDetails) iterator.next();
			if(cd.getContactID()==contactID){
				array.remove(cd);
				flag=true;
				System.out.println("Contact deleted successfully");
				break;
			}
			i++;
		}
		if(!flag){
			throw new ContactIdException();
		}
		
	}
}


	
