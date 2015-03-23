package com.azam.framework.controllers;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.azam.framework.models.GmailLoginModel;
/**
 * 
 * @author Saiful Azam
 * @email saifulazamny@gmail.com
 *
 */
public class GmailLoginController extends BaseControllers {

	private GmailLoginModel gmailLoginModel;

	public GmailLoginController(WebDriver driver) {
		super(driver);
		gmailLoginModel = new GmailLoginModel(driver);
	}

	public void clickGmail() {
		gmailLoginModel.clickGmail().click();
	}

	public void clickSignIn() {
		gmailLoginModel.clickSignIn().click();
	}

	public void emailAddress(String enterEmailAddress) {
		gmailLoginModel.emailAddress().sendKeys(enterEmailAddress);
	}

	public void password(String enterPassword) {
		gmailLoginModel.password().sendKeys(enterPassword);
	}

	public void clickSignInButton() {
		gmailLoginModel.clickSignInButton().click();
	}

	public void verifyLoginError(String expectingError) {
		String error = gmailLoginModel.verifyErrorMgs().getText();
		Assert.assertEquals(error, expectingError);
	}

}
