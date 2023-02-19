package com.itera.lib;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class General extends Global {

	public void openApplication()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Abc\\eclipse-workspace\\IteraProject\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to(url);
		System.out.println("Open Itera Application");
	}
	public void closeApplication()
	{
		driver.close();
		System.out.println("Application closed");
	}
	public void checkBox()
	{
//1)Select specific check box
//2)select all check boxes
		List<WebElement>allChecks=driver.findElements(By.xpath(allCheck));
		System.out.println("Total checkboxes are "+ allChecks.size());

		//Using for loop
//		for(int i=0;i<=allChecks.size();i++)
//		{	
//		allChecks.get(i).click();
//		}
//		//Using for each loop
//		for(WebElement chk:allChecks)
//		{
//			chk.click();
//		}
//	3)Select multiple check boxex by choice
//		for(WebElement chk:allChecks)
//		{
//			String checkboxname=chk.getAttribute("id");
//			if(checkboxname.equals("monday") || checkboxname.equals("sunday"))
//			{
//				chk.click();
//			}	
//			
//		}
//4)Select last two check boxes
//Total no of check boxes - no of check boxes want to select= starting index
//7-2=5
//		int totalcheckboxes=allChecks.size();
//		for(int i=totalcheckboxes-3;i<totalcheckboxes;i++)
//		{
//			allChecks.get(i).click();
//			System.out.println(i);
//		}
//		
//5)Select first two check boxes
		int totalcheckboxes=allChecks.size();
		for(int i=0;i<totalcheckboxes;i++)
		{
			if(i<2)
			{
				allChecks.get(i).click();
			}
		}
	}
	public void radioButton()
	{
		driver.findElement(By.id(radiobtn1)).click();
		//driver.findElement(By.id(radiobtn2)).click();
		System.out.println("Radio button click");
		
	}
	
	public void dropDown()
	{
		WebElement element=driver.findElement(By.xpath("//select[@class='custom-select']"));
		Select s=new Select(element);
		s.selectByIndex(2);
		
	}
	
}
