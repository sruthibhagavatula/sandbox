package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import wrappers.ssdSandbox;

public class FarmOIMPage extends ssdSandbox{
	public FarmOIMPage()
	{
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath = "//span[@title='SOA']/parent::span/ancestor::span[@class='x1a']/preceding-sibling::span")
    private WebElement soaExpand;

		
	public FarmOIMPage expandSoa()
	{
		try
		{
			
			soaExpand.click();
		reportStep("Soa is  : "+soaExpand+" expanded", "PASS");
		} catch (Exception e) {
			reportStep("Soa is : "+soaExpand+" not expanded", "FAIL");
			System.out.println("couldnt enter keys into web elt "+e);
			e.printStackTrace();
		}
             return this;		
		}
	@FindBy(xpath = "//span[@title='/Farm_oim_domain/oim_domain/soa_server1/soa-infra']/parent::span/ancestor::span[@class='x1a']/preceding-sibling::span")
    private WebElement soaInfraExpand;

	
	public FarmOIMPage expandSoaInfra()
	{
		try
		{
			sleepFor(10);
			soaInfraExpand.click();
			
		reportStep("Soa Infra is : "+soaInfraExpand+" expanded", "PASS");
		} catch (Exception e) {
			reportStep("Soa Infra is: "+soaInfraExpand+" not expanded", "FAIL");
			System.out.println("couldnt enter keys into web elt "+e);
			e.printStackTrace();
		}
             return this;		
		}
	
	@FindBy(xpath = "//span[text()='default']/parent::span/ancestor::span[@class='x1a']/preceding-sibling::span")
    private WebElement defaultExpand;

	 
	 public FarmOIMPage expandDefault()
		{
			try
			{
				sleepFor(7);
				defaultExpand.click();
			reportStep("Default is : "+defaultExpand+" expanded", "PASS");
			} catch (Exception e) {
				reportStep("Default is: "+defaultExpand+" not expanded", "FAIL");
				System.out.println("couldnt enter keys into web elt "+e);
				e.printStackTrace();
			}
	             return this;		
			}
	 
	 
     @FindBy(xpath = "//span[contains(text(),'OPERAApprovalWorkflow')]")
     private WebElement operaAppWrkFlowTxt;

	 
	 public FarmOIMPage clickOperaApprovalWorkFlow()
		{
			try
			{
				sleepFor(7);
				operaAppWrkFlowTxt.click();
			reportStep("clicked on : "+operaAppWrkFlowTxt+" operaapprovalworkflow", "PASS");
			} catch (Exception e) {
				reportStep("operaapprovalworkflow: "+operaAppWrkFlowTxt+" is not clicked", "FAIL");
				System.out.println("couldnt enter keys into web elt "+e);
				e.printStackTrace();
			}
	             return this;		
			}
	 
     @FindBy(xpath = "//a[contains(text(),'ApprovalTask')]")
     private WebElement approvalTaskLbl;

	 
	 public FarmOIMPage clickApprovalTaskflow()
		{
			try
			{
				sleepFor(10);
				approvalTaskLbl.click();
			reportStep("clicked on : "+approvalTaskLbl+" ApprovalTaskflow", "PASS");
			} catch (Exception e) {
				reportStep("ApprovalTaskflow: "+approvalTaskLbl+" is not clicked", "FAIL");
				System.out.println("couldnt enter keys into web elt "+e);
				e.printStackTrace();
			}
	             return this;		
			}
	 
	 @FindBy(xpath = "//a[contains(text(),'Administration')]")
     private WebElement administrationLbl;

	
	 public FarmOIMPage clickAdministrationTab()
		{
			try
			{
				sleepFor(7);
				administrationLbl.click();
				
			reportStep("clicked on : "+administrationLbl+" Administrationtab", "PASS");
			
			
			} catch (Exception e) {
				reportStep("Administration tab: "+administrationLbl+" is not clicked", "FAIL");
				System.out.println("couldnt enter keys into web elt "+e);
				e.printStackTrace();
			}
	             return this;		
			}
	 
	 @FindBy(xpath = "//span[contains(text(),' Add URI')]/parent::a")
	    private WebElement addUriBtn;
	 
	 
	 
	 
	 
	 public Adduri clickAddUri()
		{
			try
			{
				//if(driver.findElementByXPath(""))
				sleepFor(10);
				addUriBtn.click();
			reportStep("clicked on : "+addUriBtn+" adduri button", "PASS");
			} catch (Exception e) {
				reportStep("adduri button: "+addUriBtn+" is not clicked", "FAIL");
				System.out.println("couldnt enter keys into web elt "+e);
				e.printStackTrace();
			}
	             return new Adduri();		
			}
	 
	 
	 public boolean verifyURIExists(String applicationName){
		 
		 try{
			 return driver.findElement(By.xpath("//input[@value='"+applicationName+"']")).isDisplayed();
		 }
         catch(NoSuchElementException e){
        	 return false;
        	 
         }
         
                         
	 }
         public void updateOHSHost(String applicationName,String ohsHostName){
             
             driver.findElement(By.xpath("//input[@value='"+applicationName+"']/ancestor::td[@class='xdy']/following-sibling::td/descendant::label[text()='Host Name']/preceding-sibling::input"))
             .sendKeys(ohsHostName);
             
}

public void updateHttpPort(String applicationName,String httpPort){
             
             driver.findElement(By.xpath("//input[@value='"+applicationName+"']/ancestor::td[@class='xdy']/following-sibling::td/descendant::label[text()='HTTP Port']/preceding-sibling::input"))
             .sendKeys(httpPort);
             
}
public void updateHttpsPort(String applicationName,String httpsPort){
             
             driver.findElement(By.xpath("//input[@value='"+applicationName+"']/ancestor::td[@class='xdy']/following-sibling::td/descendant::label[text()='HTTPS Port']/preceding-sibling::input"))
             .sendKeys(httpsPort);
}
@FindBy(xpath = "//button[text()='Apply']")
private WebElement applyBtn;

public void clickApplyBtn(){
             applyBtn.click();
}


@FindBy(xpath = "//td[@id='saveTaskFormURIDialog::_fcc']/child::button[text()='OK']")
private WebElement confirmationDialog_OK;

public void clickConfirmationOKBtn(){
	try{
    Thread.sleep(5000);
    confirmationDialog_OK.click();
	}
	 catch (Exception e) {
			reportStep("adduri button: "+addUriBtn+" is not clicked", "FAIL");
			System.out.println("couldnt enter keys into web elt "+e);
			e.printStackTrace();
		}
          
		}


public void verifyHostName(String hostName) {
	try{
    Thread.sleep(5000);

    driver.findElement(By.xpath("//input[@value='"+hostName+"']")).isDisplayed();
	}
	catch (Exception e) {
		reportStep("Hostname : "+addUriBtn+" is not verified", "FAIL");
		System.out.println("couldnt enter keys into web elt "+e);
		e.printStackTrace();
	}
    /*
    driver.findElement(By.xpath("//input[@value='"+appName+"']/ancestor::td[@class='xdy']/following-sibling::td/descendant::label[text()='Host Name']/preceding-sibling::input")).
    getAttribute("value").equalsIgnoreCase(hostName);*/
    
    
}

public void verifyHttps(String https) {
    
    driver.findElement(By.xpath("//input[@value='"+https+"']")).isDisplayed();

    /*driver.findElement(By.xpath("//input[@value='"+_appName+"']/ancestor::td[@class='xdy']/following-sibling::td/descendant::label[text()='HTTPS Port']/preceding-sibling::input")).
    getAttribute("value").equalsIgnoreCase(https);*/
}

public void verifyHttp(String http) {
    
    driver.findElement(By.xpath("//input[@value='"+http+"']")).isDisplayed();
    /*driver.findElement(By.xpath("//input[@value='"+_appName+"']/ancestor::td[@class='xdy']/following-sibling::td/descendant::label[text()='HTTP Port']/preceding-sibling::input")).
    getAttribute("value").equalsIgnoreCase(http);*/
}

}





