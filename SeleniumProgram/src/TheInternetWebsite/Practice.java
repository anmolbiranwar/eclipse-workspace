package TheInternetWebsite;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Abc\\eclipse-workspace\\SeleniumProgram\\Drivers\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to("https://the-internet.herokuapp.com/");
		Thread.sleep(2000);
//		driver.findElement(By.linkText("Add/Remove Elements")).click();
//		Thread.sleep(2000);
//		
//		driver.findElement(By.xpath("//button[@onclick='addElement()']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[@onclick='deleteElement()']")).click();
//		
//		Thread.sleep(2000);
//		driver.navigate().back();
//		Thread.sleep(2000);
//	//	driver.findElement(By.linkText("Basic Auth")).click();
//		
//		driver.findElement(By.linkText("Checkboxes")).click();
//		WebElement element=driver.findElement(By.xpath("//form//input[1]"));
//		if(!element.isSelected())
//	        element.click();
//		Thread.sleep(3000);
//		WebElement element1=driver.findElement(By.xpath("//form//input[2]"));
//		if(!element1.isSelected())
//			element1.click();
//		
//		driver.navigate().back();
//		
//		Thread.sleep(3000);
//		
//		driver.findElement(By.linkText("Dropdown")).click();
//		WebElement opt=driver.findElement(By.id("dropdown"));
//		Select s=new Select(opt);
//		s.selectByVisibleText("Option 1");
//		Thread.sleep(2000);
//	
//		driver.navigate().back();
		driver.findElement(By.linkText("File Upload")).click();
		WebElement upload1=driver.findElement(By.id("file-upload"));
		upload1.sendKeys("D:\\image\\1.jpg");
		driver.findElement(By.id("file-submit")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().back();
		
	}

}
