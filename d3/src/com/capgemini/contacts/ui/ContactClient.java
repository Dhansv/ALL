package com.capgemini.contacts.ui;

import java.util.Scanner;

import com.capgemini.contacts.bean.ContactDetails;
import com.capgemini.contacts.service.ContactsHelper;
import com.capgemini.contacts.service.ContactsValidator;

public class ContactClient {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		ContactClient client = new ContactClient();
		client.displayMenu();
	}
	//Method for Displaying the Menu
	public void displayMenu(){
		int choice;
		boolean validate=false;
		ContactsValidator service = new ContactsValidator(); 
		ContactDetails details = new ContactDetails();
		ContactsHelper helper = new ContactsHelper();
	
	
		while(true){
		System.out.println("Welcome to the Menu!!!");
		System.out.println("------------------------");
		System.out.println("Please Enter Your Choice :");
		System.out.println("1. Add New Contact");
		System.out.println("2. Delete Contact");
		System.out.println("3. Exit");
		
		try {
			choice=Integer.parseInt(scan.nextLine());
		
		//Switch Case to take input of menu options from user
		switch(choice){
		case 1:
			do{
				System.out.println("Enter Details:");
				details= takeUserInput();
				validate=service.validateDetails(details);
				if(!validate){
					System.out.println("Please Enter Correct Details");
				}
			}
			while(validate==false);
			helper.addContactDetails(details);
			
			break;
		case 2:
			System.out.println("Enter the contact ID: ");
			int contactID = Integer.parseInt(scan.nextLine());
			helper.deleteContactDetails(contactID);
			break;
		case 3:
			System.out.println("Thank You!");
			System.exit(0);
			
			
		default: 
			System.out.println("You have entered wrong choice");
		
		}
		} catch (NumberFormatException e) {
			
			System.out.println("Please enter valid choice");
		}
		}
	}
	//Taking User inputs for Contact Details
	public static ContactDetails takeUserInput(){
		ContactDetails details = new ContactDetails();
	
		System.out.print("Enter Name : ");
		details.setcName(scan.nextLine());
		System.out.print("Enter Mobile No. : ");
		details.setMobileNo1(scan.nextLine());
		System.out.print("Do you want to add alternate Mobile No. ?(Y/N) ");
		
		char chr;
		chr = scan.nextLine().charAt(0);
		if(chr=='Y' || chr=='y')
		{
			System.out.print("Enter Mobile No. : ");
			details.setMobileNo2(scan.nextLine());
		}
		else{
			details.setMobileNo2(null);
		}
		System.out.print("Enter Email Id : ");
		details.setEmailID(scan.nextLine());
		
		System.out.print("Select the Group (Friends/Family/CoWorkers) : ");
		String group=scan.nextLine().toUpperCase();
		details.setGroupName(group);
		
		return details;
	}
}
