package com.capgemini.contacts.exception;

public class DuplicateNameException extends Exception {
	//Exception to avoid entry of same name.
	public DuplicateNameException(){
		System.out.println("Duplicate Contact. Failed to add the Contact");
	}
}
