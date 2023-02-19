package selenium.programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Methods {

	public static void main(String[] args) {
		

	}
	
	
	void launchTheApplication() {
//		1. Set the Browser Properties for Chrome
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		
//		2. Launch the Chrome Browser
		WebDriver driver = new ChromeDriver();		
		
//		3. Maximize the Browser
		driver.manage().window().maximize();
		
//		4. Enter the URL and Launch the application
		driver.get("https://opens ource-demo.orangehrmlive.com/");	
		
	}
	
	WebDriver launchApplicationAndGetDriver() {
//		1. Set the Browser Properties for Chrome
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		
//		2. Launch the Chrome Browser
		WebDriver driver = new ChromeDriver();		
		
//		3. Maximize the Browser
		driver.manage().window().maximize();
		
//		4. Enter the URL and Launch the application
		driver.get("https://opensource-demo.orangehrmlive.com/");	
		
		return driver;
		
	}
	
	public WebDriver launchApplicationAndGetDriver(String browsername, String url) {
		WebDriver driver = null;

		if (browsername.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browsername.equals("edge")) {
			System.setProperty("webdriver.edge.driver", System.getProperty("user.dir") + "\\Drivers\\msedgedriver.exe");
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.get(url);
		return driver;
	}

}
