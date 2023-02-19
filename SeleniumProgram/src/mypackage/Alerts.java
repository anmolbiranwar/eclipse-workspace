package mypackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

        public static void main(String[] args) throws InterruptedException {
        	System.setProperty("webdriver.chrome.driver","C:\\Users\\Abc\\eclipse-workspace\\SeleniumProgram\\Drivers\\Drivers\\chromedriver.exe");
        	WebDriver driver=new ChromeDriver();
        	driver.get("https://demoqa.com/alerts&quot");
              //  WebDriver driver = new WebCommons().launchApplicationAndGetDriver("chrome", "https://demoqa.com/alerts&quot;);

                WebElement infoAlert = driver.findElement(By.xpath("//button[@id='alertButton']"));
                WebElement confirmAlert = driver.findElement(By.xpath("//button[@id='confirmButton']"));
                WebElement alertWithDialog = driver.findElement(By.xpath("//button[@id='promtButton']"));

                // get the information alert
                new WebCommons().Click(driver, infoAlert);

                // Switch to alert from main window
                Alert alert = driver.switchTo().alert();

                // Print the Alert Text
                System.out.println(alert.getText());

                // Click on OK Button
                alert.accept();

                // get the confirmation alert
                new WebCommons().Click(driver, confirmAlert);

                // Print the Alert Text
                System.out.println(alert.getText());

                // Click on CANCEL Button
                alert.dismiss();

                // get the alert with dialogue box
                new WebCommons().Click(driver, alertWithDialog);
               
                //Wait for 5 sec
                Thread.sleep(5);

                // Print the Alert Text
                System.out.println(alert.getText());
               
                // Enter the Alert Text
                alert.sendKeys("SELENIUM");

                // Click on OK Button
                alert.accept();

        }

}
