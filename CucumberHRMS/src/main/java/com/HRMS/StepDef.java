package com.HRMS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef {
	public WebDriver driver;
	@Given("^Open Application$")
	public void openbrowser()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Abc\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		System.out.println("Application Opened");	
	}
	@When("^Verify Title$")
	public void verifyTitle()
	{
		System.out.println("Verifying the Title");
	}
	@Then("^Close Application$")
	public void closeBrowser()
	{
		driver.quit();
		System.out.println("Login page should be shown");
	}

}
