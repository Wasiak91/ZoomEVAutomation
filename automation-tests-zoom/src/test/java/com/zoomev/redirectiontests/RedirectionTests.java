package com.zoomev.redirectiontests;

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

		System.out.println("Starting redirection test from " + startUrl + " to " + targetUrl);
		
		// open test page
		driver.get(startUrl);

		// click button
		WebElement zoomLogo = driver.findElement(By.xpath(redirectButton));
		zoomLogo.click();

		sleep(2000);

		// checking URL
		String actualUrl = driver.getCurrentUrl();

		Assert.assertEquals(actualUrl, targetUrl, "Wrong URL!");

		// Checking pagetitle
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedPageName, "Wrong page title!");

	}
	
	


}