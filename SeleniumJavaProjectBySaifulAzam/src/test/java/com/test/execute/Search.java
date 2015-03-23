package com.test.execute;

import org.junit.Test;

import com.azam.framework.config.Config;

/**
 * 
 * @author Saiful Azam
 * @email saifulazamny@gmail.com
 *
 */
public class Search extends Config {

	@Test
	public void testCase1() {
		google().search().typeText("Music");
		google().search().clickSearchButton();
	}

	@Test
	public void testCase2() {
		google().search().typeText("Best Music 2014");
		google().search().clickSearchButton();
	}

	@Test
	public void testCase3() {
		google().search().typeText("Selenium");
		google().search().clickSearchButton();
	}

	@Test
	public void testCase4() {
		google().search().typeText("Java");
		google().search().clickSearchButton();
	}

}
