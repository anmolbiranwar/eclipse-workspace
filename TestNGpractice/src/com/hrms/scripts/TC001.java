package com.hrms.scripts;

import com.hrms.lib.General;

public class TC001 {

	public static void main(String[] args) {
		//Test Steps
		General obj=new General();
		obj.openApplication();
		obj.login();
		obj.logout();
		obj.closeApplication();

	}

}
