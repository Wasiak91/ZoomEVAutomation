package com.zoomev;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RentRedirectionTests {

	@Test
	public void redirectionsRentToHomepage() {

		// Create driver
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Zmienne
		String homePageUrl = "https://dev.zoom-ev.com/";
		String rentUrl = "https://dev.zoom-ev.com/rent-ev";

		// open test page
		driver.get(rentUrl);

		// maximize browser window
		// driver.manage().window().maximize();

		// sleep for 3 sec
		// sleep();

		// click button
		WebElement zoomLogo = driver.findElement(By.xpath("//img[@alt='zoom logo colour long']"));
		zoomLogo.click();

		sleep(2000);

		// checking URL
		String actualUrl = driver.getCurrentUrl();
		Assert.assertEquals(actualUrl, homePageUrl, "Wrong URL!");

		// Checking pagetitle
		String actualTitle = driver.getTitle();
		String expectedTitle = "Zoomev - Home";
		Assert.assertEquals(actualTitle, expectedTitle, "Wrong page title!");

		// close driver
		driver.quit();
	}

	@Test
	public void redirectionsRentToBenefits() {

		// Create driver
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Zmienne
		String benefitsUrl = "https://dev.zoom-ev.com/ev-benefits";
		String rentUrl = "https://dev.zoom-ev.com/rent-ev";

		// open test page
		driver.get(rentUrl);

		// maximize browser window
		// driver.manage().window().maximize();

		// sleep for 3 sec
		// sleep();

		// click button
		WebElement benefitsButton = driver.findElement(
				By.xpath("//a[contains(@class, 'StyledLinkstyled__Link-sc-1q9nco8-2') and text() = 'EV Benefits']"));
		benefitsButton.click();

		sleep(2000);

		// checking URL
		String actualUrl = driver.getCurrentUrl();
		Assert.assertEquals(actualUrl, benefitsUrl, "Wrong URL!");

		// Checking pagetitle
		String actualTitle = driver.getTitle();
		String expectedTitle = "Zoomev - EV Benefits";
		Assert.assertEquals(actualTitle, expectedTitle, "Wrong page title!");

		// close driver
		driver.quit();
	}

	@Test
	public void redirectionsRentToLend() {

		// Create driver
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Zmienne
		String lendUrl = "https://dev.zoom-ev.com/lend-an-ev";
		String rentUrl = "https://dev.zoom-ev.com/rent-ev";

		// open test page
		driver.get(rentUrl);

		// maximize browser window
		// driver.manage().window().maximize();

		// sleep for 3 sec
		// sleep();

		// click button
		WebElement lendButton = driver.findElement(
				By.xpath("//a[contains(@class, 'StyledLinkstyled__Link-sc-1q9nco8-2') and text() = 'Lend your EV']"));
		lendButton.click();

		sleep(2000);

		// checking URL
		String actualUrl = driver.getCurrentUrl();
		Assert.assertEquals(actualUrl, lendUrl, "Wrong URL!");

		// Checking pagetitle
		String actualTitle = driver.getTitle();
		String expectedTitle = "Zoomev - Lend an EV";
		Assert.assertEquals(actualTitle, expectedTitle, "Wrong page title!");

		// close driver
		driver.quit();
	}

	@Test
	public void redirectionsRentToAboutUs() {

		// Create driver
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Zmienne
		String aboutUsUrl = "https://dev.zoom-ev.com/about-us";
		String rentUrl = "https://dev.zoom-ev.com/rent-ev";

		// open test page
		driver.get(rentUrl);

		// maximize browser window
		// driver.manage().window().maximize();

		// sleep for 3 sec
		// sleep();

		// click button
		WebElement aboutUsButton = driver.findElement(
				By.xpath("//a[contains(@class, 'StyledLinkstyled__Link-sc-1q9nco8-2') and text() = 'About us']"));
		aboutUsButton.click();

		sleep(2000);

		// checking URL
		String actualUrl = driver.getCurrentUrl();
		Assert.assertEquals(actualUrl, aboutUsUrl, "Wrong URL!");

		// Checking pagetitle
		String actualTitle = driver.getTitle();
		String expectedTitle = "Zoomev - About us";
		Assert.assertEquals(actualTitle, expectedTitle, "Wrong page title!");

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
