package testngExamples;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Exp_Testng1 {

	@BeforeMethod
	public void login()
	{
		System.out.println("Login Completed");
	}
	
	@AfterMethod()
	public void logout()
	{
		System.out.println("Logout Completed");
	}
	
	@Test(priority=2)
	public void addemp()
	{
		System.out.println("Add employee");
	}
	@Test(priority=1)
	public void delemp()
	{
		System.out.println("Delete employee");
	}
	
	
	
	
}
