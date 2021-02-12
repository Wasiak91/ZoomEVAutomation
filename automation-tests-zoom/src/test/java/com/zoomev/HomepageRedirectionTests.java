package com.zoomev;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.Assert;

public class HomepageRedirectionTests {

	@Test
	public void redirectionsHomepageToBenefits() {

		// Create driver
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Zmienne
		String homePage = "https://dev.zoom-ev.com/";
		String benefits = "https://dev.zoom-ev.com/ev-benefits";

		// open test page
		driver.get(homePage);

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
		Assert.assertEquals(actualUrl, benefits, "Wrong URL!");

		// Checking pagetitle
		String actualTitle = driver.getTitle();
		String expectedTitle = "Zoomev - EV Benefits";
		Assert.assertEquals(actualTitle, expectedTitle, "Wrong page title!");

		// close driver
		driver.quit();
	}

	@Test
	public void redirectionsHomepageToLend() {

		// Create driver
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Zmienne
		String homePage = "https://dev.zoom-ev.com/";
		String lend = "https://dev.zoom-ev.com/lend-an-ev";

		// open test page
		driver.get(homePage);

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
		Assert.assertEquals(actualUrl, lend, "Wrong URL!");

		// Checking pagetitle
		String actualTitle = driver.getTitle();
		String expectedTitle = "Zoomev - Lend an EV";
		Assert.assertEquals(actualTitle, expectedTitle, "Wrong page title!");

		// close driver
		driver.quit();
	}

	@Test
	public void redirectionsHomepageToAboutUs() {

		// Create driver
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Zmienne
		String homePage = "https://dev.zoom-ev.com/";
		String aboutUs = "https://dev.zoom-ev.com/about-us";

		// open test page
		driver.get(homePage);

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
		Assert.assertEquals(actualUrl, aboutUs, "Wrong URL!");

		// Checking pagetitle
		String actualTitle = driver.getTitle();
		String expectedTitle = "Zoomev - About us";
		Assert.assertEquals(actualTitle, expectedTitle, "Wrong page title!");

		// close driver
		driver.quit();
	}

	@Test
	public void redirectionsHomepageToRent() {

		// Create driver
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Zmienne
		String homePage = "https://dev.zoom-ev.com/";
		String rent = "https://dev.zoom-ev.com/rent-ev";

		// open test page
		driver.get(homePage);

		// maximize browser window
		// driver.manage().window().maximize();

		// sleep for 3 sec
		// sleep();

		// click button
		WebElement rentButton = driver.findElement(
				By.xpath("//a[contains(@class, 'StyledLinkstyled__Link-sc-1q9nco8-2') and text() = 'Rent an EV']"));
		rentButton.click();
		
		sleep(2000);
		
		// checking URL
		String actualUrl = driver.getCurrentUrl();
		Assert.assertEquals(actualUrl, rent, "Wrong URL!");

		// Checking pagetitle
		String actualTitle = driver.getTitle();
		String expectedTitle = "Zoomev - rent-ev";
		Assert.assertEquals(actualTitle, expectedTitle, "Wrong page title!");

		// close driver
		driver.quit();
	}

	@Test
	public void redirectionsHomepageFooterToLend() {

		// Create driver
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Zmienne
		String homePage = "https://dev.zoom-ev.com/";
		String lendUrl = "https://dev.zoom-ev.com/lend-an-ev";

		// open test page
		driver.get(homePage);

		// maximize browser window
		// driver.manage().window().maximize();

		// sleep for 3 sec
		// sleep();

		// click button
		WebElement lendButton = driver.findElement(
				By.xpath("//*[@id=\"__next\"]/footer/div/div[2]/div[1]/span[2]/a"));
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
	public void redirectionsHomepageFooterToRent() {

		// Create driver
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// Zmienne
		String homePage = "https://dev.zoom-ev.com/";
		String lendUrl = "https://dev.zoom-ev.com/lend-an-ev";

		// open test page
		driver.get(homePage);

		// maximize browser window
		// driver.manage().window().maximize();

		// sleep for 3 sec
		// sleep();

		// click button
		WebElement lendButton = driver.findElement(
				By.xpath("//*[@id=\"__next\"]/footer/div/div[2]/div[1]/span[2]/a"));
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
	private void sleep(long m) {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
