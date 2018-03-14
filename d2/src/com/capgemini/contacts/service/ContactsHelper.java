package com.capgemini.contacts.service;

import com.capgemini.contacts.bean.ContactDetails;
import com.capgemini.contacts.dao.ContactDao;
import com.capgemini.contacts.exception.ContactIdException;
import com.capgemini.contacts.exception.ContactNameException;

public class ContactsHelper {

  static ContactDao dao = new ContactDao();
  public void addContact(ContactDetails contactDetails){
		try {
			dao.addToList(contactDetails);
		} catch (ContactNameException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
}
public void deleteContact(int contactID){
		try {
			dao.deleteFromList(contactID);
		} catch (ContactIdException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
}

static{
		try {
			dao.addToList(new ContactDetails(1,"Kirti Roy","9234534500",null,"kirtiroy@yahoo.co.in","family"));
		} catch (ContactNameException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			dao.addToList(new ContactDetails(2,"Raj Singh","8288866678","8234343434","Arun16@gmail.com","friends"));
		} catch (ContactNameException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
}
}
