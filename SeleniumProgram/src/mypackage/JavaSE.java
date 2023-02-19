package mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaSE {

	public static void main(String[] args) {
		//Launch Chrome Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abc\\eclipse-workspace\\SeleniumProgram\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//Maximize the browser window
		driver.manage().window().maximize();
		//Launch the application
		driver.get("https://demoqa.com/elements");
//      4. identify interactions menu element
		WebElement interactionsMenu=driver.findElement(By.xpath("//div[text()='Interactions']"));
//      Scroll down to interactionsMenu
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("argtuments[0].scrollIntoView()",interactionsMenu);
//      5. Click on interactions menu
		interactionsMenu.click();
	}

}
