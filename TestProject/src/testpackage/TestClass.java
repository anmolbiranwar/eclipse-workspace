
package testpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {
	
	//Browser Properties
    //chrome ==> webdriver.chrome.driver
    //firefox ==> webdriver.gecko.driver
    //egde ==> webdriver.edge.driver

	public static void main(String[] args) {
		
//      1. Launch the {Chrome} Browser  
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abc\\eclipse-workspace\\TestProject\\Drivers\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
//      2. Maximize the browser window
		driver.manage().window().maximize();
//      3. Enter URL & Launch the application {https://www.google.com/}
		driver.get("https://www.google.com/");
//      4. Close the Browser  
		driver.close();

	}

}
