package com.zoomev.redirectiontests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.zoomev.base.TestUtilities;

public class RedirectionTests extends TestUtilities{


	@Parameters({ "startUrl", "targetUrl", "redirectButton", "expectedPageName" })
	@Test
	public void redirection(String startUrl, String targetUrl,String redirectButton, String expectedPageName) {

		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);	
		
		log.info("Starting redirection test from " + startUrl + " to " + targetUrl);
		
		
		// open test page
		driver.get(startUrl);
		log.info("Page" + startUrl +" is open");

		// click button
		WebElement button = driver.findElement(By.xpath(redirectButton));
		button.click();
		log.info("Redirect button was found and clicked");

		// checking URL
		String actualUrl = driver.getCurrentUrl();
		Assert.assertEquals(actualUrl, targetUrl, "Wrong URL!");
		
		log.info("Page was checked and is correct" );

		// Checking pagetitle
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedPageName, "Wrong page title!");
		log.info("Page title was checked and is correct" );
	}
	
	


}