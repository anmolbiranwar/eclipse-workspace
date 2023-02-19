package selenium.programs;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSEClass {

	public static void main(String[] args) {
		
//		1. Launch Chrome Browser
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
//		2. Maximize the Browser window
		driver.manage().window().maximize();
		
//		3. Launch the Application { URL = https://demoqa.com/elements }
		driver.get("https://demoqa.com/elements");
		
//		4. identify interactions menu element
		WebElement interactionsMenu = driver.findElement(By.xpath("//div[text()='Interactions']"));
		
//		Scroll down to interactionsMenu
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView()" , interactionsMenu);
		
//		5. Click on interactions menu
		interactionsMenu.click();
		
//		6. Close Browser
		driver.close();
		
	}

}
