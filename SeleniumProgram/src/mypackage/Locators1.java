package mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Locators1 {

	public static void main(String[] args) {
//	 Set the Browser properties for chrome
		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Abc\\eclipse-workspace\\SeleniumProgram\\Drivers\\chromedriver.exe");
		
//	 Launch the chrome browser
		WebDriver driver = new ChromeDriver();
		
//	 Maximize the browser
		driver.manage().window().maximize();
		
//	 Enter the URL and launch the browser
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.id("welcome")).click();
		
		driver.findElement(By.linkText("Logout")).click();
		

		
		
	}

}
