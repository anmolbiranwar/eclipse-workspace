package selenium.programs;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentTest;

public class Locators extends Reports{

	public static void main(String[] args) throws IOException {
		
		Reports.SetupReport();
		Reports.startReporting("Verify Locators of OrangeHRM");		
		ExtentTest log = Reports.getLogger();
		
		
//		1. Set the Browser Properties for Chrome
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		
//		2. Launch the Chrome Browser
		WebDriver driver = new ChromeDriver();	
		log.pass("New Chrome Browser is Launched");
				
//		3. Maximize the Browser
		driver.manage().window().maximize();
		log.info("Browser window Maximized");
		
//		4. Enter the URL and Launch the application
		driver.get("https://opensource-demo.orangehrmlive.com/");
		log.warning("Application Launched");
		
//		5. Locate the Login Panel text using 'id' locator and store it in 'loginPanel' variable
		WebElement loginPanel = driver.findElement(By.id("logInPanelHeading"));
		log.fail("Application Login Panel Header is not working");
//		log.addScreenCaptureFromPath(WebCommons.takeScreenshot("LoginPage", driver));
		
		Reports.stopReporting();

	}

}
