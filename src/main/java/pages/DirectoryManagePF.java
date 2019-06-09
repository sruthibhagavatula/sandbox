package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.relevantcodes.extentreports.ExtentTest;


import wrappers.ssdSandbox;

public class DirectoryManagePF extends ssdSandbox {
	
	// Constructor
	public DirectoryManagePF() {
		PageFactory.initElements(driver, this);
		//this.test = test;
	}

	 	@FindBy(xpath = "//span[text()='Connect to a directory']")
		private WebElement connectToADirectory;
	 	
	 	public DirectoryManagePF clickConnecttoaDirectory() {
	    	try {
	    		connectToADirectory.click();
	    		
			reportStep("Connect to directory is clicked ", "PASS");
			} catch (Exception e) {
				reportStep("Connect to directory is not clicked", "FAIL");
				System.out.println("couldnt enter keys into web elt "+e);
				e.printStackTrace();
			}
	      
	        return this;

	    }
	 	@FindBy(xpath="//td[contains(text(),'OID')]")
	 	private WebElement OIDUserName;
	 	
	 	public connectOIDPF clickOIDUser() {
	    	try {
	    		OIDUserName.click();
	    		
			reportStep("OID user selected successfully ", "PASS");
			} catch (Exception e) {
				reportStep("OID user not selected", "FAIL");
				System.out.println("couldnt enter keys into web elt "+e);
				e.printStackTrace();
			}
	      
	        return new connectOIDPF();

	    }
	 	
	  
	   }
