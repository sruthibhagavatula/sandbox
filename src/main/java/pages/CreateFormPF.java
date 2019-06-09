package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wrappers.ssdSandbox;

public class CreateFormPF extends ssdSandbox{
	public CreateFormPF()
	{
		PageFactory.initElements(driver, this);
		//verifyFormTitleByXpath("New Form For");
	}
	
	/*@FindBy (xpath="//td[@id='pt1:_d_reg:region2:1:ph1::_afrTtxt']/div")
	private WebElement createFormTitle;
	
	public CreateFormPF verifyFormTitleByXpath(String formTitle) {
		String title ="";
		try {
    		title =createFormTitle.getText();
    		//VerifyTitle.isDisplayed();
    		
    			reportStep("The Title: "+title+" is verified successfully ", "PASS");
		} catch (Exception e) {
			reportStep("The Title: "+title+" is not valid", "FAIL");
			System.out.println("couldnt enter keys into web elt "+e);
			e.printStackTrace();
		}
      
        return this;
        
            }*/
	@FindBy(xpath="//label[text()='Resource Type']/parent::td[@class='xz x4z']/following-sibling::td/input")
	private WebElement enterResourceType;
	
	public CreateFormPF enterResourceType(String ResourceTypeName) {
		
		try {
    		
			enterResourceType.click();
			enterResourceType.clear();
			enterResourceType.sendKeys(ResourceTypeName);
			Thread.sleep(5000);
		reportStep("The ResourceTypeName : "+ResourceTypeName+" is entered", "PASS");
		} catch (Exception e) {
			reportStep("The ResourceTypeName: "+ResourceTypeName+" is not entered", "FAIL");
			System.out.println("couldnt enter keys into web elt "+e);
			e.printStackTrace();
		}
      
        return this;

			
		}
	
	@FindBy(xpath = "//label[text()='Form Name']/parent::td[@class='xu x4z']/following-sibling::td/input")
	private WebElement FormName;
	
	public CreateFormPF enterFormName(String FormNameValue) {
		
		try {
    		
			FormName.click();
			FormName.clear();
			FormName.sendKeys(FormNameValue);
			Thread.sleep(5000);
		reportStep("The FormName : "+FormNameValue+" is entered", "PASS");
		} catch (Exception e) {
			reportStep("The FormName: "+FormNameValue+" is not entered", "FAIL");
			System.out.println("couldnt enter keys into web elt "+e);
			e.printStackTrace();
		}
      
        return this;

			
		}
	
	 @FindBy(xpath = "//span[text()='Create']/preceding-sibling::img/parent::button")
	private WebElement CreateButton;
	 
	@FindBy(xpath="//div[text()='Error']")
	private WebElement ErrorHandlingPopUpTitle;
	
	@FindBy(xpath="//button[text()='OK']")
	private WebElement ErrorHandlingPopUpOK;
	
	@FindBy(xpath="//div[text()='Form with given name already exists']")
	private WebElement checkingExistingForm;
	
	
	public CreateFormPF clickCreateButton() {
		
		try {
			
			Thread.sleep(5000);
			CreateButton.click();
			if(ErrorHandlingPopUpTitle.isDisplayed())
			{
				String popupContent="Form with given name already exists";
				String popupContentGetText=checkingExistingForm.getText();			
				if(popupContentGetText== popupContent)
				{
					ErrorHandlingPopUpOK.click();
				}
				else{
				sleepFor(4);
				ErrorHandlingPopUpOK.click();
				sleepFor(3);
				CreateButton.click();
				sleepFor(4);
				ErrorHandlingPopUpOK.click();
			}
			}
			reportStep("The CreateButton : "+CreateButton+" is clicked", "PASS");
		} catch (Exception e) {
			reportStep("The CreateButton: "+CreateButton+" is not clicked", "FAIL");
			System.out.println("couldnt enter keys into web elt "+e);
			e.printStackTrace();
		}
      
        return this;

			
		}
	
	@FindBy(xpath = "//div[@class='xr9']/descendant::a[@title='Close Tab']")
	private WebElement closeFormDesignerTab;

	public HomePF ClickCloseFormDesignerTab()
	{
	try{
		closeFormDesignerTab.click();
	reportStep("clicked on Close: "+closeFormDesignerTab+"Managesandbox tab", "PASS");
	}
	catch (Exception e) {
		reportStep("Not clicked : "+closeFormDesignerTab+" on close ", "FAIL");
		System.out.println("couldnt enter keys into web elt "+e);
		e.printStackTrace();
	}
	return new HomePF();
	}
}


	
	
	
	
	
	


	
	
	

