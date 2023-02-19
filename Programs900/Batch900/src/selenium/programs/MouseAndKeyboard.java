package selenium.programs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAndKeyboard {

	public static void main(String[] args) {
		
//		1. Launch Chrome Browser
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
//		2. Maximize the Browser window
		driver.manage().window().maximize();
		
//		3. Launch the Application { URL = https://demoqa.com/buttons }
		driver.get("https://demoqa.com/buttons");
		
//		4. Naviagate to droppable url
		driver.navigate().to("https://demoqa.com/droppable");
		
//		5. Navigate back to previous url
		driver.navigate().back();
		
//		6. Identify Elements
		WebElement doubleClick = driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
		WebElement rightClick = driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
		WebElement clickMe = driver.findElement(By.xpath("//button[text()='Click Me']"));
		
//		7. Perform double click actions on element
		Actions action = new Actions(driver);
		action.doubleClick(doubleClick).build().perform();
		
//		8. Perform right click actions on element
		action.contextClick(rightClick).build().perform();
		
//		9. Perform mousehover actions on element
		action.moveToElement(clickMe).build().perform();

//		10. Navigate to next url
		driver.navigate().forward();
		
//		11. Identify Elements
		WebElement source = driver.findElement(By.xpath("//div[text()='Drag me']"));	
		WebElement target = driver.findElement(By.xpath("//div[text()='Drag me']/following-sibling::div[@id='droppable' ]/child::p[text()='Drop here']"));	
		
		action.dragAndDrop(source, target).build().perform();
		
//		12. Close Browser
		driver.close();			
		
	}

}
