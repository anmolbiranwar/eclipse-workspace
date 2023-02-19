package mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class parcticeForm {

	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Abc\\eclipse-workspace\\SeleniumProgram\\Drivers\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/automation-practice-form");
//		Entering First Name
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Anmol");
//		Entering Last Name
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Biranwar");
//		Enter Email ID
		driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("anmolbiranwar007@gmail.com");
//		Select Gender
		driver.findElement(By.xpath("//label[@class='custom-control-label']")).click();
//		Enter Mobile Number
		driver.findElement(By.xpath("//input[@id='userNumber']")).sendKeys("7798670864");
//		Select DOB
		driver.findElement(By.xpath("//input[@id='dateOfBirthInput']")).click();
		driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']")).click();
		driver.findElement(By.xpath("//option[@value='1998']")).click();
		driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']")).click();
		driver.findElement(By.xpath("//option[@value='2']")).click();
		driver.findElement(By.xpath("//div[@class='react-datepicker__week']/following::div/div[6]")).click();
//		====== Select Subject========
//		WebElement subject=driver.findElement(By.xpath("//div[@id='subjectsContainer']/child::div/child::div"));
//		subject.click();
//		subject.sendKeys("com");
//		========Selects Hobbies=======
		driver.findElement(By.xpath("//input[@id='hobbies-checkbox-1']")).click();
		driver.findElement(By.xpath("//input[@id='hobbies-checkbox-2']")).click();
		driver.findElement(By.xpath("//input[@id='hobbies-checkbox-3']")).click();

//		WebElement c=driver.findElement(By.xpath("//label[@for='hobbies-checkbox-1']"));
//		if(!c.isSelected()) 
//	        c.click();
//		
//		String typedText = driver.findElement(By.xpath("//label[@for='hobbies-checkbox-1']")).getAttribute("value"));
		
//		WebElement text=driver.findElement(By.xpath("//div[@id='subjectsContainer']/child::div/child::div"));
//		
//		text.sendKeys("Anmol");
//		text.clear();
//		driver.findElement(By.xpath("//label[@for='hobbies-checkbox-1']")).getAttribute("value");
		
		
//		driver.findElement(By.xpath("//div[@id='subjectsContainer']/child::div/child::div")).clear();
//		driver.findElement(By.xpath("//div[@id='subjectsContainer']/child::div/child::div")).sendKeys("I'm Anmol Biranwar from Gondia, Maharashtra.");
//		Enter Address
		driver.findElement(By.xpath("//textarea[@id='currentAddress']")).sendKeys("Gondia, Maharashtra");
		
//		Select State
//		Select state=new Select(driver.findElement(By.xpath("//div[@class=' css-1wa3eu0-placeholder']")));
//		state.selectByVisibleText("NCR");

	}

}
