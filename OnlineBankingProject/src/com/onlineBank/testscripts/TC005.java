package com.onlineBank.testscripts;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.onlineBank.lib.General;

public class TC005 {
	@Test
	public void tc005() throws Exception
	{
		DOMConfigurator.configure("log4j.xml");
		General obj=new General();
		obj.openApplication();
		obj.clear();
		obj.closeApplication();
	}

}
