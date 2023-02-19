package selenium.programs;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MultipleWindows {

	public static void main(String[] args) {
		WebDriver driver = new WebCommons().launchApplicationAndGetDriver("chrome",
				"https://demoqa.com/browser-windows");
		System.out.println(driver.getWindowHandle());

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
