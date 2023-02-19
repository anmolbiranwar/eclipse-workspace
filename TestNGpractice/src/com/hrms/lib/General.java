package com.hrms.lib;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class General extends Global{
//To provide all reusable function/methods
	public void openApplication()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abc\\eclipse-workspace\\TestNGpractice\\Driver\\chromedriver_win32 (3)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to(url);
		System.out.println("Application Opened");
	}
	public void closeApplication()
	{
		driver.close();
		System.out.println("Application Closed");
	}
	public void login()
	{
		driver.findElement(By.name(txt_loginname)).sendKeys(un);
		driver.findElement(By.name(txt_password)).sendKeys(pw);
		driver.findElement(By.name(btn_login)).click();
		System.out.println("Login Completed");
	}
	public void logout()
	{
		driver.findElement(By.linkText(link_logout)).click();
		System.out.println("Logout Completed");
	}

}
