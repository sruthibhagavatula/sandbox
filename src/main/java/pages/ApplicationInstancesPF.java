package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import wrappers.ssdSandbox;

public class ApplicationInstancesPF extends ssdSandbox{
	public ApplicationInstancesPF()
	{
		PageFactory.initElements(driver, this);
		verifyApplicationInstanceTitle("Search Application Instances");
	}
	@FindBy (xpath="//h1[contains(text(),'Search Application Instances')]")
	private WebElement ApplicationInstancesTitle;
	
	public ApplicationInstancesPF verifyApplicationInstanceTitle(String ApplInstTitle) {
		String title ="";
		try {
    		title =ApplicationInstancesTitle.getText();
    		//VerifyTitle.isDisplayed();
    		
    			reportStep("The Title: "+title+" is verified successfully ", "PASS");
		} catch (Exception e) {
			reportStep("The Title: "+title+" is not valid", "FAIL");
			System.out.println("couldnt enter keys into web elt "+e);
			e.printStackTrace();
		}
      
        return this ;

    }
	
	
	@FindBy (xpath="//*[@class='xhr'][2] //table //div")
	private WebElement ClickCreateApplInst;
	
	public CreateApplicationInstancesPF CreateApplicationInstance(){
		
		
		try {
			Thread.sleep(5000);
			ClickCreateApplInst.click();    		
    			reportStep("The CreateIcon: "+ClickCreateApplInst+" is clicked ", "PASS");
		} catch (Exception e) {
			reportStep("The CreateIcon: "+ClickCreateApplInst+" is not clicked", "FAIL");
			System.out.println("couldnt enter keys into web elt "+e);
			e.printStackTrace();
		}
      
        return new CreateApplicationInstancesPF() ;

    }
	
	@FindBy(xpath = "//div[@class='xr9']/descendant::a[@title='Close Tab']")
	private WebElement closeApplicationInstanceTab;

	public HomePF ClickCloseApplicationInstanceTab()
	{
	try{
		closeApplicationInstanceTab.click();
	reportStep("clicked on Close: "+closeApplicationInstanceTab+"Managesandbox tab", "PASS");
	}
	catch (Exception e) {
		reportStep("Not clicked : "+closeApplicationInstanceTab+" on close ", "FAIL");
		System.out.println("couldnt enter keys into web elt "+e);
		e.printStackTrace();
	}
	return new HomePF();
	}
	
	
	
	
	
	
	}
	
	



	
	
	

