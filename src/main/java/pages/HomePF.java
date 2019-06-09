package pages;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.ssdSandbox;

public class HomePF extends ssdSandbox {
	public HomePF(){
		PageFactory.initElements(driver, this);
		try {
			Thread.sleep(10000);
			verifyTitleByXpath();
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	
	}
	@FindBy(xpath = "//div[text()='Identity System Administration']")
	private WebElement VerifyTitle;
	
	
	public HomePF verifyTitleByXpath() {
		String title ="";
		try {
    		title = VerifyTitle.getText();
    		//VerifyTitle.isDisplayed();
    		
    			reportStep("The Title: "+title+" is verified successfully ", "PASS");
		} catch (Exception e) {
			reportStep("The Title: "+title+" is not valid", "FAIL");
			System.out.println("couldnt enter keys into web elt "+e);
			e.printStackTrace();
		}
      
        return this;

    }
	
	@FindBy(xpath="//a[contains(text(),'Sandboxes')]")
	private WebElement clickSandBoxes;
	
	public ManageSandboxesPF clickSandbox()
	{
		
		try {
			Thread.sleep(8000);
			clickSandBoxes.click();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new ManageSandboxesPF();
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
	

	@FindBy (xpath="//span[contains(text(),'Application Instances')]")
	private WebElement ClickApplicationInstancesIcon;
	
	public ApplicationInstancesPF clickApplicationInstance(){
		
		
		try {
			ClickApplicationInstancesIcon.click();    		
    			reportStep("The CreateIcon: "+ClickApplicationInstancesIcon+" is clicked ", "PASS");
		} catch (Exception e) {
			reportStep("The CreateIcon: "+ClickApplicationInstancesIcon+" is not clicked", "FAIL");
			System.out.println("couldnt enter keys into web elt "+e);
			e.printStackTrace();
		}
      
        return new ApplicationInstancesPF() ;

    }
	
	@FindBy(xpath = "//span[text()='User']")
	private WebElement UserTab;
	public ManageUserPF ClickUserTab()
	{
	try{
		sleepFor(7);
		UserTab.click();
		
	reportStep("clicked on User: "+UserTab+"Under system entities", "PASS");
	}
	catch (Exception e) {
		reportStep("Not clicked on User: "+UserTab+" under system entities ", "FAIL");
		System.out.println("couldnt enter keys into web elt "+e);
		e.printStackTrace();
	}
	return new ManageUserPF();
	}
	  @FindBy(xpath="//label[text()='Sandbox Archive']/parent::td[@class='xs']/following-sibling::td/input")
	   private WebElement chooseFile;
	   
	   public HomePF clickChooseFile() {
	    	try {
	    		
	    		Thread.sleep(6000);
	    		File f=new File("./src/main/java/resources/ImportZipFiles");
	    		Thread.sleep(5000);
	    		ArrayList<File> files = new ArrayList<File>(Arrays.asList(f.listFiles()));
	    		for(int i=0;i<files.size();i++){
	    			clickSandbox();
	    			ManageSandboxesPF m=new ManageSandboxesPF();
	    			m.clickMoreTab();
	    			m.clickImportSandBox();
	    			
	    			System.out.println(files.get(i));
	    			//String path=files.get(i);
	    			//chooseFile.sendKeys("D:\\Selenium doc\\sandbox_CreateUserCustomize.zip");
	    			String Path=files.get(i).getAbsolutePath();
	    			chooseFile.sendKeys(Path);
	    			ImportSandbox imp = new ImportSandbox();
	    			imp.clickImportButton();
	    			
	    			m.clickRefreshButton();
	      			m.clickCreatedSandBox();
	      			
	      			String n=files.get(i).getName();
	      			String n1=n.substring(n.lastIndexOf("/")+1);
	      			String n2=n1.substring(n1.lastIndexOf("_")+1);
	      			String sandboxname=n2.replace(".zip","");
	      			System.out.println(sandboxname);
	      			m.verifyActiveStatus(sandboxname);
	      			Thread.sleep(6000);
	      			m.clickPublishSandbox();
	      			PublishSandboxPF pubpf = new PublishSandboxPF();
	      			pubpf.ClickOkPublishSandbox();
	      			Thread.sleep(5000);
	    			
	    		}
			
			reportStep("Imported the file", "PASS");
			} catch (Exception e) {
				reportStep("file not imported", "FAIL");
				System.out.println("couldnt enter keys into web elt "+e);
				e.printStackTrace();
			}
	      
	        return this;

	    }
}
