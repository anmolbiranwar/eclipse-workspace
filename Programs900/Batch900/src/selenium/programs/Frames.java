package selenium.programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Frames {
	
//	driver.switchTo().frame(Index);
//	driver.switchTo().frame(Name);
//	driver.switchTo().frame(WebElement);

	public static void main(String[] args) {
		WebDriver driver = new WebCommons().launchApplicationAndGetDriver("chrome", "https://demoqa.com/frames");

		WebElement mainWindowElement = driver.findElement(By.xpath("//div[@class='main-header']"));
		
		//Switch to frame from main window
		driver.switchTo().frame("frame1");		
		
		WebElement frameElement = driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
		System.out.println(frameElement.getText());
		
		//Switch back to main window from frame	
		driver.switchTo().defaultContent();
		
		System.out.println(mainWindowElement.getText());		

	}

}
