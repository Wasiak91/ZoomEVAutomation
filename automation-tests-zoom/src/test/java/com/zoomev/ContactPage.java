package com.zoomev;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.zoomev.base.TestUtilities;

public class ContactPage extends TestUtilities{
	private WebDriver driver;
	
	public void validation() {
		System.out.println("Starting checking mandatory fields at contact page");
		
		driver.get("https://dev.zoom-ev.com/contact");
		
		WebElement submitButton = driver.findElement(By.xpath("//button[@type='submit']"));
		submitButton.click();
		
		Assert.assertTrue(driver.findElement(By.xpath("//div[contains(@class, 'TextFieldstyled__Error-h5bljy-2') and text() = 'Required']")).isDisplayed(),
				"required label is not visible");

		
	}


	}

