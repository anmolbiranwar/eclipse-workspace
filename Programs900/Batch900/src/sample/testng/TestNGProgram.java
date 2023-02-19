package sample.testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNGProgram {
	
	@BeforeSuite
	public void generateReport() {
		System.out.println("Generate Empty Report");
	}
	
	
	public void startReport() {
		System.out.println("Start Reporting");
	}
	
	@BeforeMethod
	public void launchTheBrowser() {
		System.out.println("Launch The Browser");
	}
	
	@AfterMethod
	public void closeTheBrowser() {
		System.out.println("Close The Browser");
	}
	
	public void stopReportPrinting() {
		System.out.println("Stop Reporting");
	}
	
	@Test
	public void TestCase1() {
		startReport();
		System.out.println("Test Case 1 Executed");
		stopReportPrinting();
	}
	
	@Test
	public void TestCase2(String username , String Password , String role) {
		System.out.println("Test Case 2 Executed with "+username+"  "+Password+"  "+role);
	}

}
