package programsSelenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenshot {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Abc\\eclipse-workspace\\SeleniumNotesProgram\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		if(driver.getTitle()=="Gooogle")
		{
			System.out.println("Title Matched");
		}
		else
		{
			File f1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(f1,new File("C:\\Screenshots\\TestResults.png"));
			System.out.println("Take Screenshot");
		}
		driver.close();

	}

}
