package com.capgemini.contacts.junit;

import org.junit.Test;

import com.capgemini.contacts.bean.ContactDetails;
import com.capgemini.contacts.service.ContactsHelper;

public class ContactsHelperTest {

	ContactsHelper ch = new ContactsHelper();
	@Test(timeout=10)
	public void test() {
		ch.addContact(new ContactDetails(2,"Raj Singh","8288866678","8234343434","Arun16@gmail.com","FRIENDS"));
	}

	@Test(timeout=10)
	public void testDeleteContactDetatails() {
		ch.deleteContact(1);
	}
	

}

	