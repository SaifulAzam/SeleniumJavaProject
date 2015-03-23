package com.azam.framework.controllers;

import org.openqa.selenium.WebDriver;
/**
 * 
 * @author Saiful Azam
 * @email saifulazamny@gmail.com
 *
 */
public class BaseControllers {
	
	protected WebDriver driver;

	public BaseControllers(WebDriver driver) {
		this.driver = driver;
	}

}
