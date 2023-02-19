package selenium.programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathLocators {
	
	//1. Absolute Xpath (Full Xpath) --> starts with '/' and having all tags from html to till target element
	//Example : /html/body/div[1]/div/div[3]/div[2]/div[2]/form/div[1]
	
	//2. Relative Xpath
	
	//LEVEL 1==> 
	
	//Syntax 1 : //tagname[@Attribute='AttributeValue']
	//Syntax 2 : //tagname[text()='TextValue']

	//LEVEL 2==> contains,starts-with
	
	//Syntax 1 : //tagname[contains(@Attribute,'PartialAttributeValue')]
	//Syntax 2 : //tagname[contains(text(),'PartialTextValue')]
	
	//Syntax 1 : //tagname[starts-with(@Attribute,'PartialAttributeValue')]
	//Syntax 2 : //tagname[starts-with(text(),'PartialTextValue')]
	
	//LEVEL 3==> including combnation of attributes and attribute values using 'and'
	
	//Example : //input[@type='text' and @id='txtUsername' and @name='txtUsername']
	
	//LEVEL 4: Relationships
	
	//Example: //td[text()='Aaliyah Haq']/preceding-sibling::td[@class='left' and text()='ESS']
	
	//parent
	//child
	//ancestor
	//following-sibling
	//preceding-sibling
	//following
	//preceding
	
	//Syntax : ReferenceElementXpath/relationship::TargetElementXpath(without//)

	public static void main(String[] args) {

//		1. Set the Browser Properties for Chrome
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		
//		2. Launch the Chrome Browser
		WebDriver driver = new ChromeDriver();		
		
//		3. Maximize the Browser
		driver.manage().window().maximize();
		
//		4. Enter the URL and Launch the application
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
//		5. Locate the Login Panel text using 'Absolute Xpath' locator and store it in 'loginPanel' variable
		WebElement loginPanel = driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[2]/div[2]/form/div[1]"));
		
//LEVEL 1
		
//		6. Locate the signIn button using 'Xpath' locator and store it in 'loginButton' variable
		WebElement loginButton = driver.findElement(By.xpath("//input[@type='submit']"));	
		
//		7. Locate the Login Panel text using 'Relative Xpath' locator and store it in 'loginPanel' variable
		WebElement loginPanelXpath = driver.findElement(By.xpath("//div[text()='LOGIN Panel']"));
		
//LEVEL 2
		
//		6. Locate the signIn button using 'Xpath' locator and store it in 'loginButton' variable
		WebElement loginButtonlv2 = driver.findElement(By.xpath("//input[contains(@type,'submit')]"));	
		
//		7. Locate the Login Panel text using 'Relative Xpath' locator and store it in 'loginPanel' variable
		WebElement loginPanelXpathlv2 = driver.findElement(By.xpath("//div[starts-with(text(),'LOGIN')]"));
		
//LEVEL 3		

//		6. Locate the username element using 'Xpath' locator and store it in 'usernameTextbox' variable
		WebElement usernameTextbox = driver.findElement(By.xpath("//input[@type='text' and @id='txtUsername' and @name='txtUsername']"));	

//LEVEL 4
		
		
	}

}
