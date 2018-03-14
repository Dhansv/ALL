package com.capgemini.contacts.service;

import com.capgemini.contacts.bean.ContactDetails;
import com.capgemini.contacts.dao.ClientDao;
import com.capgemini.contacts.exception.ContactIdNotExist;
import com.capgemini.contacts.exception.DuplicateNameException;

public class ContactsHelper {
	static ClientDao dao = new ClientDao();
	public void addContactDetails(ContactDetails contactDetails){
		try {
			dao.addToList(contactDetails);
		} catch (DuplicateNameException e) {
			
		}
	}
	public void deleteContactDetails(int contactID){
		try {
			dao.removeFromList(contactID);
		} catch (ContactIdNotExist e) {
			
			
		}
	}
	//Adding the given contact details using a static block in a service class.
	static{
		try {
			dao.addToList(new ContactDetails(1,"Kirti Roy","9234534500",null,"kirtiroy@yahoo.co.in","FAMILY"));
		} catch (DuplicateNameException e) {
			
			e.printStackTrace();
		}
		try {
			dao.addToList(new ContactDetails(2,"Raj Singh","8288866678","8234343434","Arun16@gmail.com","FRIENDS"));
		} catch (DuplicateNameException e) {
			
			e.printStackTrace();
		}
	}
}
