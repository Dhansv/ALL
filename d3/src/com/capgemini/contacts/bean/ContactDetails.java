package com.capgemini.contacts.bean;

public class ContactDetails {
	private int contactID;
	private String cName;
	private String mobileNo1;
	private String mobileNo2;
	private String emailID;
	private String groupName;
	public int getContactID() {
		return contactID;
	}
	//Setter function of contactId
	public void setContactID(int contactID) {
		this.contactID = contactID;
	}
	//Getter function of cName
	public String getcName() {
		return cName;
	}
	//Setter function of cName
	public void setcName(String cName) {
		this.cName = cName;
	}
	//Getter function of MobileNo1
	public String getMobileNo1() {
		return mobileNo1;
	}
	//Setter function of MobileNo1
	public void setMobileNo1(String mobileNo1) {
		this.mobileNo1 = mobileNo1;
	}
	//Getter function of MobileNo2
	public String getMobileNo2() {
		return mobileNo2;
	}
	//Setter function of MobileNo2
	public void setMobileNo2(String mobileNo2) {
		this.mobileNo2 = mobileNo2;
	}
	//Getter function of EmailID
	public String getEmailID() {
		return emailID;
	}
	//Setter function of EmailID
	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}
	//Getter function of GroupName
	public String getGroupName() {
		return groupName;
	}
	//Setter function of GroupName 
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	public ContactDetails(int contactID, String cName, String mobileNo1,
			String mobileNo2, String emailID, String groupName) {
		super();
		this.contactID = contactID;
		this.cName = cName;
		this.mobileNo1 = mobileNo1;
		this.mobileNo2 = mobileNo2;
		this.emailID = emailID;
		this.groupName = groupName;
	}
	public ContactDetails() {
		
	} 
	
}
