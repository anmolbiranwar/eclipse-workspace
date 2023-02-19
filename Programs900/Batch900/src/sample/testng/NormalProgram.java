package sample.testng;

public class NormalProgram {
	
	public void generateReport() {
		System.out.println("Generate Empty Report");
	}
	
	public void startReport() {
		System.out.println("Start Reporting");
	}
	
	public void launchTheBrowser() {
		System.out.println("Launch The Browser");
	}
	
	public void closeTheBrowser() {
		System.out.println("Close The Browser");
	}
	
	public void stopReportPrinting() {
		System.out.println("Stop Reporting");
	}
	
	public void TestCase1() {
		System.out.println("Test Case 1 Executed");
	}
	
	public void TestCase2(String username , String Password , String role) {
		System.out.println("Test Case 2 Executed with "+username+"  "+Password+"  "+role);
	}

	public static void main(String[] args) {
		NormalProgram cls = new NormalProgram();
		cls.generateReport();
		
		cls.startReport();
		cls.launchTheBrowser();
		cls.TestCase1();
		cls.closeTheBrowser();
		cls.stopReportPrinting();
		
		cls.startReport();
		cls.launchTheBrowser();
		cls.TestCase2("ABC","123","QA");
		cls.closeTheBrowser();
		cls.stopReportPrinting();
		
		cls.startReport();
		cls.launchTheBrowser();
		cls.TestCase2("XYZ","234","Dev");
		cls.closeTheBrowser();
		cls.stopReportPrinting();
	}

}
