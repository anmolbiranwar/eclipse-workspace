package selenium.programs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTables1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Training\\SeleniumTraining\\Batch900\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com");
		WebElement username = driver.findElement(By.xpath("//input[@name='txtUsername']"));
		WebElement password = driver.findElement(By.xpath("//input[@name='txtPassword']"));
		username.sendKeys("admin");
		password.sendKeys("admin123");
		WebElement loginButton = driver.findElement(By.xpath("//input[@name='Submit']"));
		loginButton.click();
		WebElement admin = driver.findElement(By.xpath("//b[text()='Admin']"));
		admin.click();

		// number of rows
		List<WebElement> rows = driver.findElements(By.xpath("//tr[@class]"));
		System.out.println("Total rows :" + rows.size());
		// column
		List<WebElement> columns = driver.findElements(By.xpath("//th[@rowspan='1']"));
		System.out.println("Total columns :" + columns.size());
		// header nd for Text
		for (int i = 0; i < columns.size(); i++) {
			System.out.println(columns.get(i).getText());
			// for getting data
			for (int row = 1; row <= rows.size(); row++) {
				for (int column = 1; column <= columns.size(); column++) {
					WebElement element = driver.findElement(By.xpath("//tbody/child::tr[" + row + "]/child::td[" + column + "]"));
					System.out.println(element.getText());

				}
			}
		}
		driver.close();
	}

}
