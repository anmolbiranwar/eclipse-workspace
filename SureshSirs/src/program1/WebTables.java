package program1;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTables {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Abc\\eclipse-workspace\\SureshSirs\\Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("C:\\Users\\Abc\\eclipse-workspace\\SureshSirs\\Drivers\\chromedriver.exe");
		

	}

}
