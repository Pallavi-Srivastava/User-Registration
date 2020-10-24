package com.blz.userregistration;

public class UserRegistration {
	public static void main(String args[]) {
		EntryUserRegistration ur = new EntryUserRegistration();
		// First name validation
		ur.isValidFirstName();
		// Second name validation
		ur.isValidSecondName();
		// Email validation
		ur.isValidEmail();
		// MobileNo validation
		ur.isValidMobileNo();
		// Password validation a/c to rule 1
		ur.isValidPasswordAccToRule1();
		// Password validation a/c to rule 2
		ur.isValidPasswordAccToRule2();
	}
}
