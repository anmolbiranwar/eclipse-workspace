package testngExamples;

import java.io.FileInputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;

public class Exp_Wd_Testng {
	WebDriver driver;
	@BeforeClass
	public void startUp()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Abc\\eclipse-workspace\\TestNG6pm\\Driver\\chromedriver.exe");
	driver=new ChromeDriver();
		
	}
	@AfterClass
	public void tearDown()
	{
		driver.close();	
	}
	@Test
	public void TC001() throws Exception
	{
		//Read Data--Excel
		FileInputStream file=new FileInputStream("C:\\Users\\Abc\\Downloads\\userpass.xls");
		Workbook wb=Workbook.getWorkbook(file);
		Sheet st=wb.getSheet(0);
		String username=st.getCell(0,1).getContents();
		String password=st.getCell(1,1).getContents();
		driver.navigate().to("http://183.82.103.245/nareshit/login.php");
		System.out.println("Application Opened");//java--console
		Reporter.log("Application opened");//TestNG--html
		Reporter.log(driver.getTitle());
		driver.findElement(By.name("txtUserName")).sendKeys(username);
		driver.findElement(By.name("txtPassword")).sendKeys(password);
		driver.findElement(By.name("Submit")).click();
		Thread.sleep(3000);
		Reporter.log("Login Completed");
		driver.findElement(By.linkText("Logout")).click();
		Reporter.log("Logout Completed");
	}
	
}
