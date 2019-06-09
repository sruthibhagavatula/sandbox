package pages;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

import org.apache.poi.util.SystemOutLogger;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.ssdSandbox;

public class IdentitySelfServicePF extends ssdSandbox {
	public IdentitySelfServicePF(){
		PageFactory.initElements(driver, this);
					
		}
	
	@FindBy(xpath="//span[text()='Manage']")
	private WebElement manageWebElt;
	
	public ManageIdentityPF clickManageIcon()
	{
		
		try {
			manageWebElt.click();
			reportStep("Manage icon  : "+manageWebElt+" is clicked  ", "PASS");
		} catch (Exception e) {
			reportStep("Manage icon: "+manageWebElt+" is not clicked", "FAIL");
			e.printStackTrace();
		}
		return new ManageIdentityPF();
	}
	
	
}
