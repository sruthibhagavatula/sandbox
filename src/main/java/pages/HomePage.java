package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.ssdSandbox;

public class HomePage extends ssdSandbox {
	public HomePage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver; 
		this.test = test;
		System.out.println("Home Page");
		if(!verifyTitle("Identity System Administration"))
			reportStep("This is not Home Page", "FAIL");

	}
	public HomePage VerifyTitle()
	{
		//enterBy
		return this;
		
	}
}
