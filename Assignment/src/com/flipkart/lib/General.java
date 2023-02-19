package com.flipkart.lib;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

public class General extends Global{
	//To provide all reusable functions/methods
	public void openApplication()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Abc\\eclipse-workspace\\Assignment\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to(url);
		
		System.out.println("Application Opened");
	}
	
	public void closeApplication()
	{
		driver.close();
		System.out.println("Application Closed");
	}
	public void crossSign()
	{
		driver.findElement(By.xpath(cross_Sign)).click();
		System.out.println("Clicked on Cross Sign");
	}
	
	public void searchItem()
	{
		driver.findElement(By.xpath(txt_SearchBox)).sendKeys(search);
		driver.findElement(By.className(search_Btn)).click();
		System.out.println("Item Searched");	
	}
	public void filter()
	{
		driver.findElement(By.xpath(lowToHigh)).click();
		System.out.println("Item filtered low to high price");
	}
//	public void secondPage()
//	{
//		driver.findElement(By.xpath(secPage)).click();
//	}

}
