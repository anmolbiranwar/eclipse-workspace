package selenium.programs;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Alerts {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new WebCommons().launchApplicationAndGetDriver("chrome", "https://demoqa.com/alerts");
		new WebCommons().takeScreenshot("AlertsPage", driver);

	
	}

}
