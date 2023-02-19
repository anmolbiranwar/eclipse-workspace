package com.hrms.pages;

import org.openqa.selenium.By;
import org.testng.Reporter;

import com.hrms.utility.BaseClass;

public class LoginPage extends BaseClass {

	//obj
	static By txt_login =By.name("txtUsername");
	static By txt_password=By.name("txtPassword");
	static By btn_login=By.name("Submit");
	//function
	public static void login(String un, String pw)
	{
		driver.findElement(txt_login).sendKeys(un);
		driver.findElement(txt_password).sendKeys(pw);
		driver.findElement(btn_login).click();
		Reporter.log("Login Completed");
	}
}
