package com.blz.validateuserregistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateUserRegistration {

	// Method for first name validation
	public boolean isValidFirstName(String fname) {
		String regex = "^[A-Z]{1}[a-z]{2,}";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(fname);
		return m.matches();
	}

	// Method for first name validation
	public boolean isValidLastName(String lname) {
		String regex = "^[A-Z]{1}[a-z]{2,}";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(lname);
		return m.matches();
	}

	// Method for email validation
	public boolean isValidEmail(String mail) {
		String regex = "^[A-Za-z0-9+_.]+@[A-Za-z0-9+_.]+$";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(mail);
		return m.matches();
	}

	// Method for MobileNo validation
	public boolean isValidMobileNo(String mobileNo) {
		String regex = "^[9][1][: :]{1}[6-9]{1}[0-9]{9}$";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(mobileNo);
		return m.matches();
	}

	// Method for Email Address validation
	public boolean isValidSampleEmail(String email) {
		String regex = "^[a-z]{3}[-.+]*[0-9]*[@]{1}[a-z]*[0-9]*[.]{1}[a-z]{1,3}[.]*[a-z]*[,]*";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(email);
		return m.matches();
	}

}
