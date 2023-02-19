package programsSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicProgram {

	public static void main(String[] args) throws InterruptedException {
		//Setting the path of the chrome driver executable
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Abc\\eclipse-workspace\\SeleniumNotesProgram\\Driver\\chromedriver.exe");
		//Launch the chrome browser
		WebDriver driver=new ChromeDriver();
		//Enter the URL
		 driver.get("http://www.google.com");
		//Get the title
		 String title=driver.getTitle();
		 System.out.println("The title of the page is: "+title);
		 //Get the url of the current page
		 String CurrentUrl=driver.getCurrentUrl();
		 System.out.println("The url of the page is :"+CurrentUrl);
		 //Ge the source code of the page
		 String pageSource=driver.getPageSource();
		 System.out.println("The source code of the page is :"+pageSource);
		 //Halt the program execution for 2 seconds
		 Thread.sleep(2000);
		 //Close the Browser
		 driver.close();
		 

	}

}
