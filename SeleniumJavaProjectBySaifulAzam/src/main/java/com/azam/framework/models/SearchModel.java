package com.azam.framework.models;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
/**
 * 
 * @author Saiful Azam
 * @email saifulazamny@gmail.com
 *
 */
public class SearchModel extends BaseModel {

	@FindBy(how = How.ID, using = "gs_htif0")
	WebElement typeText;
	
	@FindBy(how = How.NAME, using = "btnK")
	WebElement clickSearchButton;

	public SearchModel(WebDriver driver) {
		super(driver);
		PageFactory.initElements(this.driver, this);
	}

	public WebElement typeText() {
		return typeText;
	}

	public WebElement clickSearchButton() {
		return clickSearchButton;
	}

}
