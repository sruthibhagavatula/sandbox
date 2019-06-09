package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wrappers.ssdSandbox;

public class UsersIdentityPF extends ssdSandbox{
	public UsersIdentityPF()
	{
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath = "//h1[text()='Users']")
	private WebElement UsersTitle;
	
	
	public UsersIdentityPF verifyUsersTitle() {
		String title ="";
		try {
    		title = UsersTitle.getText();
    		String expectedTitle ="Users";
    		if(title.equalsIgnoreCase(expectedTitle))
    		{
    			System.out.println("Title Matched");
    		}
    		else
    			 System.out.println("Title didn't match");
    		//VerifyTitle.isDisplayed();
    		
    			reportStep("The Title: "+title+" is verified successfully ", "PASS");
		} catch (Exception e) {
			reportStep("The Title: "+title+" is not valid", "FAIL");
			System.out.println("couldnt enter keys into web elt "+e);
			e.printStackTrace();
		}
      
        return this;

    }
	
	@FindBy(xpath="//span[text()=' Create']")
	private WebElement createUserIcon;
	
	
	public CreateUserIdentityPF clickCreateUsersIcon() {
		
	
			 try{  
	    		 Thread.sleep(5000);
	    		 System.out.println("click Create Users Icon");
	    		 createUserIcon.click();
	    	   	reportStep("The webelement : createUserIcon  clicked", "PASS");
	    }catch (Exception e) {
			reportStep("The webelement : createUserIcon could not clicked", "FAIL");
			System.out.println("couldnt enter keys into web elt "+e);
			e.printStackTrace();
		}
	        return new CreateUserIdentityPF();

	    }
    }



	
	
	
	
	
	


	
	
	

