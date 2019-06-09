package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wrappers.ssdSandbox;

public class CreateFormDesignerPF extends ssdSandbox{
	public CreateFormDesignerPF()
	{
		PageFactory.initElements(driver, this);
		verifyTitleById();
	}
	
	@FindBy (id="pt1:_d_reg:region0:1:pc1:d1::_ttxt")
	private WebElement createSandboxPageTitle;
	
	public CreateFormDesignerPF verifyTitleById() {
		String title ="";
		try {
    		title =createSandboxPageTitle.getText();
    		//VerifyTitle.isDisplayed();
    		
    			reportStep("The Title: "+title+" is verified successfully ", "PASS");
		} catch (Exception e) {
			reportStep("The Title: "+title+" is not valid", "FAIL");
			System.out.println("couldnt enter keys into web elt "+e);
			e.printStackTrace();
		}
      
        return this;

    }
	
	@FindBy (id="pt1:_d_reg:region0:1:pc1:s11:it2::content")
	private WebElement enterSandboxName;
	
	public CreateFormDesignerPF enterSandboxName(String sandboxName)
	{
		try
		{
			enterSandboxName.click();
			enterSandboxName.clear();
			enterSandboxName.sendKeys(sandboxName);
		reportStep("The sandboxname : "+sandboxName+" is entered", "PASS");
		} catch (Exception e) {
			reportStep("The sandboxname: "+sandboxName+" is not entered", "FAIL");
			System.out.println("couldnt enter keys into web elt "+e);
			e.printStackTrace();
		}
      
        return this;

			
		}
	
@FindBy (id="pt1:_d_reg:region0:1:pc1:s11:it41::content")
private WebElement enterSandboxDesc;

public CreateFormDesignerPF enterSandboxDesc(String sandboxDesc)
{
	try
	{
		enterSandboxDesc.click();
		enterSandboxDesc.clear();
		enterSandboxDesc.sendKeys(sandboxDesc);
	reportStep("The sandboxDesc : "+sandboxDesc+" is entered", "PASS");
	} catch (Exception e) {
		reportStep("The sandboxdesc: "+sandboxDesc+" is not entered", "FAIL");
		System.out.println("couldnt enter keys into web elt "+e);
		e.printStackTrace();
	}
  
    return this;

		
	}
@FindBy (id="pt1:_d_reg:region0:1:pc1:cb2")
private WebElement clickSaveButton;

public CreateFormDesignerPF clickSaveAndClose()
{
	try
	{
		clickSaveButton.click();
		Thread.sleep(8000);
		
	reportStep("The sandbox : "+clickSaveButton+" is created", "PASS");
	} catch (Exception e) {
		reportStep("The sandbox: "+clickSaveButton+" is not created", "FAIL");
		System.out.println("couldnt enter keys into web elt "+e);
		e.printStackTrace();
	}
  
    return this;

		
	}

@FindBy (xpath="//button[text()='OK']")
private WebElement okButton;

public ManageSandboxesPF clickConfimation() {
	
	try {
		okButton.click();
		Thread.sleep(5000);
				
			reportStep("The button: "+okButton+" is clicked  ", "PASS");
	} catch (Exception e) {
		reportStep("The button: "+okButton+" is clicked", "FAIL");
		System.out.println("couldnt enter keys into web elt "+e);
		e.printStackTrace();
	}
  
    return new ManageSandboxesPF();

}
}

	
	
	

