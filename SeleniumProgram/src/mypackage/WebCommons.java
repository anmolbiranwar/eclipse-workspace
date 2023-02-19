package mypackage;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebCommons {
	
		public WebDriver launchApplicationAndGetDriver(String browsername, String url) {
			WebDriver driver=null;
		
		
			if(browsername.equals("chrome")){
				System.setProperty("webdriver.chrome.driver","C:\\Users\\Abc\\eclipse-workspace\\SeleniumProgram\\Drivers\\chromedriver.exe");
				driver=new ChromeDriver();
			}else if(browsername.equals("edge")) {
				System.setProperty("webdriver.edge.driver","C:\\Users\\Abc\\eclipse-workspace\\SeleniumProgram\\Drivers\\msedgedriver.exe");
				driver=new EdgeDriver();
			}else if(browsername.equals("firefox")) {
				System.setProperty("webdriver.gecko.driver","C:\\Users\\Abc\\eclipse-workspace\\SeleniumProgram\\Drivers\\geckodriver.exe");
				driver=new FirefoxDriver();
			}
			driver.manage().window().maximize();
			driver.get(url);
			return driver;
		}
	
		public void Click(WebDriver driver, WebElement element) {
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].scrollIntoView()", element);
			element.click();
		}
		
		public void EnterText(WebDriver driver, WebElement element, String value) {
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].scrollIntoView()",element);
			element.clear();
			element.sendKeys(value);
		}

	}


