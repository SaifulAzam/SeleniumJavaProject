package com.azam.framework.controllers;

import org.openqa.selenium.WebDriver;

import com.azam.framework.models.SearchModel;
/**
 * 
 * @author Saiful Azam
 * @email saifulazamny@gmail.com
 *
 */
public class SearchController extends BaseControllers {

	private SearchModel searchModel;

	public SearchController(WebDriver driver) {
		super(driver);
		searchModel = new SearchModel(driver);
	}

	public void typeText(String typeText) {
		searchModel.typeText().sendKeys(typeText);
	}

	public void clickSearchButton() {
		searchModel.clickSearchButton().click();
	}

}
