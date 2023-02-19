package com.onlineBank.testscripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.onlineBank.lib.General;

public class TC003_RegisterEmp {
	@Test
	public void tc003() throws InterruptedException 
	{
		DOMConfigurator.configure("log4j.xml");
		General obj=new General();
		obj.openApplication();
		
		obj.login();
		
		obj.registerEmployee();
		
		obj.logout();
		
		obj.closeApplication();
		
	}

}
