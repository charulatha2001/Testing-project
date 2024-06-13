package org.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestClass extends BaseClass {
		
	@Test
	public void tc1() {
		System.out.println("Test case 1");
		launchUrl("https://accounts.google.com/");
		String title = pageTitle();
		String url = pageUrl();
		Assert.assertTrue("check ", title.contains("Email"));	
	}
	
	@Before
	public void startdate() {
		launchBrowser();
		windowMaximize();
	}
	
	@After
	public void enddate() {
		closeEntireBrowser();
	}
	
	@BeforeClass
	public static void launchTheBrowser() {
		launchBrowser();
		windowMaximize();
	}
	
	@AfterClass
	public static void closeTheBrowser() {
		closeEntireBrowser();
	}
	
	@Test
	public void tc2() {
		System.out.println("Test case 2");
		launchUrl("https://www.facebook.com/");
	}
	
	@Test
	public void tc3() {
		System.out.println("Test case 3");
		launchUrl("https://inmakes.com/");
	}
	
	@Test
	public void tc4() {
	   System.out.println("Test case 4");
	   launchUrl("https://www.youtube.com/");
	}

}
