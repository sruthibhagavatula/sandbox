package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wrappers.ssdSandbox;

public class PublishSandboxPF extends ssdSandbox{
	public PublishSandboxPF()
	{
		PageFactory.initElements(driver, this);
		//verifyTitlePublishSandbox("Publish Sandbox");
	}
	
	/*@FindBy(id = "//div[text()='Publish Sandbox']")
    private WebElement PublishSandboxPopup;
	
	public PublishSandboxPF verifyTitlePublishSandbox(String PopUpTitle) {
		String title ="";
		try {
    		title =PublishSandboxPopup.getText();
    		//VerifyTitle.isDisplayed();
    		
    			reportStep("The Title: "+PublishSandboxPopup+" is verified successfully ", "PASS");
		} catch (Exception e) {
			reportStep("The Title: "+PublishSandboxPopup+" is not valid", "FAIL");
			System.out.println("couldnt enter keys into web elt "+e);
			e.printStackTrace();
		}
      
        return this;*/

    
	
	
	@FindBy (xpath="//span[text()='Y']/parent::button")
	private WebElement clickOKButtonPublishSandbox;
	
	
		public ManageSandboxesPF ClickOkPublishSandbox() {
		
		try {
			Thread.sleep(5000);
			clickOKButtonPublishSandbox.click();
    		//VerifyTitle.isDisplayed();
    		
    			reportStep("Ok button"+clickOKButtonPublishSandbox+" is clicked ", "PASS");
		} catch (Exception e) {
			reportStep("OK button: "+clickOKButtonPublishSandbox+" is not clicked", "FAIL");
			System.out.println("couldnt enter keys into web elt "+e);
			e.printStackTrace();
		}
      
        return new ManageSandboxesPF();
        
            }
	

	@FindBy(id="pt1:_shgnp1:cni5")
	private WebElement clickSandBoxes;
	
	public ManageSandboxesPF clickSandbox()
	{
		clickSandBoxes.click();
		return new ManageSandboxesPF();
	}
	
}

	
	
	

