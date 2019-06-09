package testcases;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.testng.TestListenerAdapter;
import org.testng.TestNG;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.collections.Lists;

import pages.Adduri;
import pages.FarmOIMPage;
import pages.FormDesignerPF;
import pages.HomePF;
import pages.LoginIdentityPF;
import pages.LoginPF;
import pages.LoginSoaPage;
import pages.ManageSandboxesPF;
import wrappers.ssdSandbox;

public class SandBoxSetUp extends ssdSandbox {

	

	@BeforeClass
	public void setValues() {
		browserName = "chrome";
		testCaseName = "TC003_CreateFormDesigner";
		testDescription = "Create FormDesigner";
		category = "Sanity";
	}

	@Test 
	
	public  void testCreateSandBox() {
//Create sandbox
	
		new LoginPF()
		.enterLoginNameById(prop.getProperty("usernameSysadm"))
		.enterPswdById(prop.getProperty("passwordSysadm"))
		.clickSignIn()
		.clickSandbox()
		.createSandbox("testsandbox","SandBoxCreation")
		.clickConfimation()
		.verifyActiveStatus("den00pld")
		.closeOpenedTabs()
		.clickFormDesigner()
		.clickCreateForm()
		.enterResourceType("OID User")
		.enterFormName("OIDApplicationtest")
		.clickCreateButton()
		.ClickCloseFormDesignerTab()
		.clickApplicationInstance()
		.CreateApplicationInstance()
		.enterAIName("OIDApplication")
		.enterAIDisplayName("OID_App")
		.enterAIDesc("OID_App")
		.enterResourceObj("OID User")
		.enterItResourceInst("OID Server")
		.clickSave()
		.closeOpenedTabs()
//Publishing created sandbox
		.clickSandbox()
		.clickCreatedSandBox()
		.clickPublishSandbox()
		.ClickOkPublishSandbox()	
//Configure OIM User Entity for Multi tenancy
		.createSandbox("MultiTenancy1","MultiTen1")
		.clickConfimation()
		.closeOpenedTabs()
		.ClickUserTab()
		.ClickCreateUserButton()
		.ClickRadioButton()
		.ClickOkButton()
		.enterDisplayLabel("Tenant Code")
		.enterNameManageUser("usr_tenant_code")
		.checkSearchableCheckbox()
		.clickSaveandClosebtn()
		.closeOpenedTabs()
		.clickSandbox()
		.clickCreatedSandBox()
		.clickPublishSandbox()
		.ClickOkPublishSandbox()
		.closeOpenedTabs()
//Import Pre defined sandboxes
		/*.clickSandbox()
		.clickMoreTab()
		.clickImportSandBox()*/

		//.clickImportButton()
		
		.clickChooseFile()
		
		
//Adjust Precision scale for Tenant code
		.clickSandbox()
		.createSandbox("Adjust_Precision","testadjustdesc")
		.clickConfimation()
		.closeOpenedTabs()
		.ClickUserTab()
		.enterTextInput("Tenant Code")
		.clickSearchIcon()
		.clickEditIcon()
		.enterDisplayWidth("40")
		.enterMaximumLength("64")
		.clickSaveandClosebtn()
		.closeOpenedTabs()
		.clickSandbox()
		.clickCreatedSandBox()
		.verifyActiveStatus("testadjustdesc")
		.clickPublishSandbox()
		.ClickOkPublishSandbox();
		
		
	
		//soa Tests
		//startApp(prop.getProperty("browser"),prop.getProperty("baseUrlEM"));
		driver.navigate().to(prop.getProperty("baseUrlEM"));
		new LoginSoaPage()
		.enterLoginNameSoa(prop.getProperty("usernameEM"))
		.enterPswdSoa(prop.getProperty("passwordEM"))
		.clickSignInSoa()
		.expandSoa()
		.expandSoaInfra()
		.expandDefault()
		.clickOperaApprovalWorkFlow()
		.clickApprovalTaskflow()
		.clickAdministrationTab();
		FarmOIMPage farm=	new FarmOIMPage();
		String appName="worklist";
        String ohsHostName="sca00jbw.us.oracle.com";
        String httpPort="0";
        String httpsPort="443";
		if(farm.verifyURIExists(appName)){
            farm.updateOHSHost(appName, ohsHostName);
            farm.updateHttpPort(appName, httpPort);
            farm.updateHttpsPort(appName, httpsPort);
            farm.clickApplyBtn();
            farm.clickConfirmationOKBtn();
			
		}
		
			else{
				Adduri add=new Adduri();
				
			
		        add.clickAddUri();
		        add.enterAppName(appName);
		        add.enterHostName(ohsHostName);
		        add.enterhttpPort("14002");
		        add.enterhttpsPort("0");
		        add.enterURI("/app");
		        add.addURI_OKBtn();
		        
		        farm.verifyURIExists(appName);
		        farm.verifyHostName(ohsHostName);
		        farm.verifyHttps(httpPort);
		        farm.verifyHttp(httpsPort);
		        farm.clickApplyBtn();
	            farm.clickConfirmationOKBtn();
		        

	}
	
		//validation test
		//startApp(prop.getProperty("browser"),prop.getProperty("baseUrlIdentity"));
		driver.navigate().to(prop.getProperty("baseUrlIdentity"));
		new LoginIdentityPF()
		.enterLoginNameIdentity(prop.getProperty("usernameIdentity"))
		.enterPswdIdentity(prop.getProperty("passwordIdentity"))
		.clickSignInIdentity()
		.clickManageIcon()
		.clickUsers()
		.clickCreateUsersIcon()
		.enterFirstNameField("test")
		.enterLastNameField("test")
		.enterEmailField("bhagavatula.sruthi@oracle.com")
		.enterOrganizationField("Xellerate Users")
		.selectUserTypefield("Employee");
	

	}
}
