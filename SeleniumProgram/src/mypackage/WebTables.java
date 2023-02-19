package mypackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTables {

        public static void main(String[] args) {
                System.setProperty("webdriver.chrome.driver","C:\\Users\\Abc\\eclipse-workspace\\SeleniumProgram\\Drivers\\chromedriver.exe");
                WebDriver driver = new ChromeDriver();
                driver.manage().window().maximize();
                driver.get("https://opensource-demo.orangehrmlive.com&quot;");
                WebElement username = driver.findElement(By.xpath("//input[@name='txtUsername']"));
                WebElement password = driver.findElement(By.xpath("//input[@name='txtPassword']"));
                username.sendKeys("admin");
                password.sendKeys("admin123");
                WebElement loginButton = driver.findElement(By.xpath("//input[@name='Submit']"));        
                loginButton.click();
                WebElement admin = driver.findElement(By.xpath("//b[text()='Admin']"));
                admin.click();        
               
                //Verify total number of rows
                List<WebElement> rows = driver.findElements(By.xpath("//tr[@class]"));
                System.out.println("Total Rows : "+ rows.size());
               
                //Verify total number of columns
                List<WebElement> columns = driver.findElements(By.xpath("//th[@rowspan='1']"));
                System.out.println("Total Columns : "+ columns.size());
               
                //Verify column headers
                for(int i=0; i<columns.size() ;i++) {
                        System.out.println(columns.get(i).getText());
                }
               
                //Verify data
                for(int row=1; row <=rows.size() ;row++ ) {
                        for(int column =1 ; column<=columns.size() ; column++) {
                                WebElement element = driver.findElement(By.xpath(new WebTables().getLocatorText(row, column)));
                                System.out.println(element.getText());
                        }
                }
               
                driver.close();

        }
       
        public String getLocatorText(int row, int column) {
                String locator = "//tbody/child::tr["+row+"]/child::td["+column+"]";
                return locator;                
        }
       

}