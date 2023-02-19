package javaPrac;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Abc\\eclipse-workspace\\JavaPractice\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		
//		System.setProperty("webdriver.chrome.driver","");
//		WebDriver driver=new ChromeDriver();
//		driver.get("");
//		driver.getTitle();
//		driver.getCurrentUrl();
//		driver.getPageSource();
//		.isDisplayed();
//		.isEnabled();
//		.isSelected();
	}

}
