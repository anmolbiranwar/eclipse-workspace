package program1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadProgram {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Abc\\eclipse-workspace\\SureshSirs\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://183.82.103.245/nareshit/login.php");
		System.out.println(driver.getTitle());
		
		driver.findElement(By.name("txtUserName")).sendKeys("nareshit");
		driver.findElement(By.name("txtPassword")).sendKeys("nareshit");
		Thread.sleep(3000);
		driver.findElement(By.name("Submit")).click();
		System.out.println("Login completed");
		//Enter into Frame
		driver.switchTo().frame("rightMenu");
		//Click on Add button
		driver.findElement(By.xpath("//input[@value='Add']")).click();
	
		//Exit from frame
		driver.switchTo().defaultContent();
		//Enter into Frame
		driver.switchTo().frame("rightMenu");
		
		
		driver.findElement(By.name("txtEmpLastName")).sendKeys("Biranwar");
		driver.findElement(By.name("txtEmpFirstName")).sendKeys("Anmol");
		driver.findElement(By.name("txtEmpMiddleName")).sendKeys("Pruthviraj");
		driver.findElement(By.name("txtEmpNickName")).sendKeys("Anya");
		
		WebElement element=driver.findElement(By.name("photofile"));
		element.sendKeys("D:\\IMG_20191109_133848.jpg");
		
		Thread.sleep(7000);
		System.out.println("File Uploaded successfully");
		driver.findElement(By.className("savebutton")).click();
		Thread.sleep(9000);
		System.out.println("New Employee Added");
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Logout")).click();
		
		driver.close();

		
		
	}

}
