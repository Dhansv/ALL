package com.capgemini.contacts.junit;

import static org.junit.Assert.*;

import org.junit.Test;

import com.capgemini.contacts.service.ContactsValidator;

public class ContactsValidatorTestCase {
	ContactsValidator cv = new ContactsValidator();
	@Test
	public void testValidateCName() {
		assertEquals(false,cv.validateCName("asut"));
	}

	@Test
	public void testValidateMobileNo() {
		assertEquals(false,cv.validateMobileNo("123456"));
	}

	@Test
	public void testValidateEmailID() {
		assertEquals(false,cv.validateEmailID("qwer"));
	}

	@Test
	public void testValidateGroupName() {
		assertEquals(false,cv.validateGroupName("asdfgh"));
	}

}
