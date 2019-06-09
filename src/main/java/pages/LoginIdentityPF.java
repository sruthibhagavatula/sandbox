package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.relevantcodes.extentreports.ExtentTest;


import wrappers.ssdSandbox;

public class LoginIdentityPF extends ssdSandbox {
	
	// Constructor
	public LoginIdentityPF() {
		PageFactory.initElements(driver, this);
		//this.test = test;
	}

	 	@FindBy(xpath = "//label[text()='User ID']/following::td/input")
		private WebElement loginNameIdentity;
	 	
	 	public LoginIdentityPF enterLoginNameIdentity(String logiNnameValue) {
	    	try {
	    		loginNameIdentity.click();
	    		loginNameIdentity.clear();
	    		loginNameIdentity.sendKeys(logiNnameValue);
			reportStep("The data: "+logiNnameValue+" entered successfully in field User ID ", "PASS");
			} catch (Exception e) {
				reportStep("The data: "+logiNnameValue+" could not entered in field User ID", "FAIL");
				System.out.println("couldnt enter keys into web elt "+e);
				e.printStackTrace();
			}
	      
	        return this;

	    }

	    @FindBy(xpath = "//label[text()='Password']/following::td/input")
	    private WebElement loginPswdIdentity;

	    public LoginIdentityPF enterPswdIdentity(String pswdValue) {
			   try{    
				   loginPswdIdentity.click();
				   loginPswdIdentity.clear();
				   loginPswdIdentity.sendKeys(pswdValue);
		    	reportStep("The data: "+pswdValue+" entered successfully in field Login Password", "PASS");
			   }catch (Exception e) {
				reportStep("The data: "+pswdValue+" could not entered in field login Password", "FAIL");
					System.out.println("couldnt enter keys into web elt "+e);
					e.printStackTrace();
				}
		    	
		    	return this;

		    }
	    @FindBy(xpath= "//button[text()='Sign In']")
	    private WebElement signInBtnIdentity;   
	    
	    public IdentitySelfServicePF clickSignInIdentity() {
	    	 try{  
	    		 Thread.sleep(5000);
	    		 System.out.println("click sign in for Identity");
	    		 signInBtnIdentity.click();
	    	System.out.println("signed in");
	    	reportStep("The webelement : signInBtn  clicked", "PASS");
	    }catch (Exception e) {
			reportStep("The webelement : signInBtn could not clicked", "FAIL");
			System.out.println("couldnt enter keys into web elt "+e);
			e.printStackTrace();
		}
	        return new IdentitySelfServicePF();

	    }

	  
	   }
