package com.test.execute;

import org.junit.Test;

import com.azam.framework.config.Config;
/**
 * 
 * @author Saiful Azam
 * @email saifulazamny@gmail.com
 *
 */
public class Login extends Config {

	@Test
	public void negativeLoginTest() {
		google().gmailLogin().clickGmail();
		google().gmailLogin().clickSignIn();
		google().gmailLogin().emailAddress("test@gmail.com");
		google().gmailLogin().password("782716nskl");
		google().gmailLogin().clickSignInButton();
		google().gmailLogin().verifyLoginError(
				"The email or password you entered is incorrect. ?");
	}

	@Test
	public void positiveLoginTest() {
		google().gmailLogin().clickGmail();
		google().gmailLogin().clickSignIn();
		google().gmailLogin().emailAddress("Enter your email");
		google().gmailLogin().password("Enter your Password");
		google().gmailLogin().clickSignInButton();
	}

}
