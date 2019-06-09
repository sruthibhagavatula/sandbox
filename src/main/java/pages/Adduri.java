package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wrappers.ssdSandbox;

public class Adduri extends ssdSandbox{
	public Adduri()
	{
		PageFactory.initElements(driver, this);
		
	}
	
    @FindBy(xpath = "//span[contains(text(),' Add URI')]/parent::a")
    private WebElement addUriBtn;
    
    public void clickAddUri() {
    	sleepFor(5);

        addUriBtn.click();

}



    @FindBy(name = "it1")
    private WebElement applicationName;

    
    public void enterAppName(String appName) {
        applicationName.sendKeys(appName);
}

    @FindBy(name = "it2")
    private WebElement hostName;

    
    public void enterHostName(String _hostName) {
        hostName.sendKeys(_hostName);
}


    @FindBy(name = "it3")
    private WebElement httpPort;
    
    public void enterhttpPort(String _httpPort) {
        httpPort.sendKeys(_httpPort);
}


    @FindBy(name = "it4")
    private WebElement httpsPort;
    
    public void enterhttpsPort(String _httpsPort) {
        httpsPort.sendKeys(_httpsPort);
}



    @FindBy(name = "it5")
    private WebElement uRi;

    
    public void enterURI(String uRI) {
        uRi.sendKeys(uRI);
}

    @FindBy(id = "addTaskFormURIDialog::ok")
    private WebElement addURI_OKBtn;
    
    public void addURI_OKBtn() {
    	try{
        addURI_OKBtn.click();
        reportStep("click ok: "+addURI_OKBtn+" button is clicked", "FAIL");
        Thread.sleep(5000);
    	}
    	 catch (Exception e) {
				reportStep("click ok: "+addURI_OKBtn+" button not done", "FAIL");
				System.out.println("couldnt enter keys into web elt "+e);
				e.printStackTrace();
			}
	             	
			
}

		
}

	
	
	

