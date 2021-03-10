package com.zoomev.contactpage;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.zoomev.base.TestUtilities;

public class SendingForm extends TestUtilities {

	
	@Parameters({ "contactPage", "contactName", "telephone", "email", "message" })
	@Test
		public void correctForm(String contactPage, String contactName, String telephone, String email,
				String message) {
		
			log.info("Start checking the submission of a valid form");

			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

			driver.get(contactPage);
			log.info("Contact page is open");
			
			//finding field
			driver.findElement(By.id("name")).sendKeys(contactName);
			driver.findElement(By.id("telephone")).sendKeys(telephone);
			driver.findElement(By.id("email")).sendKeys(email);
			driver.findElement(By.id("message")).sendKeys(message);
			
			WebElement submitButton = driver.findElement(By.xpath("//button[@type='submit']"));
			submitButton.click();
			
			Assert.assertTrue(driver.findElement(By.xpath("//h1[contains(@class, 'Contactstyled__SuccessViewTitle-mbu1pe-9') and text() = 'Thank you for contacting us!']")).isDisplayed(), "Thank you page is not visible");
		}
	}
