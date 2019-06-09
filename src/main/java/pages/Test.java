package pages;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Test {

	public static void main(String args[]){
		try {
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			System.out.println("driverpath given");
			WebDriver driver = new ChromeDriver();
			System.out.println("driver object invoked");
			driver.get("http://www.google.com");
			System.out.println("url invoked");
			Thread.sleep(5000);
			driver.manage().window().maximize();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
