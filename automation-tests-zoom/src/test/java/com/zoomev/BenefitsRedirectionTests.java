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

public class BenefitsRedirectionTests {
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
	public void BenefitsRedirection(String startUrl, String targetUrl,String redirectButton, String expectedPageName) {

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

	/*
	 * @Test public void redirectionsBenefitsToRent() {
	 * 
	 * // Create FIREFOX driver // System.setProperty("webdriver.gecko.driver", //
	 * "src/main/resources/geckodriver.exe"); // WebDriver driver = new
	 * FirefoxDriver();
	 * 
	 * // Zmienne String rentUrl = "https://dev.zoom-ev.com/rent-ev"; String
	 * benefitsUrl = "https://dev.zoom-ev.com/ev-benefits";
	 * 
	 * // open test page driver.get(benefitsUrl);
	 * 
	 * // maximize browser window // driver.manage().window().maximize();
	 * 
	 * // click button WebElement rentButton = driver.findElement( By.
	 * xpath("//a[contains(@class, 'StyledLinkstyled__Link-sc-1q9nco8-2') and text() = 'Rent an EV']"
	 * )); rentButton.click();
	 * 
	 * sleep(2000);
	 * 
	 * // checking URL String actualUrl = driver.getCurrentUrl();
	 * Assert.assertEquals(actualUrl, rentUrl, "Wrong URL!");
	 * 
	 * // Checking pagetitle String actualTitle = driver.getTitle(); String
	 * expectedTitle = "Zoomev - rent-ev"; Assert.assertEquals(actualTitle,
	 * expectedTitle, "Wrong page title!");
	 * 
	 * }
	 * 
	 * @Test public void redirectionsBenefitsToLend() {
	 * 
	 * // Zmienne String lendUrl = "https://dev.zoom-ev.com/lend-an-ev"; String
	 * benefitsUrl = "https://dev.zoom-ev.com/ev-benefits";
	 * 
	 * // open test page driver.get(benefitsUrl);
	 * 
	 * // maximize browser window // driver.manage().window().maximize();
	 * 
	 * // click button WebElement lendButton = driver.findElement( By.
	 * xpath("//a[contains(@class, 'StyledLinkstyled__Link-sc-1q9nco8-2') and text() = 'Lend your EV']"
	 * )); lendButton.click();
	 * 
	 * sleep(2000);
	 * 
	 * // checking URL String actualUrl = driver.getCurrentUrl();
	 * Assert.assertEquals(actualUrl, lendUrl, "Wrong URL!");
	 * 
	 * // Checking pagetitle String actualTitle = driver.getTitle(); String
	 * expectedTitle = "Zoomev - Lend an EV"; Assert.assertEquals(actualTitle,
	 * expectedTitle, "Wrong page title!");
	 * 
	 * }
	 * 
	 * @Test public void redirectionsBenefitsToAboutUs() {
	 * 
	 * // Zmienne String aboutUsUrl = "https://dev.zoom-ev.com/about-us"; String
	 * benefitsUrl = "https://dev.zoom-ev.com/ev-benefits";
	 * 
	 * // open test page driver.get(benefitsUrl);
	 * 
	 * // maximize browser window // driver.manage().window().maximize();
	 * 
	 * // click button WebElement aboutUsButton = driver.findElement( By.
	 * xpath("//a[contains(@class, 'StyledLinkstyled__Link-sc-1q9nco8-2') and text() = 'About us']"
	 * )); aboutUsButton.click();
	 * 
	 * sleep(2000);
	 * 
	 * // checking URL String actualUrl = driver.getCurrentUrl();
	 * Assert.assertEquals(actualUrl, aboutUsUrl, "Wrong URL!");
	 * 
	 * // Checking pagetitle String actualTitle = driver.getTitle(); String
	 * expectedTitle = "Zoomev - About us"; Assert.assertEquals(actualTitle,
	 * expectedTitle, "Wrong page title!");
	 * 
	 * }
	 */

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