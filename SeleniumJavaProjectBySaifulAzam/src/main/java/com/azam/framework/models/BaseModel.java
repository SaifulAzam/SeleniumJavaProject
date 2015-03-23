package com.azam.framework.models;

import org.openqa.selenium.WebDriver;
/**
 * 
 * @author Saiful Azam
 * @email saifulazamny@gmail.com
 *
 */
public class BaseModel {

	protected WebDriver driver;

	public BaseModel(WebDriver driver) {
		this.driver = driver;
	}

}
