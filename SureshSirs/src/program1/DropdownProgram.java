package program1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownProgram {

	public static void main(String[] args) throws InterruptedException {
		//Open Application
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Abc\\eclipse-workspace\\SureshSirs\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//Login Application
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		Thread.sleep(3000);
		//Maximize the window
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//Verify title of the page
		System.out.println(driver.getTitle());
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		Thread.sleep(3000);
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		Thread.sleep(3000);
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(3000);
		System.out.println("Login Completed");
		Thread.sleep(3000);
		//-----------------Enter into frame--------------------------
		driver.switchTo().frame("rightMenu");
		WebElement element=driver.findElement(By.name("loc_code"));
		Thread.sleep(3000);
		//Select Employee ID from search By dropdown
		Select s=new Select(element);
		//s.selectByVisibleText("Emp. ID");
		//s.selectByValue("0");
		s.selectByIndex(1);
		Thread.sleep(3000);
		//Enter Employee ID in search for textbox
		driver.findElement(By.name("loc_name")).sendKeys("0201");
		Thread.sleep(3000);
		//Click on Search button
		driver.findElement(By.xpath("//input[@type='button']")).click();
		Thread.sleep(3000);
		//Click on check box
		driver.findElement(By.name("chkLocID[]")).click();
		Thread.sleep(3000);
		//Click on Delete button
		driver.findElement(By.xpath("//input[@value='Delete']")).click();
		Thread.sleep(3000);
		
		//-------------Exit from frame-------------
		driver.switchTo().defaultContent();
		//Click on logout
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(3000);
		//Close Application
		driver.close();
		
		
	}

}
