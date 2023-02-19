package com.hrms.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

public class BaseClass {
//driver
	public static WebDriver driver;
	//openApp
	public static void openApplication()
	{
		System.setProperty("webdriver.chrome.driver","G:\\Users\\Abc\\eclipse-workspace\\POM_hrms\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("C:\\Users\\Abc\\eclipse-workspace\\POM_hrms\\Drivers\\chromedriver.exe");
		Reporter.log("Application Opened");
		
	}
	//closeApp
	public static void closeApp()
	{
		driver.close();
		Reporter.log("Application Closed");
	}
}
