package com.capgemini.contacts.exception;


	public class ContactIdException extends Exception {
		public ContactIdException(){
			super("Id does not exists");
		}
		public void printStackTrace() {
			// TODO Auto-generated method stub
			
		}
	}

