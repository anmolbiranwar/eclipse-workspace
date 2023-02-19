package selenium.programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TryCatchFinally {

	public static void main(String[] args) {
		WebDriver driver = new WebCommons().launchApplicationAndGetDriver("chrome", "https://opensource-demo.orangehrmlive.com");
		
		try {
			WebElement loginPanel = driver.findElement(By.xpath("//div[@id='logInPanelHeading']"));	
			
			if(loginPanel.getText().equals("LOGIN Pane")){
				System.out.println("Header is matching");
			}else {
				System.out.println("Header is not matching");
			}
		}catch(Exception e) {
			System.out.println("Login Panel Element is not working");
//			e.printStackTrace();
		}
		
		finally {
			driver.close();
		}
	}

}
