package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.relevantcodes.extentreports.ExtentTest;


import wrappers.ssdSandbox;

public class LoginPF extends ssdSandbox {
	
	// Constructor
	public LoginPF() {
		PageFactory.initElements(driver, this);
		//this.test = test;
	}

	 // @FindBy(xpath = "//input[@id='pt1:_pt_it1::content']")
		@FindBy(id = "pt1:_pt_it1::content")
		private WebElement loginName;

	    @FindBy(id = "pt1:_pt_it2::content")
	    private WebElement loginPswd;

	    @FindBy(id = "pt1:_pt_cb1")
	    private WebElement signInBtn;
	    
	    @FindBy(xpath = "//*[contains(text(),'Invalid sign in')]")
	    private WebElement loginErrorMsg;

	    public LoginPF enterLoginNameById(String logiNnameValue) {
	    	try {
			
			loginName.sendKeys(logiNnameValue);
			System.out.println("username"+logiNnameValue);
			reportStep("The data: "+logiNnameValue+" entered successfully in field User ID ", "PASS");
			} catch (Exception e) {
				reportStep("The data: "+logiNnameValue+" could not entered in field User ID", "FAIL");
				System.out.println("couldnt enter keys into username "+e);
				e.printStackTrace();
			}
	      
	        return this;

	    }
	    
	    public LoginPF enterPswdById(String pswdValue) {
		   try{    
	    	loginPswd.sendKeys(pswdValue);
	    	reportStep("The data: "+pswdValue+" entered successfully in field Login Password", "PASS");
		   }catch (Exception e) {
				reportStep("The data: "+pswdValue+" could not entered in field login Password", "FAIL");
				System.out.println("couldnt enter keys into web elt "+e);
				e.printStackTrace();
			}
	    	
	    	return this;

	    }
	    
	    public HomePF clickSignIn() {
	    	 try{  
	    		 Thread.sleep(5000);
	    		 System.out.println("click sign in");
	    	signInBtn.click();
	    	System.out.println("signed in");
	    	reportStep("The webelement : signInBtn  clicked", "PASS");
	    }catch (Exception e) {
			reportStep("The webelement : signInBtn could not clicked", "FAIL");
			System.out.println("couldnt enter keys into web elt "+e);
			e.printStackTrace();
		}
	        return new HomePF();

	    }

	  
	
	
	public LoginPF verifyErrorMessage(String errMsg) {		
		
		if(loginErrorMsg.getText().contains(errMsg))
			{
				
				reportStep("The error message : "+loginErrorMsg.getText()+" found", "PASS");
			}else{
				
				reportStep("The error message : "+loginErrorMsg.getText()+" could not found", "FAIL");
			}
		
		 
		return this;		
	}


}
