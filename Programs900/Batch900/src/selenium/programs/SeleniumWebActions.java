package selenium.programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumWebActions {
	
	public void getMethod() {
		WebDriver driver = new SeleniumWebActions().launchApplicationAndGetDriver("chrome","https://google.com/");
	
	}
	
	

	public static void main(String[] args) {

		WebDriver driver = new SeleniumWebActions().launchApplicationAndGetDriver("chrome","https://google.com/");
				
//		4. Verify Application Login Page title { OrangeHRM }
		if(driver.getTitle().equals("OrangeHRM")) {
			System.out.println("Title is matching");
		}else {
			System.out.println("Title is not matching");
		}
		
//		5. Verify Login Page Header Text { Header = LOGIN Panel }
		WebElement loginPanel = driver.findElement(By.xpath("//div[@id='logInPanelHeading']"));
		if(loginPanel.getText().equals("LOGIN Panel")){
			System.out.println("Header is matching");
		}else {
			System.out.println("Header is not matching");
		}
		
//		Verify Logo of the application
		WebElement logo = driver.findElement(By.xpath("//img[contains(@src,'logo.png')]"));
		if(logo.isDisplayed()){
			System.out.println("Logo is displayed");
		}else {
			System.out.println("Logo is not displayed");
		}
		
//		6. Verify Username and Password text boxes
		WebElement username = driver.findElement(By.xpath("//input[@name='txtUsername']"));
		WebElement password = driver.findElement(By.xpath("//input[@name='txtPassword']"));
		
		if(username.isDisplayed() && username.isEnabled() && password.isDisplayed() && password.isEnabled()) {
			System.out.println("Elements are available and enabled");
		}else {
			System.out.println("Elements are neigther available ao not enabled");
		}
		
//		7. Enter Username and Password {admin , admin123 }
		username.clear();
		password.clear();
		
		username.sendKeys("admin");
		password.sendKeys("admin123");
		
//		8. Click on Sign-In Button		
		WebElement loginButton = driver.findElement(By.xpath("//input[@name='Submit']"));
		if(loginButton.getAttribute("value").equals("LOGIN")) {
			System.out.println("LOGIN Label is matching");
		}else {
			System.out.println("LOGIN Label is not matching");
		}
		
		loginButton.click();
		
//		9. Click on Admin Menu Button
		WebElement admin = driver.findElement(By.xpath("//b[text()='Admin']"));
		admin.click();
		
//		10. Select option from User Role Dropdown { ESS }
		WebElement userrole = driver.findElement(By.xpath("//select[@id='searchSystemUser_userType']"));
		Select s = new Select(userrole);
		s.selectByVisibleText("ESS");
		
//		11. Select All Users Checkbox
		WebElement allUsers = driver.findElement(By.xpath("//input[@id='ohrmList_chkSelectAll']"));
		if(!allUsers.isSelected())
			allUsers.click();
		
//		12. Navigate to Workshifts Url { URL = https://opensource-demo.orangehrmlive.com/index.php/admin/workShift }
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/admin/workShift");
		
//		13. Click on 'Add' shift button
		WebElement addShift = driver.findElement(By.xpath("//input[@name='btnAdd']"));
		addShift.click();
		
//		14. Select Multiple Employees from Avalable Employees Multi Select Dropdown
		WebElement shiftDropdown = driver.findElement(By.xpath("//select[@id='workShift_availableEmp']"));
		Select sel = new Select(shiftDropdown);
		if(sel.isMultiple()) {
			sel.selectByIndex(0);
			sel.selectByValue("3");
			sel.selectByVisibleText("Kallyani Bhute");
			
			sel.deselectByIndex(0);
			sel.deselectByValue("3");
			sel.deselectByVisibleText("Kallyani Bhute");			
		}		
		
//		15. Click on My Info Men Button
		WebElement myInfo = driver.findElement(By.xpath("//b[text()='My Info']"));
		myInfo.click();
		
//		16. Click on 'Edit' Personal Details Button
		WebElement editButton = driver.findElement(By.xpath("//input[@id='btnSave']"));
		editButton.click();
		
//		17. Select gender as 'Female'
		WebElement femaleOption = driver.findElement(By.xpath("//label[@for='personal_optGender_2']"));
		femaleOption.click();
		
//		18. Navigate to Google Page { URL = https://google.com/ }
		driver.navigate().to("https://google.com/");
		
//		19. Verify Google 'Images' Link
		WebElement imagesLink = driver.findElement(By.xpath("//a[text()='Images']"));
		
		if(imagesLink.getAttribute("href").equals("https://www.google.co.in/imghp?hl=en&ogbl")) {
			System.out.println("Correct Link added");
		}else {
			System.out.println("Wrong Link updated");
		}
		
//		20. Close Bowser
		driver.close();
	}
	
	public WebDriver launchApplicationAndGetDriver(String browsername, String url) {
		WebDriver driver = null;

		if (browsername.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "G:\\Users\\Abc\\eclipse-workspace\\Programs900\\Batch900\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browsername.equals("edge")) {
			System.setProperty("webdriver.edge.driver", System.getProperty("user.dir") + "\\Drivers\\msedgedriver.exe");
			driver = new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.get(url);
		return driver;
	}

}
