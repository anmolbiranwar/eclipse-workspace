package selenium.programs;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Reports {
	
	public static ExtentReports extent = null; // for report
	public static ExtentTest logger = null;  // for printing inside report
	
	
	//Method to generate Empty Html Report
	public static void SetupReport() {
		ExtentHtmlReporter htmlReport  = new ExtentHtmlReporter("C://Training//SeleniumTraining//Batch900//Reports//AutomaionReport.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReport);
	}
	
	//Method to start printing process 
	public static void startReporting(String testcasename) {
		logger = extent.createTest(testcasename);
	}

	//Method to Stop printing process 
	public static void stopReporting() {
		extent.flush();
	}
	
	public static ExtentTest getLogger() {
		return logger;		
	}
}
