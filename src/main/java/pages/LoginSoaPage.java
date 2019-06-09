package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.relevantcodes.extentreports.ExtentTest;


import wrappers.ssdSandbox;

public class LoginSoaPage extends ssdSandbox {
	
	// Constructor
	public LoginSoaPage() {
		PageFactory.initElements(driver, this);
		//this.test = test;
	}

	 	@FindBy(id = "t_username::content")
		private WebElement loginNameSoa;
	 	
	 	public LoginSoaPage enterLoginNameSoa(String logiNnameValue) {
	    	try {
	    		loginNameSoa.click();
	    		loginNameSoa.clear();
	    		loginNameSoa.sendKeys(logiNnameValue);
			reportStep("The data: "+logiNnameValue+" entered successfully in field User ID ", "PASS");
			} catch (Exception e) {
				reportStep("The data: "+logiNnameValue+" could not entered in field User ID", "FAIL");
				System.out.println("couldnt enter keys into web elt "+e);
				e.printStackTrace();
			}
	      
	        return this;

	    }

	    @FindBy(id = "t_password::content")
	    private WebElement loginPswdSoa;

	    public LoginSoaPage enterPswdSoa(String pswdValue) {
			   try{    
				   loginPswdSoa.click();
				   loginPswdSoa.clear();
				   loginPswdSoa.sendKeys(pswdValue);
		    	reportStep("The data: "+pswdValue+" entered successfully in field Login Password", "PASS");
			   }catch (Exception e) {
				reportStep("The data: "+pswdValue+" could not entered in field login Password", "FAIL");
					System.out.println("couldnt enter keys into web elt "+e);
					e.printStackTrace();
				}
		    	
		    	return this;

		    }
	    @FindBy(xpath= "//button[text()='Login']")
	    private WebElement signInBtnSoa;   
	    
	    public FarmOIMPage clickSignInSoa() {
	    	 try{  
	    		 Thread.sleep(5000);
	    		 System.out.println("click sign in");
	    		 signInBtnSoa.click();
	    	System.out.println("signed in");
	    	reportStep("The webelement : signInBtn  clicked", "PASS");
	    }catch (Exception e) {
			reportStep("The webelement : signInBtn could not clicked", "FAIL");
			System.out.println("couldnt enter keys into web elt "+e);
			e.printStackTrace();
		}
	        return new FarmOIMPage();

	    }

	  
	   /* @FindBy(xpath = "//*[contains(text(),'Invalid sign in')]")
	    private WebElement loginErrorMsg;

	
	public LoginSoaPage verifyErrorMessage(String errMsg) {		
		
		if(loginErrorMsg.getText().contains(errMsg))
			{
				
				reportStep("The error message : "+loginErrorMsg.getText()+" found", "PASS");
			}else{
				
				reportStep("The error message : "+loginErrorMsg.getText()+" could not found", "FAIL");
			}
		
		 
		return this;		
	}
*/

}
