package mypackage;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FileUpload {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new WebCommons().launchApplicationAndGetDriver("chrome","https://demoqa.com/upload-download");
		WebElement upload=driver.findElement(By.xpath("//label[@for='uploadFile']"));
		new WebCommons().Click(driver, upload);
		Thread.sleep(5000);
		Runtime.getRuntime().exec("C:\\Users\\Abc\\Desktop\\AutoIt\\FileUpload.exe");
		

	}

}
