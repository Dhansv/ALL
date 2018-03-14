package com.capgemini.contacts.service;

import java.util.Random;

import com.capgemini.contacts.bean.ContactDetails;

public class ContactsValidator {
	//Function for validation of client name
	public boolean validateCName(String cName){
		return cName.matches("[a-zA-Z\\s]{5,15}");
	}
	//Function for validation of mobile numbers.
	public boolean validateMobileNo(String mobileNo){
		return mobileNo.matches("[7-9][0-9]{9}");
		
	}
	//Function for validation of Email id
	public boolean validateEmailID(String emailID){
		return emailID.matches("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$");
	}
	//Function for validation of group name
	public boolean validateGroupName(String groupName){
		return groupName.matches("FRIENDS|FAMILY|COWORKERS");
	}
	public boolean validateDetails(ContactDetails details) {
		
		try {
			ContactsValidator contactValidator = new ContactsValidator();
			if (contactValidator.validateCName(details.getcName())&&contactValidator.validateMobileNo(details.getMobileNo1())&&contactValidator.validateEmailID(details.getEmailID())&&contactValidator.validateGroupName(details.getGroupName())){
				 if(details.getMobileNo2()==null||contactValidator.validateMobileNo(details.getMobileNo2()))
				 {	Random rn = new Random();  //creating random values for contact ID
				 	details.setContactID(rn.nextInt(10));
				 	return true;
				 }
				 else{
					 return false;
				 }
			}
			else{
				return false;
			}
		} catch (Exception e) {
			System.out.println("Failed to add the Contact.");
			return false;
		}
		
		
	}
}
