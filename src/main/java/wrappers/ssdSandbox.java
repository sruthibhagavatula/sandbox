package wrappers;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;


public class ssdSandbox extends GenericWrappers {
	
	public String browserName;
	public String dataSheetName;
	

	@BeforeSuite
	public void beforeSuite(){
		System.out.println("now control in beforesuite");
		startResult();
	}

	@BeforeTest
	public void beforeTest(){
		loadObjects();
	}
	
	@BeforeMethod
	//@Parameters({"browser","baseURL"})
	public void beforeMethod(){
		test = startTestCase(testCaseName, testDescription);
		System.out.println("content in test is" +test);
		test.assignCategory(category);
		System.out.println("content in category is" +test.assignCategory(category));
		System.out.println("next is to invoke browser :"+prop.getProperty("browser"));
		System.out.println("url===>"+prop.getProperty("baseURL"));
		startApp(prop.getProperty("browser"),prop.getProperty("baseURL"));

	}
		
	@AfterSuite
	public void afterSuite(){
		endResult();
	}

	@AfterTest
	public void afterTest(){
		unloadObjects();
	}
	
	@AfterMethod
	public void afterMethod(){
		endTestcase();
		quitBrowser();
		
	}
	
	
	
}
