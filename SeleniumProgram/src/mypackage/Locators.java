package mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
//	1. Set the Browser Properties for Chrome
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
	
//	2. Launch the Chrome Browser
		WebDriver driver= new ChromeDriver();
		
//	3.Maximize the Browser
		driver.manage().window().maximize();
		
//	4.Enter the URL and Launch the application
	driver.get("https://opensource-demo.orangehrmlive.com/");	
	
//	5. Locate the Login Panel text using 'id' locator and store it in 'loginPanel' variable
	WebElement loginPanel= driver.findElement(By.id("logInPanelHeading"));
	
//	6. Locate the username element using 'name' locator and store it in 'usernameTextbox' variable
	WebElement usernameTextbox= driver.findElement(By.name("txtUsername"));
	
//	7. Locate the sigIn button using 'className' locator and store it in 'loginButton' variable
	WebElement loginButton= driver.findElement(By.className("button"));
	
//	8. Locate the logo element using 'tagName' locator and store it in 'logo' variable
	WebElement logo= driver.findElement(By.tagName("img"));
	
//	9. Locate the forgotPassword element using 'linkText' locator and store it in 'forgotPasswordLink' variable
	WebElement forgotPasswordLink= driver.findElement(By.linkText("Forgot your password?"));
	
//	10. Locate the forgotPassword element using 'partiallinkText' locator and store it in 'forgotPasswordPartialLink' variable
	WebElement forgotPasswordPartialLink= driver.findElement(By.partialLinkText("Reset"));
	
	}

}
