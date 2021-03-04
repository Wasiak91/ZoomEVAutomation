package com.zoomev.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class BaseTest {

	protected WebDriver driver;

	@Parameters({ "browser" })
	@BeforeMethod(alwaysRun = true)
	public void setUp(@Optional("chrome") String browser) {
		BrowserDriverFactory factory = new BrowserDriverFactory(browser);
		driver = factory.createDriver();

	}

	@AfterMethod(alwaysRun = true)
	public void tearDown() {
		// close driver
		driver.quit();
	}

}
