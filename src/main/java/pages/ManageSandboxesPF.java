package pages;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import wrappers.ssdSandbox;

public class ManageSandboxesPF extends ssdSandbox {
	public  ManageSandboxesPF() {
		
		PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy (xpath= "//span[contains(text(),'Create Sandbox')]")
	private WebElement CreateSandboxImg;
	
	
	
	public CreateSandboxPF createSandbox(String sbName,String sbDesc ){
		try {
			Thread.sleep(5000);
		CreateSandboxImg.click();
		reportStep("The button: "+CreateSandboxImg+" is clicked  ", "PASS");
		
		}
		catch (Exception e) {
			reportStep("The button: "+CreateSandboxImg+" is not clicked", "FAIL");
			System.out.println("couldnt enter keys into web elt "+e);
			e.printStackTrace();
	}
		return new CreateSandboxPF(sbName,sbDesc);
	}
	
	@FindBy (xpath= "//span[contains(text(),' Activate Sandbox')]")
	private WebElement clickActivateSandbox;
	
	public ManageSandboxesPF verifyActiveStatus(String sandBoxName){
		try{
			 if(driver.findElement(By.xpath("//a[text()='"+sandBoxName+"']/ancestor::td/following-sibling::td/span/img")).isDisplayed()){
				 System.out.println("Sandbox is active");
			 }
			 else{
				 
				 clickActivateSandbox.click();
				 Assert.assertTrue("Sandbox is not activated,Try again!!", driver.findElement(By.xpath("//a[text()='"+sandBoxName+"']/ancestor::td/following-sibling::td/span/img")).isDisplayed());
				 
				 
				 
			 }
		}
		catch (Exception e) {
			reportStep("The Status: "+sandBoxName+" is not found", "FAIL");
			System.out.println("couldnt enter keys into web elt "+e);
			e.printStackTrace();
	}
		return this;
	
	}
	
	
	
	
	
	@FindBy (xpath="//a[@id='pt1:_lar:0:cil8']/span")
	private WebElement ClickFormDesigner;
	
	public FormDesignerPF clickFormDesigner(){
		try{
		ClickFormDesigner.click();
		reportStep("Form designer  : "+ClickFormDesigner+" is clicked  ", "PASS");
		}
		catch (Exception e) {
			reportStep("The Status: "+ClickFormDesigner+" is not active", "FAIL");
			System.out.println("couldnt enter keys into web elt "+e);
			e.printStackTrace();
	}
		return new FormDesignerPF();
	}
	
	
	
	
	@FindBy (id="pt1:_sh_np2:_dtb_0::rmAbv")
	private WebElement ManageSandboxClose;
	
	public HomePF clickManageSandboxClose(){
		try{
			ManageSandboxClose.click();
		reportStep("Manage Sandbox close  : "+ManageSandboxClose+" is clicked  ", "PASS");
		}
		catch (Exception e) {
			reportStep("Manage Sandbox close: "+ManageSandboxClose+" is not active", "FAIL");
			System.out.println("couldnt enter keys into web elt "+e);
			e.printStackTrace();
	}
		return new HomePF();
	}
	
	
	
	
	@FindBy (xpath="//span[text()=' Refresh']")
	private WebElement refreshButton;
	
	public ManageSandboxesPF clickRefreshButton(){
		try{
			Thread.sleep(5000);
			/*WebDriverWait wait = new WebDriverWait(driver,50);
			wait.until(ExpectedConditions.visibilityOf(refreshButton));*/
			refreshButton.click();
			Thread.sleep(2000);
		reportStep("Refresh button clicked:" , "PASS");
		}
		catch (Exception e) {
			reportStep("Refresh button ","  is not clicked FAIL");
			System.out.println("couldnt enter keys into web elt "+e);
			e.printStackTrace();
	}
		return this;
	}
	
	
	public ManageSandboxesPF clickCreatedSandBox(){
		try{
			driver.findElement(By.xpath("//table[@class='x178 xi9']/descendant::td[3]")).click();
		reportStep("clicked on created Sandbox:" , "PASS");
		}
		catch (Exception e) {
			reportStep("created Sandbox ","  is not clicked FAIL");
			System.out.println("couldnt enter keys into web elt "+e);
			e.printStackTrace();
	}
		return this;
	}
	
	
	@FindBy (xpath="//a/span[contains(text(),'Publish Sandbox')]")
			private WebElement ClickPublishButton;
	
	public PublishSandboxPF clickPublishSandbox(){
		try{
			Thread.sleep(8000);
			ClickPublishButton.click();
		reportStep("clicked on publish Sandbox: "+ClickPublishButton, "PASS");
		}
		catch (Exception e) {
			reportStep("publish Sandbox : "+ClickPublishButton+" is not clicked", "FAIL");
			System.out.println("couldnt enter keys into web elt "+e);
			e.printStackTrace();
	}
		return new PublishSandboxPF();
	}

	
	/*@FindBy (xpath="//a/span[contains(text(),'Publish Sandbox')]")//need to write xpath
	private WebElement UserWebElement;

public ManageUserPF UserLink(){
try{
	UserWebElement.click();
reportStep("clicked on user: "+UserWebElement+"under system entity", "PASS");
}
catch (Exception e) {
	reportStep("user is not clicked : "+ClickPublishButton+" under system entitiy", "FAIL");
	System.out.println("couldnt enter keys into web elt "+e);
	e.printStackTrace();
}
return new ManageUserPF();
}*/


@FindBys ( value = { @FindBy(xpath="//div[@class='xr9']/descendant::a[@title='Close Tab']") })
private List<WebElement> listcloseTabIcons;

public HomePF closeOpenedTabs(){
	
		clickCloseOpenTabs(listcloseTabIcons);
	      
    return new HomePF() ;

}

@FindBy(xpath="//span[text()=' Export Sandbox']/ancestor::table[@class='x2a2']/parent::div/following-sibling::div")
//@FindBy(xpath="//div[contains(@style,'overflow: hidden')]/div[contains(@class,'x19o')]/div[contains(@id,'eoi')]")
private WebElement clickMoreTab;

public ManageSandboxesPF clickMoreTab(){
	try{
		Thread.sleep(8000);
		if(clickMoreTab.isDisplayed())
		{
			System.out.println("clickmore tab is visible");
			Thread.sleep(3000);
			clickMoreTab.click();
		}
		
	reportStep("clicked on more tab : "+clickMoreTab, "PASS");
	}
	catch (Exception e) {
		reportStep("more tab : "+clickMoreTab+" is not clicked", "FAIL");
		System.out.println("couldnt enter keys into web elt "+e);
		e.printStackTrace();
}
	return this;
}



@FindBy(xpath="//span[text()=' Import Sandbox']")
private WebElement ImportSandbox;

public ImportSandbox clickImportSandBox(){
	try{
		Thread.sleep(8000);
		ImportSandbox.click();
	reportStep("clicked on import sandbox : "+ImportSandbox, "PASS");
	}
	catch (Exception e) {
		reportStep("Import sandbox : "+ImportSandbox+" is not clicked", "FAIL");
		System.out.println("couldnt enter keys into web elt "+e);
		e.printStackTrace();
}
	return new ImportSandbox();
}









	
}
