package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wrappers.ssdSandbox;

public class SelectFieldType extends ssdSandbox{
	public SelectFieldType()
	{
		PageFactory.initElements(driver, this);
		verifyFieldTypeTitleVisible();
	}
	
	@FindBy(xpath ="//div[contains(text(),'Select Field Type')]")
    private WebElement selectFieldType;
	
	public SelectFieldType verifyFieldTypeTitleVisible() {
		
		try {
			selectFieldType.isDisplayed();
    		
    			reportStep("Select Field Type Page visible", "PASS");
		} catch (Exception e) {
			reportStep("Select Field Type Page not visible", "FAIL");
			System.out.println("Exception caused : "+e);
			
		}
      
        return this;

    }
	
	/*public SelectFieldType verifyFieldTypeTitle(String TitleFieldType) {
		String title =selectFieldType.getText();
		try {
			
    		Assert.assertTrue("The Title: "+title+" is visibale :",selectFieldType.isDisplayed());
    		
    		
    			reportStep("The Title: "+title+" is verified successfully ", "PASS");
		} catch (Exception e) {
			reportStep("The Title: "+title+" is not valid", "FAIL");
			System.out.println("couldnt enter keys into web elt "+e);
			e.printStackTrace();
		}
      
        return this;

    }*/
	
	
	@FindBy(xpath ="//label[text()='Text']/preceding-sibling::span/input[@name='dataTypeRowGroup']")
	private WebElement RadioButton;
	
	public SelectFieldType ClickRadioButton() {
		
		try {
			RadioButton.click(); 		
    			reportStep("Text radio button"+RadioButton+" is clicked ", "PASS");
		} catch (Exception e) {
			reportStep("Text radio button: "+RadioButton+" is not clicked", "FAIL");
			System.out.println("couldnt enter keys into web elt "+e);
			e.printStackTrace();
		}
      
        return this;
        
            }
	
	@FindBy(xpath ="//span[text()='K']/parent::button")
    private WebElement okButton;

public ManageUserPF ClickOkButton() {
		
		try {
			Thread.sleep(6000);
			okButton.click(); 		
    			reportStep("Text radio button"+okButton+" is clicked ", "PASS");
		} catch (Exception e) {
			reportStep("Text radio button: "+okButton+" is not clicked", "FAIL");
			System.out.println("couldnt enter keys into web elt "+e);
			e.printStackTrace();
		}
      
        return new ManageUserPF();
        
            }

		
}

	
	
	

