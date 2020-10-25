package com.blz.validateuserregistration;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ParameterizedTestForEmailAddress {

	private String emailAddress;
	private boolean result;
	private ValidateUserRegistration obj;

	@Before
	public void initialize() {
		obj = new ValidateUserRegistration();
	}

	public ParameterizedTestForEmailAddress(String emailAddress, boolean result) {
		this.emailAddress = emailAddress;
		this.result = result;
	}

	@Test
	public void testSampleEmail() {
		assertEquals(result, obj.isValidSampleEmail(emailAddress));
	}

	@Parameters
	public static Collection emailAddress() {
		return Arrays.asList(new Object[][] { { "abc@yahoo.com", true }, { "abc-100@yahoo.com", true },
				{ "abc1.com", false }, { "abc@1.com", true }, { "abc858@gmail", false } });
	}
}
