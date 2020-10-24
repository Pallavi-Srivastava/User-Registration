package com.blz.userregistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EntryUserRegistration {
	// Method for first name validation
	public void isValidFirstName() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your First name : ");
		String fname = sc.nextLine();
		String regex = "^[A-Z]{1}[a-z]{2,}";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(fname);
		boolean match = matcher.matches();
		System.out.println("First name : " + fname + " is " + match);
	}

	// Method for second name validation
	public void isValidSecondName() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your Last name : ");
		String lname = sc.nextLine();
		String regex = "^[A-Z]{1}[a-z]{2,}";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(lname);
		boolean match = matcher.matches();
		System.out.println("Last name : " + lname + " is " + match);
	}

	// Method for email validation
	public void isValidEmail() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your email : ");
		String email = sc.nextLine();
		String regex = "^[A-Za-z0-9+_.]+@[A-Za-z0-9+_.]+$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(email);
		boolean match = matcher.matches();
		System.out.println("Email : " + email + " is " + match);
	}
}
