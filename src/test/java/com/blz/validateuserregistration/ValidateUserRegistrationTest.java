package com.blz.validateuserregistration;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class ValidateUserRegistrationTest {

	static ValidateUserRegistration obj;

	@BeforeClass
	public static void createFirstNameObj() {
		obj = new ValidateUserRegistration();
		System.out.println("In Before:");
	}

	@AfterClass
	public static void nullObj() {
		obj = null;
		System.out.println("In After:");
	}

	// Checking the validity of first name
	@Test
	public void testFirstNameWhenFirstCharIsCapswith3MinChar_thenAssertionHappy() {
		boolean result = obj.isValidFirstName("Ram");
		assertEquals(true, result);
		System.out.println("Successfully Passed Test");
	}

	@Test
	public void testFirstNameWhenFirstCharIsCapswithMoreThan3Char_thenAssertionHappy() {
		boolean result = obj.isValidFirstName("Ramchandra");
		assertEquals(true, result);
		System.out.println("Successfully Passed Test");
	}

	@Test
	public void testFirstNameWhenFirstCharIsNotCapswith3MinChar_thenAssertionSad() {
		boolean result = obj.isValidFirstName("rama");
		assertEquals(true, result);
		System.out.println("Fail To Pass Test");
	}

	@Test
	public void testFirstNameWhenFirstCharIsCapswith2MinChar_thenAssertionSad() {
		boolean result = obj.isValidFirstName("Ra");
		assertEquals(true, result);
		System.out.println("Fail To Pass Test");
	}

}
