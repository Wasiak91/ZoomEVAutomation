package com.zoomev;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class RedirectionTests {
	private WebDriver driver;

	@Parameters({ "browser" })
	@BeforeMethod(alwaysRun = true)
	private void setUp(@Optional("Chrome") String browser) {

		// Create driver
		switch (browser) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
			driver = new ChromeDriver();
			break;

		case "firefox":
			System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver.exe");
			driver = new FirefoxDriver();
			break;

		default:
			System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
			driver = new ChromeDriver();
			break;

		}

	}

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


	@AfterMethod(alwaysRun = true)
	private void tearDown() {
		// close driver
		driver.quit();
	}

	private void sleep(long m) {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}