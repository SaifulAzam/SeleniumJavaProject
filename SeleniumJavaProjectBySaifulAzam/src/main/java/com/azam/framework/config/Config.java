package com.azam.framework.config;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
/**
 * 
 * @author Saiful Azam
 * @email saifulazamny@gmail.com
 *
 */
public class Config {

	protected WebDriver driver;

	 private App google;

	@Before
	public void setUp() {
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com");
	}

	@After
	public void pageClose() {
		driver.quit();
	}

	public App google() {
		if (google == null) {
			google = new App(driver);
		}
		return google;
	}
	
	public void delayFor(int millis){
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
