package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;


import wrappers.ssdSandbox;

public class LoginPage extends ssdSandbox {
	
	// Assigning the driver and Test
	public LoginPage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
	}

		// Click on UserName
	public LoginPage enterUserName() {
		//driver.findElement(By.id("email")).sendKeys("sruthi");
		enterById(prop.getProperty("Login.UserName.id"), "xelsysadm");
		return this;
	}
	public LoginPage enterPassword() {
		//driver.findElement(By.id("password")).sendKeys(sPassword1);
		 enterById(prop.getProperty("Login.Password.id"), "Welcome123");
		return this;
	}
	
	public HomePage signin(){
		//clickById("Login.signin.id");
		clickByXpath(prop.getProperty("Login.signin.Xpath"));
		return new HomePage(driver,test);
	}

	public LoginPage clickLoginForFailure() {
		clickByXpath(prop.getProperty("Login.signin.Xpath"));
		return this;
		
	}
	public LoginPage verifyErrorMessage() {		
		verifyTextContainsByXpath(prop.getProperty("Login.Error.Xpath"), "Invalid sign in.");		
		return this;		
	}


}
