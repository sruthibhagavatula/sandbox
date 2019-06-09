package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import wrappers.ssdSandbox;

public class ManageUserPF extends ssdSandbox{
	public ManageUserPF()
	{
		PageFactory.initElements(driver, this);
		
	}
	
	    
 @FindBy(xpath="//img[contains(@title,'Create a custom field')]")
	private WebElement CreateUserButton;
	
	public SelectFieldType ClickCreateUserButton() {
		
		try {
			Thread.sleep(5000);
			CreateUserButton.click();
    		//VerifyTitle.isDisplayed();
    		
    			reportStep("CreateUser button"+CreateUserButton+" is clicked ", "PASS");
		} catch (Exception e) {
			reportStep("CreateUser button: "+CreateUserButton+" is not clicked", "FAIL");
			System.out.println("couldnt enter keys into web elt "+e);
			e.printStackTrace();
		}
      
        return new SelectFieldType();
        
            }
	
	@FindBy(xpath ="//label[text()='Display Label']/parent::td/following-sibling::td/input")
    private WebElement displayLabel;

public ManageUserPF enterDisplayLabel(String displayLabelValue) {
		
		try
		{
			displayLabel.click();
			displayLabel.clear();
			displayLabel.sendKeys(displayLabelValue);
		reportStep("The DisplayLabel : "+displayLabel+" is entered", "PASS");
		} catch (Exception e) {
			reportStep("The DisplayLabel: "+displayLabel+" is not entered", "FAIL");
			System.out.println("couldnt enter keys into web elt "+e);
			e.printStackTrace();
		}
      
        return this;
		
}


@FindBy(xpath ="//label[text()='Name']/parent::td/following-sibling::td/input")
private WebElement nameManageUser;

public ManageUserPF enterNameManageUser(String NameValue) {
	
	try
	{
		nameManageUser.click();
		nameManageUser.clear();
		nameManageUser.sendKeys(NameValue);
	reportStep("The Name : "+NameValue+" is entered", "PASS");
	} catch (Exception e) {
		reportStep("The name: "+NameValue+" is not entered", "FAIL");
		System.out.println("couldnt enter keys into web elt "+e);
		e.printStackTrace();
	}
  
    return this;
	
}


@FindBy(xpath ="//label[text()='Searchable']/preceding-sibling::span/input")
private WebElement searchableCheckBox;

public ManageUserPF checkSearchableCheckbox() {
	
	try
	{
		searchableCheckBox.click();
		reportStep("The searchable checkbox : "+searchableCheckBox+" is clicked", "PASS");
	} catch (Exception e) {
		reportStep("The searchable checkbox: "+searchableCheckBox+" is not entered", "FAIL");
		System.out.println("couldnt enter keys into web elt "+e);
		e.printStackTrace();
	}
  
    return this;
	
}

@FindBy(xpath ="//span[text()='S']/ancestor::a")
private WebElement saveAndCloseBtn ;
public ManageUserPF clickSaveandClosebtn() {
	
	try
	{
		saveAndCloseBtn.click();
		reportStep("save and close button  : "+saveAndCloseBtn+" is clicked", "PASS");
	} catch (Exception e) {
		reportStep("save and close button: "+saveAndCloseBtn+" is not clicked", "FAIL");
		System.out.println("couldnt enter keys into web elt "+e);
		e.printStackTrace();
	}
  
    return this;
	
}

@FindBy(xpath ="//label[text()='Display Label']/preceding-sibling::input")

private WebElement searchTextInput ;

@FindBy(xpath ="//div[contains(@class,'p_AFEndOverflow xhm')]//div[contains(@id,'eoi')]")
private WebElement overflowElt;

@FindBy(xpath ="//a[@title='Collapse Pane']")
private WebElement collapseTab;
public ManageUserPF enterTextInput(String searchText) {
	
	try
	{
	
			try {
				if (overflowElt.isDisplayed()) {

					overflowElt.click();
				}
				reportStep("The Overflow button clicked :", "PASS");
			} catch (Exception e) {
				reportStep("The Overflow button Not Visible :", "FAIL");
			}
		
		sleepFor(5);
		searchTextInput.click();
		searchTextInput.clear();
		searchTextInput.sendKeys(searchText);
	reportStep("The text : "+searchText+" is searched", "PASS");
	} catch (Exception e) {
		reportStep("The text: "+searchText+" is not searched", "FAIL");
		System.out.println("couldnt enter keys into web elt "+e);
		e.printStackTrace();
	}
  
    return this;
	
}
@FindBy(xpath ="//a[@title='Search']")
private WebElement searchIcon ;


public ManageUserPF clickSearchIcon() {
	
	try
	{
		searchIcon.click();
		reportStep("The search icon : "+searchIcon+" is clicked", "PASS");
	} catch (Exception e) {
		reportStep("The search icon: "+searchIcon+" is not clicked", "FAIL");
		System.out.println("couldnt enter keys into web elt "+e);
		e.printStackTrace();
	}
  
    return this;
	
}

//@FindBy(id ="pt1:_d_reg:region1:1:r1:0:pc1:cbEditAttr::icon")
@FindBy(xpath ="//img[contains(@title,'Create a custom field')]/following::img[contains(@title,'Edit the selected field')]")
private WebElement editIcon ;
public ManageUserPF clickEditIcon() {
	
	try
	{
		editIcon.click();
		reportStep("The edit icon : "+editIcon+" is clicked", "PASS");
	} catch (Exception e) {
		reportStep("The edit icon: "+editIcon+" is not clicked", "FAIL");
		System.out.println("couldnt enter keys into web elt "+e);
		e.printStackTrace();
	}
  
    return this;
	
}

@FindBy(xpath ="//label[text()='Display Width']/parent::td/following-sibling::td/descendant::input")
private WebElement displayWidth ;

public ManageUserPF enterDisplayWidth(String displaywidthvalue) {
	
	try
	{
		displayWidth.click();
		displayWidth.clear();
		displayWidth.sendKeys(displaywidthvalue);
	reportStep("The display width : "+displaywidthvalue+" is entered", "PASS");
	} catch (Exception e) {
		reportStep("The display width: "+displaywidthvalue+" is  not entered", "FAIL");
		System.out.println("couldnt enter keys into web elt "+e);
		e.printStackTrace();
	}
  
    return this;
	
}

@FindBy(xpath ="//label[text()='Maximum Length']/parent::td/following-sibling::td/descendant::input")
private WebElement maximumLength;

public ManageUserPF enterMaximumLength(String maximumLengthvalue) {
	
	try
	{
		maximumLength.click();
		maximumLength.clear();
		maximumLength.sendKeys(maximumLengthvalue);
	reportStep("The maximum Length : "+maximumLengthvalue+" is entered", "PASS");
	} catch (Exception e) {
		reportStep("The maximum Length: "+maximumLengthvalue+" is  not entered", "FAIL");
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


}


	
	
	

