package elementsPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abc\\eclipse-workspace\\Elements\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/elements");
		driver.findElement(By.xpath("//span[text()='Text Box']")).click();
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("Anmol Pruthviraj Biranwar");
		driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("anmolbiranwar007@gmail.com");
		driver.findElement(By.xpath("//textarea[@id='currentAddress']")).sendKeys("Gondia, Maharashtra");
		driver.findElement(By.xpath("//textarea[@id='permanentAddress']")).sendKeys("Gondia, Maharashtra");
		//driver.findElement(By.xpath("//button[text()='Submit']")).click();
		driver.navigate().to("https://demoqa.com/elements");
		driver.findElement(By.xpath("//span[text()='Check Box']")).click();
		

	}

}
