package com.azam.framework.config;

import org.openqa.selenium.WebDriver;

import com.azam.framework.controllers.GmailLoginController;
import com.azam.framework.controllers.SearchController;
/**
 * 
 * @author Saiful Azam
 * @email saifulazamny@gmail.com
 *
 */
public class App {

	private WebDriver driver;
	private GmailLoginController gmailLogin;
	private SearchController search;

	public App(WebDriver driver) {
		this.driver = driver;
	}

	public GmailLoginController gmailLogin() {
		if (gmailLogin == null) {
			gmailLogin = new GmailLoginController(driver);
		}
		return gmailLogin;
	}

	public SearchController search() {
		if (search == null) {
			search = new SearchController(driver);
		}
		return search;
	}

}
