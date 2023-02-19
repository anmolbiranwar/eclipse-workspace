package com.onlineBank.lib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import com.onlineBank.utility.Log;

public class General extends Global {
	// To provide all reusable function/methods
	public void openApplication() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Abc\\eclipse-workspace\\OnlineBankingProject\\Drivers\\chromedriver_win32 (3)\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to(url);
		System.out.println("Application Opened");// console
		Reporter.log("Application Opened");// html report
		Log.info("Application opened");	// logfile

	}

	public void closeApplication() {
		driver.close();
		System.out.println("Application Closed");
		Reporter.log("Application Closed");
		Log.info("Application Closed");
	}

	public void login() {
		driver.findElement(By.name(txt_loginname)).sendKeys(un);
		driver.findElement(By.name(txt_password)).sendKeys(pw);
		driver.findElement(By.name(btn_login)).click();
		System.out.println("Login completed");
		Reporter.log("Login Completed");
		Log.info("Login Completed");
	}

	public void logout() {
		driver.findElement(By.linkText(link_logout));
		System.out.println("Logout completed");
		Reporter.log("Logout Completed");
		Log.info("Logout Completed");
	}

	public void registerBranch() throws InterruptedException {
		WebElement element = driver.findElement(By.linkText(link_branches));
		Actions action = new Actions(driver);
		action.moveToElement(element).moveByOffset(20, 20).click().build().perform();
		Thread.sleep(3000);
		System.out.println("Clicked on branches");
		driver.findElement(By.name(branchAdd)).sendKeys("Nagpur");
		Thread.sleep(1000);
		driver.findElement(By.name(branchEmail)).sendKeys("anmolbiranwar@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.name(branchP1)).sendKeys("7798786787");
		Thread.sleep(1000);
		driver.findElement(By.name(branchP2)).sendKeys("8974848485");
		Thread.sleep(1000);
		driver.findElement(By.name(branchP3)).sendKeys("9026546584");
		Thread.sleep(1000);
		driver.findElement(By.name(regBtn)).click();
		System.out.println("Branch Registered");
		Reporter.log("Branch Registered");
		Log.info("Branch Registered");
	}

	public void registerEmployee() throws InterruptedException {
		WebElement ele1 = driver.findElement(By.linkText(link_Emp));
		Actions action = new Actions(driver);
		action.moveToElement(ele1).moveByOffset(40, 40).click().build().perform();
		Thread.sleep(2000);
		Select ba = new Select(driver.findElement(By.name("branchaddress")));
		ba.selectByVisibleText("Hyderabad");
		Thread.sleep(2000);
		driver.findElement(By.name("accountInitialBalance")).sendKeys("80000");
		driver.findElement(By.name("firstname")).sendKeys("Anmol");
		driver.findElement(By.name("lastname")).sendKeys("Biranwar");
		driver.findElement(By.name("hno")).sendKeys("13");
		driver.findElement(By.name("street")).sendKeys("1");
		Select c = new Select(driver.findElement(By.name("city")));
		c.selectByVisibleText("Hyderabad");
		Thread.sleep(2000);
		Select s = new Select(driver.findElement(By.name("state")));
		s.selectByVisibleText("Andhra pradesh");
		Thread.sleep(2000);
		driver.findElement(By.name("pincode")).sendKeys("441614");
		driver.findElement(By.name("phoneNo")).sendKeys("7798672564");
		driver.findElement(By.name("email")).sendKeys("anmolbiranwar@gmail.com");
		driver.findElement(By.name("loginID")).sendKeys("anmol13");
		driver.findElement(By.name("password")).sendKeys("anmol13");
		Select sec = new Select(driver.findElement(By.name("secretqid")));
		sec.selectByVisibleText("Who your childhood hero?");
		driver.findElement(By.name("secretqans")).sendKeys("Sonu Sood");
		driver.findElement(By.name("Input")).click();
		
		System.out.println("Employee Registered");
		Reporter.log("Employee Registered");
		Log.info("Employee Registered");
	}

	public void clear() throws Exception 
	{
		driver.findElement(By.name(txt_loginname)).sendKeys(un);
		driver.findElement(By.name(txt_password)).sendKeys(pw);
		Thread.sleep(2000);
		driver.findElement(By.name(button_clear)).click();
		Thread.sleep(2000);
		System.out.println("Data is Cleared.");
		Reporter.log("Data is Cleared");
		Log.info("Data is Cleared");
		

	}

}
