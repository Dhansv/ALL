package com.capgemini.contacts.ui;

import java.util.Scanner;

import com.capgemini.contacts.bean.ContactDetails;
import com.capgemini.contacts.service.ContactsHelper;
import com.capgemini.contacts.service.ContactsValidator;

public class ContactClient {
	
  static Scanner scanner = new Scanner(System.in);
    static char x;

	public static void main(String[] args) {

		ContactClient client = new ContactClient();
		client.menu();
	}
	public static ContactDetails takeUserInput(){
		ContactDetails contact = new ContactDetails();
	
		System.out.print("Enter Name : ");
		contact.setcName(scanner.nextLine());
		System.out.print("Enter Mobile No. : ");
		contact.setMobileNo1(scanner.nextLine());
		System.out.print("Do you want to add alternate Mobile No. ? ");
		
		x = scanner.nextLine().charAt(0);
		if(x=='Y' || x=='y')
		{
			System.out.print("Enter Mobile No. : ");
			contact.setMobileNo2(scanner.nextLine());
		}
		else{
			contact.setMobileNo2(null);
		}
		System.out.print("Enter Email Id : ");
		contact.setEmailID(scanner.nextLine());
		
		System.out.print("Select the Group (Friends/Family/CoWorkers) : ");
		String group=scanner.nextLine();
		contact.setGroupName(group);
		
		return contact;
	}
	

	public void menu(){
		int choice;
		boolean validate=false;
		ContactsValidator service = new ContactsValidator(); 
		ContactDetails contact = new ContactDetails();
		ContactsHelper helper = new ContactsHelper();
	
	
		while(true){
		System.out.println("Please enter your choice :");
		System.out.println("1. Add New Contact");
		System.out.println("2. Delete Contact");
		System.out.println("3. Exit");
		
		try {
			choice=Integer.parseInt(scanner.nextLine());
		
		
		switch(choice){
		case 1:
			do{
				System.out.println("Enter Details:");
				contact= takeUserInput();
				validate=service.validateDetails(contact);
				if(!validate){
					System.out.println("Please enter the correct Details");
				}
			}
			while(validate==false);
			helper.addContact(contact);
			
			break;
		case 2:
			System.out.println("Enter the contact ID: ");
			int contactID = Integer.parseInt(scanner.nextLine());
			helper.deleteContact(contactID);
			break;
		case 3:
			System.exit(0);
			
		default: 
			System.out.println("You have entered wrong choice");
		
		}
		} catch (NumberFormatException e) {
			System.out.println("Please enter valid choice");
		}
		}
	}
	
	
	
	
}


