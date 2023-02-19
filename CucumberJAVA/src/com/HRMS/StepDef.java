package com.HRMS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef {
	public WebDriver driver;
	@Given("^Open Application$")
	public void openApplication()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Abc\\eclipse-workspace\\CucumberJAVA\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		System.out.println("Application Opened");
	}
	
	@When("^Verify Title$")
	public void verifyTitle()
	{
		System.out.println("Verifying the Title");
	}
	
	@Then("^Close application$")
	public void closeApplication()
	{
		driver.quit();
	}

}
