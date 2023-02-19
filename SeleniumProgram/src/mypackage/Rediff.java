package mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediff {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abc\\eclipse-workspace\\SeleniumProgram\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com/");
//		driver.findElement(By.id("email")).sendKeys("7798670864");
//		driver.findElement(By.id("pass")).sendKeys("Anmol@13398");
//		driver.findElement(By.xpath("//div[@class='_6ltg']/child::button[@name='login']")).click();
		driver.findElement(By.xpath("//p[@id='signin_info']/child::a[2]")).click();
		driver.findElement(By.xpath("//table[@class='f14']/child::tbody/tr[3]/td[3]/child::input")).sendKeys("Anmol Biranwar");
		driver.findElement(By.xpath("//table[@class='f14']/child::tbody/tr[7]/td[3]/child::input")).sendKeys("anmolbiranwar007");
		driver.findElement(By.xpath("//table[@class='f14']/child::tbody/tr[7]/td[3]/child::input[2]")).click();
		driver.findElement(By.xpath("//table[@class='f14']/child::tbody/tr[9]/td[3]/input")).sendKeys("Anmol@13398");
		
		
	}

}
