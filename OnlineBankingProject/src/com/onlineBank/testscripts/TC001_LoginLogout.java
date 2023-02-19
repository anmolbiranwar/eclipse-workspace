package com.onlineBank.testscripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.onlineBank.lib.General;

public class TC001_LoginLogout {
	@Test
public void tc001()
{
		DOMConfigurator.configure("log4j.xml");
	General obj=new General();
	obj.openApplication();
	obj.login();
	obj.logout();	
	obj.closeApplication();
}
	

}
