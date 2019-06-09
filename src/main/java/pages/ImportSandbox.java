package pages;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

import org.openqa.selenium.*;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.relevantcodes.extentreports.ExtentTest;


import wrappers.ssdSandbox;

public class ImportSandbox extends ssdSandbox {
	
	// Constructor
	public ImportSandbox() {
		PageFactory.initElements(driver, this);
		//this.test = test;
		verifyTitleImportSandbox();
	}

		@FindBy(xpath="//div[text()='Import Sandbox']")
		private WebElement importSandbox;
		
	   public ImportSandbox verifyTitleImportSandbox() {
	    	try {
			
	    		importSandbox.getText();
			reportStep("The title: "+importSandbox+" is verified", "PASS");
			} catch (Exception e) {
				reportStep("The title: "+importSandbox+" is incorrect", "FAIL");
				System.out.println("couldnt enter keys into web elt "+e);
				e.printStackTrace();
			}
	      
	        return this;

	    }
	   
	 
	   
	   @FindBy(xpath="//button[text()='Import']")
	   private WebElement importButton;
	   
	   public ManageSandboxesPF clickImportButton() {
	    	try {
			Thread.sleep(6000);
	    		importButton.click();
			reportStep("Import button clicked", "PASS");
			} catch (Exception e) {
				reportStep("import button not clicked", "FAIL");
				System.out.println("couldnt enter keys into web elt "+e);
				e.printStackTrace();
			}
	      
	        return new ManageSandboxesPF();

	    }
	    
	   


}
