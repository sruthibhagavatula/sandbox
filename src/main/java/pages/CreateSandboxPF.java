package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wrappers.ssdSandbox;

public class CreateSandboxPF extends ssdSandbox{
	private String sbName;
	private String sbDesc;
	public CreateSandboxPF(String sbName,String sbDesc)
	{
		PageFactory.initElements(driver, this);
		this.sbName = sbName;
		this.sbDesc = sbDesc;
		verifyTitleById();
		enterSandboxName();
		enterSandboxDesc(this.sbDesc);
		clickSaveAndClose();
		clickConfimation();
		
		
		
	}
	
	@FindBy (id="pt1:_d_reg:region0:1:pc1:d1::_ttxt")
	private WebElement createSandboxPageTitle;
	
	public CreateSandboxPF verifyTitleById() {
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
	
	@FindBy (xpath="//label[contains(text(),'Sandbox Name')]/parent::td[@class='xu x4z']/following-sibling::td/input")
	private WebElement enterSandboxName;
	
	public CreateSandboxPF enterSandboxName()
	{
		try
		{
			enterSandboxName.click();
			enterSandboxName.clear();
			enterSandboxName.sendKeys(this.sbName);
		reportStep("The sandboxname : "+this.sbName+" is entered", "PASS");
		} catch (Exception e) {
			reportStep("The sandboxname: "+this.sbName+" is not entered", "FAIL");
			System.out.println("couldnt enter keys into web elt "+e);
			e.printStackTrace();
		}
      
        return this;

			
		}
	
@FindBy (xpath="//label[contains(text(),'Sandbox Description')]/parent::td[@class='xu x4z']/following-sibling::td/textarea")
private WebElement enterSandboxDesc;

public CreateSandboxPF enterSandboxDesc(String sandboxDesc)
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
@FindBy (xpath="//td/button[contains(text(),'Save and Close')]")
private WebElement clickSaveButton;

public CreateSandboxPF clickSaveAndClose()
{
	try
	{
		clickSaveButton.click();
		Thread.sleep(5000);
		
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

	
	
	

