package selenium.programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class Assertions {
	
//	Assert.assertEquals(false, false);
//	Assert.assertNotEquals(args, args);
//	Assert.assertNull(args);
//	Assert.assertNotNull(args);
//	Assert.assertTrue(false);
//	Assert.assertFalse(false);
//	Assert.fail();

	public static void main(String[] args) {
		WebDriver driver = new WebCommons().launchApplicationAndGetDriver("chrome", "https://opensource-demo.orangehrmlive.com/");
		SoftAssert softAssert = new SoftAssert();
		
//		Verify Application Login Page title { OrangeHRM }
		softAssert.assertEquals(driver.getTitle(), "ManagoHRM");	
		
//		Verify Login Page Header Text { Header = LOGIN Panel }
		WebElement loginPanel = driver.findElement(By.xpath("//div[@id='logInPanelHeading']"));
		softAssert.assertEquals(loginPanel.getText(), "LOGIN Pane");	

		driver.close();
		softAssert.assertAll();
		
	}

}
