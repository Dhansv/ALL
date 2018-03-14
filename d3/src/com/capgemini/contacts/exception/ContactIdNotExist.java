package com.capgemini.contacts.exception;

public class ContactIdNotExist extends Exception {
	//Exception to restrict input of invalid contact id during deletion.
	public ContactIdNotExist(){
		System.out.println("Contact Id not exist");
	}
}
