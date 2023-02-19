package selenium.programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssLocators {
	
	//CSSSelector Locator
	//Syntax 1: tagname#id
	//Syntax 2: tagname.class
	//Syntax 3: tagname[attribute='attribuevalue']

	public static void main(String[] args) {		
		
//		1. Set the Browser Properties for Chrome
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		
//		2. Launch the Chrome Browser
		WebDriver driver = new ChromeDriver();		
		
//		3. Maximize the Browser
		driver.manage().window().maximize();
		
//		4. Enter the URL and Launch the application
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
//		5. Locate the Login Panel text using 'cssSelector' locator and store it in 'loginPanel' variable
		WebElement loginPanel = driver.findElement(By.cssSelector("div#logInPanelHeading"));
		
		if(loginPanel.isDisplayed()) {
			System.out.println("Login Panel is available");
		}else {
			System.out.println("Login Panel is not available");
		}
		
//		6. Locate the signIn button using 'cssSelector' locator and store it in 'loginButton' variable
		WebElement loginButton = driver.findElement(By.cssSelector("input.button"));		
		
//		7. Locate the username element using 'cssSelector' locator and store it in 'usernameTextbox' variable
		WebElement usernameTextbox = driver.findElement(By.cssSelector("input[name='txtUsername']"));

	}

}
