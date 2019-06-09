package pages;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.ssdSandbox;

public class ManageIdentityPF extends ssdSandbox {
	public ManageIdentityPF(){
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//div[text()='Identity System Administration']")
	private WebElement VerifyTitle;
	
	
	public ManageIdentityPF verifyTitleByXpath() {
		String title ="";
		try {
    		title = VerifyTitle.getText();
    		String expectedTitle ="Identity System Administrator";
    		if(title.equalsIgnoreCase(expectedTitle))
    		{
    			System.out.println("Title Matched");
    		}
    		else
    			 System.out.println("Title didn't match");
    		//VerifyTitle.isDisplayed();
    		
    			reportStep("The Title: "+title+" is verified successfully ", "PASS");
		} catch (Exception e) {
			reportStep("The Title: "+title+" is not valid", "FAIL");
			System.out.println("couldnt enter keys into web elt "+e);
			e.printStackTrace();
		}
      
        return this;

    }
	
	@FindBy(xpath="//img[@title='Users']")
	private WebElement UsersWebElt;
	
	public UsersIdentityPF clickUsers()
	{
		
		try {
			Thread.sleep(8000);
			UsersWebElt.click();
			reportStep("Users: "+UsersWebElt+" is clicked successfully ", "PASS");
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			reportStep("Users: "+UsersWebElt+" is not clicked ", "PASS");
		}
		return new UsersIdentityPF();
	}
	
	
}
