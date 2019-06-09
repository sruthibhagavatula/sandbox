package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.relevantcodes.extentreports.ExtentTest;


import wrappers.ssdSandbox;

public class connectOIDPF extends ssdSandbox {
	
	// Constructor
	public connectOIDPF() {
		PageFactory.initElements(driver, this);
		//this.test = test;
	}

	 	@FindBy(xpath = "//label[text()='User Name']/parent::td/following-sibling::td/descendant::input")
		private WebElement userNameOID;
	 	
	 	public connectOIDPF enterUserNameOID(String UserNameValue) {
	    	try {
	    		userNameOID.click();
	    		userNameOID.clear();
	    		userNameOID.sendKeys(UserNameValue);
	    		
			reportStep("Entered user name ", "PASS");
			} catch (Exception e) {
				reportStep("user name not entered", "FAIL");
				System.out.println("couldnt enter keys into web elt "+e);
				e.printStackTrace();
			}
	      
	        return this;

	    }
	 	@FindBy(xpath="//label[text()='Password']/parent::td/following-sibling::td/descendant::input")
	 	private WebElement PasswordOID;
	 	
	 	public connectOIDPF enterPasswordOID(String PasswordValue) {
	    	try {
	    		PasswordOID.click();
	    		PasswordOID.clear();
	    		PasswordOID.sendKeys(PasswordValue);
	    		
			reportStep("Entered password ", "PASS");
			} catch (Exception e) {
				reportStep("Password not entered", "FAIL");
				System.out.println("couldnt enter keys into web elt "+e);
				e.printStackTrace();
			}
	      
	        return this;

	    }
	 	@FindBy(xpath="//button[text()='Connect']")
	 	private WebElement connectButton;
	 	
	 	public DataServiceManagerPF clickConnectButton() {
	    	try {
	    		connectButton.click();
	    		    		
			reportStep("connect button clicked ", "PASS");
			} catch (Exception e) {
				reportStep("connect button not clicked", "FAIL");
				System.out.println("couldnt enter keys into web elt "+e);
				e.printStackTrace();
			}
	      
	        return new DataServiceManagerPF();

	    }
	 	
	  
	   }
