package com.hrms.pages;

import org.testng.Reporter;

import com.hrms.utility.BaseClass;


public class VerifyPage extends BaseClass {

	//verify function-related to whole application
	public static void verifyTitle(String title)
	{
		if(driver.getTitle().equals(title))
		{
			Reporter.log("Title Matched");
		}
		else
		{
			Reporter.log("Title not matched");
		}
		
	}
}
