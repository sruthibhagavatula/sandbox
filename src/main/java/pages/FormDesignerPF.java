package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wrappers.ssdSandbox;

public class FormDesignerPF extends ssdSandbox{
	public FormDesignerPF()
	{
		PageFactory.initElements(driver, this);
		//verifyFormDesignerTitleByXpath();
	}
	@FindBy (xpath="//a[@id='pt1:_lar:0:cil8']/span")
	private WebElement FormDesignerTitle;
	
	public FormDesignerPF verifyFormDesignerTitleByXpath() {
		String title ="";
		try {
    		title =FormDesignerTitle.getText();
    		//VerifyTitle.isDisplayed();
    		
    			reportStep("The Title: "+title+" is verified successfully ", "PASS");
		} catch (Exception e) {
			reportStep("The Title: "+title+" is not valid", "FAIL");
			System.out.println("couldnt enter keys into web elt "+e);
			e.printStackTrace();
		}
      
        return this ;

    }
	@FindBy (xpath="//span[text()=' Create']")
	private WebElement ClickCreateIcon;
	
	public CreateFormPF clickCreateForm(){
		
		
		try {
			ClickCreateIcon.click();    		
    			reportStep("The CreateIcon: "+ClickCreateIcon+" is clicked ", "PASS");
		} catch (Exception e) {
			reportStep("The CreateIcon: "+ClickCreateIcon+" is not clicked", "FAIL");
			System.out.println("couldnt enter keys into web elt "+e);
			e.printStackTrace();
		}
      
        return new CreateFormPF() ;

    }
	
	
	
	
	}
	
	



	
	
	

