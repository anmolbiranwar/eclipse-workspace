package selenium.programs;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitCommands {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new WebCommons().launchApplicationAndGetDriver("chrome",
				"https://demoqa.com/browser-windows");
		System.out.println(driver.getWindowHandle());
		
		//Java Wait -time in milli seconds
//		Thread.sleep(10000);
		
		//Selenium Waits - Implicit Wait
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Explicit Wait
//		WebDriverWait wait = new WebDriverWait(driver, 60);
//		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//button[@id='windowButton']"), 0));
		
		//Fluent Wait
		@SuppressWarnings("deprecation")
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(30, TimeUnit.SECONDS)
				.pollingEvery(5,TimeUnit.SECONDS);
		wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//button[@id='windowButton']"), 0));

		WebElement mainWindowElement = driver.findElement(By.xpath("//div[@class='main-header']"));
		WebElement Button = driver.findElement(By.xpath("//button[@id='windowButton']"));
		new WebCommons().Click(driver, Button);

		List<String> windows = new ArrayList<String>(driver.getWindowHandles());
		System.out.println(windows);

		// Switch to new window from main window
		for (int i = 1; i < windows.size(); i++) {
			driver.switchTo().window(windows.get(i));
			WebElement newWindowElement = driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
			System.out.println(newWindowElement.getText());
			driver.close();
		}

		// Switch to main window
		driver.switchTo().window(windows.get(0));
		System.out.println(mainWindowElement.getText());

		// Close browser
		driver.quit();
	}

}
