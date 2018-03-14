package com.capgemini.contacts.exception;

public class ContactNameException extends Exception {
    public ContactNameException(){
		super("Duplicate Contact. Failed to add the contact");
    }

	public void printStackTrace() {
		// TODO Auto-generated method stub
		
	}

}
