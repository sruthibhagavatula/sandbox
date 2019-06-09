package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import wrappers.ssdSandbox;

public class CreateUserIdentityPF extends ssdSandbox{
	public CreateUserIdentityPF()
	{
		PageFactory.initElements(driver, this);
		//verifyFormDesignerTitleByXpath();
	}
	@FindBy (xpath="//h1[text()='Create User']")
	private WebElement CreateUserTitle;
	
	public CreateUserIdentityPF VerifyCreateUserTitle() {
		String title ="";
		try {
    		title =CreateUserTitle.getText();
    		//VerifyTitle.isDisplayed();
    		
    			reportStep("The Title: "+title+" is verified successfully ", "PASS");
		} catch (Exception e) {
			reportStep("The Title: "+title+" is not valid", "FAIL");
			System.out.println("couldnt enter keys into web elt "+e);
			e.printStackTrace();
		}
      
        return this ;

    }
	@FindBy (xpath="//label[text()='Last Name']/preceding-sibling::input")
	private WebElement lastNameField;
	
	public CreateUserIdentityPF enterLastNameField(String lastNameValue){
		
		
		try {
			lastNameField.click();
			lastNameField.clear();
			lastNameField.sendKeys(lastNameValue);
    			reportStep("The lastname: "+lastNameField+" is entered ", "PASS");
		} catch (Exception e) {
			reportStep("The lastname: "+lastNameField+" is not entered", "FAIL");
			System.out.println("couldnt enter keys into web elt "+e);
			e.printStackTrace();
		}
      
        return this;

    }
	@FindBy (xpath="//label[text()='First Name']/parent::td/following-sibling::td/input")
	private WebElement firstNameField;
	
	public CreateUserIdentityPF enterFirstNameField(String firstNameValue){
		
		
		try {
			firstNameField.click();
			firstNameField.clear();
			firstNameField.sendKeys(firstNameValue);
    			reportStep("The firstname: "+firstNameValue+" is entered ", "PASS");
		} catch (Exception e) {
			reportStep("The firstname: "+firstNameValue+" is not entered", "FAIL");
			System.out.println("couldnt enter keys into web elt "+e);
			e.printStackTrace();
		}
      
        return this;

    }
	
	
	@FindBy(xpath="//label[text()='E-mail']/parent::td/following-sibling::td/input")
	private WebElement emailidfield;
	
public CreateUserIdentityPF enterEmailField(String EmailValue){
		
		
		try {
			emailidfield.click();
			emailidfield.clear();
			emailidfield.sendKeys(EmailValue);
    			reportStep("The Email: "+EmailValue+" is entered ", "PASS");
		} catch (Exception e) {
			reportStep("The Email: "+EmailValue+" is not entered", "FAIL");
			System.out.println("couldnt enter keys into web elt "+e);
			e.printStackTrace();
		}
      
        return this;

    }
	
	@FindBy(xpath="//label[text()='Organization']/parent::td/following-sibling::td/descendant::input")
	private WebElement oraganizationField;
	
public CreateUserIdentityPF enterOrganizationField(String OrganizationValue){
		
		
		try {
			oraganizationField.click();
			oraganizationField.clear();
			oraganizationField.sendKeys(OrganizationValue);
    			reportStep("The Organization value: "+OrganizationValue+" is entered ", "PASS");
		} catch (Exception e) {
			reportStep("The Organization value: "+OrganizationValue+" is not entered", "FAIL");
			System.out.println("couldnt enter keys into web elt "+e);
			e.printStackTrace();
		}
      
        return this;

    }
	
	
@FindBy(xpath="//label[text()='User Type']/parent::td/following-sibling::td/descendant::select")
private WebElement userTypeField;


public CreateUserIdentityPF selectUserTypefield(String userTypeValue){
	
	
	try {
		Thread.sleep(5000);
		
		Select dropdown =new Select(userTypeField);
		List<WebElement> userTypeCount= dropdown.getOptions();
		int userTypeSize=userTypeCount.size();
		for(int i=0;i<userTypeSize;i++)
			{
		dropdown.selectByVisibleText(userTypeValue);
			}
		Thread.sleep(5000);
		
			reportStep("The UserTypeField value: "+userTypeField+" is selected ", "PASS");
	} catch (Exception e) {
		reportStep("The UserTypeField value: "+userTypeField+" is not selected", "FAIL");
		System.out.println("couldnt enter keys into web elt "+e);
		e.printStackTrace();
	}
  
    return this;

}

@FindBy(xpath="//label[text()='Confirm Password']/parent::td/following-sibling::td/input")
private WebElement confirmPasswordField;

public CreateUserIdentityPF enterConfirmPassword(String confirmPasswordValue){
	
	
	try {
		confirmPasswordField.click();
		confirmPasswordField.clear();
		confirmPasswordField.sendKeys(confirmPasswordValue);	
		reportStep("The Confirm password value: "+userTypeField+" is entered ", "PASS");
	} catch (Exception e) {
		reportStep("The confirm password value: "+userTypeField+" is not entered", "FAIL");
		System.out.println("couldnt enter keys into web elt "+e);
		e.printStackTrace();
	}
  
    return this;

}


@FindBy(xpath="//span[text()='Submit']")
private WebElement submitButton;

public CreateUserIdentityPF clickSubmitButton(String confirmPasswordValue){
	
	
	try {
		submitButton.click();
		reportStep("The submit button: "+submitButton+" is clicked ", "PASS");
	} catch (Exception e) {
		reportStep("The submit button: "+userTypeField+" is not clicked", "FAIL");
		System.out.println("couldnt enter keys into web elt "+e);
		e.printStackTrace();
	}
  
    return this;

}
	}
	
	



	
	
	

