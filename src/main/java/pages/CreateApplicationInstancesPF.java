package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import wrappers.ssdSandbox;

public class CreateApplicationInstancesPF extends ssdSandbox{
	public CreateApplicationInstancesPF()
	{
		PageFactory.initElements(driver, this);
		verifyApplicationInstanceTitle("Create Application Instance");
	}
	
	@FindBy(xpath="//h1[contains(text(),'Create Application Instance')]")
	private WebElement CreateApplicationInstanceTitle;
	
	public CreateApplicationInstancesPF verifyApplicationInstanceTitle(String ApplicationInstance){
		String title ="";
		try {
    		title =CreateApplicationInstanceTitle.getText();
    		//VerifyTitle.isDisplayed();
    		
    			reportStep("The Title: "+title+" is verified successfully ", "PASS");
		} catch (Exception e) {
			reportStep("The Title: "+title+" is not valid", "FAIL");
			System.out.println("couldnt enter keys into web elt "+e);
			e.printStackTrace();
		}
      
        return this ;

    }
	
	@FindBy(xpath = "//label[text()='Name']/parent::td[@class='xu x4z']/following-sibling::td/input")
	private WebElement NameWebelement;
	
	public CreateApplicationInstancesPF enterAIName(String ApplInstName)
	{
		try
		{
			Thread.sleep(5000);
			NameWebelement.click();
			NameWebelement.clear();
			NameWebelement.sendKeys(ApplInstName);
		reportStep("The ApplInstname : "+ApplInstName+" is entered", "PASS");
		} catch (Exception e) {
			reportStep("The ApplInstname: "+ApplInstName+" is not entered", "FAIL");
			System.out.println("couldnt enter keys into web elt "+e);
			e.printStackTrace();
		}
      
        return this;

			
		}
	@FindBy(xpath = "//label[text()='Display Name']/parent::td[@class='xu x4z']/following-sibling::td/input")
	private WebElement DisplayNameWebelement;
	
	public CreateApplicationInstancesPF enterAIDisplayName(String ApplInstDisplayName)
	{
		try
		{
			DisplayNameWebelement.click();
			DisplayNameWebelement.clear();
			DisplayNameWebelement.sendKeys(ApplInstDisplayName);
		reportStep("The ApplInstDisplayname : "+ApplInstDisplayName+" is entered", "PASS");
		} catch (Exception e) {
			System.out.println("couldnt enter keys into web elt "+e);
			e.printStackTrace();
			reportStep("The ApplInstDisplayname: "+ApplInstDisplayName+" is not entered", "FAIL");
			
		}
      
        return this;

			
		}
	@FindBy(xpath = "//label[text()='Description']/parent::td[@class='xu x4z']/following-sibling::td/textarea")
	private WebElement DescWebelement;
	
	public CreateApplicationInstancesPF enterAIDesc(String ApplInstDesc)
	{
		try
		{
			DescWebelement.click();
			DescWebelement.clear();
			DescWebelement.sendKeys(ApplInstDesc);
		reportStep("The ApplInstDesc : "+ApplInstDesc+" is entered", "PASS");
		} catch (Exception e) {
			reportStep("The ApplInstDesc: "+ApplInstDesc+" is not entered", "FAIL");
			System.out.println("couldnt enter keys into web elt "+e);
			e.printStackTrace();
		}
      
        return this;

			
		}
	@FindBy(xpath = "//label[text()='Resource Object']/parent::td[@class='xz x4z']/following-sibling::td/input")
	private WebElement ResourceObject;
	
	public CreateApplicationInstancesPF enterResourceObj(String ResourceObvalue)
	{
		try
		{
			ResourceObject.click();
			ResourceObject.clear();
			ResourceObject.sendKeys(ResourceObvalue);
		reportStep("The ResourceObvalue : "+ResourceObvalue+" is entered", "PASS");
		} catch (Exception e) {
			reportStep("The ResourceObvalue: "+ResourceObvalue+" is not entered", "FAIL");
			System.out.println("couldnt enter keys into web elt "+e);
			e.printStackTrace();
		}
      
        return this;

			
		}
	@FindBy(xpath = "//label[text()='IT Resource Instance']/parent::td[@class='xz x4z']/following-sibling::td/input")
	private WebElement ItResourceInst;
	
	public CreateApplicationInstancesPF enterItResourceInst(String ItResourceInstvalue)
	{
		try
		{
			ItResourceInst.click();
			ItResourceInst.clear();
			ItResourceInst.sendKeys(ItResourceInstvalue);
		reportStep("The ItResourceInstvalue : "+ItResourceInstvalue+" is entered", "PASS");
		} catch (Exception e) {
			reportStep("The ItResourceInstvalue: "+ItResourceInstvalue+" is not entered", "FAIL");
			System.out.println("couldnt enter keys into web elt "+e);
			e.printStackTrace();
		}
      
        return this;

			
		}
	@FindBy(xpath = "//span[contains(text(),'Save')]/ancestor::div[@class='x2cm xhq p_AFTextOnly']")
    private WebElement SaveButton;
	
	public CreateApplicationInstancesPF clickSave()
	{
		try
		{
			SaveButton.click();
			reportStep("Save button : "+SaveButton+" is clicked", "PASS");
		} catch (Exception e) {
			reportStep("Save button: "+SaveButton+" is not clicked", "FAIL");
			System.out.println("couldnt enter keys into web elt "+e);
			e.printStackTrace();
		}
      
        return this;

			
		}
	@FindBys ( value = { @FindBy(xpath="//div[@class='xr9']/descendant::a[@title='Close Tab']") })
	private List<WebElement> listcloseTabIcons;
	
	public HomePF closeOpenedTabs(){
		
			clickCloseOpenTabs(listcloseTabIcons);
		      
        return new HomePF() ;

    }
	
	
	/*@FindBy(xpath = "//div[@class='xr9']/descendant::a[@title='Close Tab']")
	private List<WebElement> closeAllTabs;
	
	public HomePF clickCreateAppClose()
	{
		try
		{
			Thread.sleep(5000);
			  for(int i=1; i<= closeAllTabs.size(); i++){
		            
		            closeAllTabs.get(i).click();
		            Thread.sleep(3000);
		            reportStep("Close button : "+closeAllTabs+" is clicked", "PASS");
		        }
			
		} catch (Exception e) {
			reportStep("Close button: "+closeAllTabs+" is not clicked", "FAIL");
			System.out.println("couldnt enter keys into web elt "+e);
			e.printStackTrace();
		}
      
        return new HomePF();

			
		}
*/
	
	@FindBy(id="pt1:_shgnp1:cni5")
	private WebElement clickSandBoxes;
	
	public ManageSandboxesPF clickSandbox()
	{
		driver.navigate().refresh();
		clickSandBoxes.click();
		return new ManageSandboxesPF();
	}
}

	
	



	
	
	

