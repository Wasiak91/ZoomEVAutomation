package com.zoomev.contactpage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.zoomev.base.TestUtilities;
@Test
public class ValidationOfFields extends TestUtilities {

	public void validation() {
		log.info("Starting checking mandatory fields at contact page");

		driver.get("https://dev.zoom-ev.com/contact");
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);				

		
		//Press Send button in order to call "required" label 
		WebElement submitButton = driver.findElement(By.xpath("//button[@type='submit']"));
		submitButton.click();
		
		//Checking required label for Name field
		Assert.assertTrue(driver.findElement(By.xpath(
				"//input[contains(@id, 'name')]/following-sibling::div[contains(@class,'TextFieldstyled__Error-h5bljy-2')]"))
				.isDisplayed(), "required label for name field is not visible");
		
		//Checking visiblity of required label for email field
		Assert.assertTrue(driver.findElement(By.xpath(
				"//input[contains(@id, 'email')]/following-sibling::div[contains(@class,'TextFieldstyled__Error-h5bljy-2')]"))
				.isDisplayed(), "required label for email field is not visible");
		
		//Checking visiblity of required label for message field
		Assert.assertTrue(driver.findElement(By.xpath(
				"//textarea[contains(@id, 'message')]/following-sibling::div[contains(@class,'TextFieldstyled__Error-h5bljy-2')]"))
				.isDisplayed(), "required label for message field is not visible");
		
		//Checking if form is not send
		Assert.assertTrue(submitButton.isDisplayed(), "Form was sent but should't be!");
	}

}
