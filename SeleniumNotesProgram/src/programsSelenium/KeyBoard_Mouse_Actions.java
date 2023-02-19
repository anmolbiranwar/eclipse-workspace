package programsSelenium;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

public class KeyBoard_Mouse_Actions {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Abc\\eclipse-workspace\\SeleniumNotesProgram\\Driver\\chromedriver.exe");
		//Launch Browser
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//Enter the URL
		//driver.get("https://demoqa.com/buttons");
		driver.navigate().to("https://demoqa.com/droppable");
		
		Actions action=new Actions(driver);
//		WebElement RightClick=driver.findElement(By.id("rightClickBtn"));
//		action.contextClick(RightClick).build().perform();
//		Thread.sleep(2000);
//		WebElement DoubleClick=driver.findElement(By.id("doubleClickBtn"));
//		action.doubleClick(DoubleClick).build().perform();
//		Thread.sleep(2000);
//		//action.moveToElement(clickMe).build().perform();
//	
//		WebElement mouseMove= driver.findElement(By.xpath("//button[text()='Click Me']"));
//		action.moveToElement(mouseMove);
//		action.click().build().perform();
//		Thread.sleep(2000);
//		driver.navigate().forward();
//		Thread.sleep(1000);
		WebElement source=driver.findElement(By.id("draggable"));
		WebElement destination=driver.findElement(By.id("droppable"));
		
		action.dragAndDrop(source, destination).build().perform();
		
		Thread.sleep(2000);
		driver.close();
		
		
	}

}
