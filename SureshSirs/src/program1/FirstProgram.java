package program1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstProgram {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Abc\\eclipse-workspace\\SureshSirs\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		//driver.get("http://183.82.103.245/nareshit/login.php");
		driver.manage().window().maximize();
		
		if(driver.getTitle().equals("OrangeHRM - New Level of HR Management"))
		{
			System.out.println("Title Matched");
		}else {
			System.out.println("Title Not Matched");
		}
		
		WebElement link=driver.findElement(By.linkText("OrangeHRM"));
		
		WebElement username=driver.findElement(By.xpath("//input[@name='txtUserName']"));
		username.sendKeys("nareshit");
		WebElement password=driver.findElement(By.xpath("//input[@name='txtPassword']"));
		password.sendKeys("nareshit");
		Thread.sleep(3000);
		WebElement submit=driver.findElement(By.xpath("//input[@name='Submit']"));
		submit.click();
		
		if(driver.getTitle().equals("OrangeHRM")) {
			System.out.println("Title Matched");
		}else {
			System.out.println("Title not matched");
		}
		
	/*	WebElement logout=driver.findElement(By.linkText("Logout"));
		logout.click();
		Thread.sleep(3000);
		driver.close();
		*/		
		
	}

}
