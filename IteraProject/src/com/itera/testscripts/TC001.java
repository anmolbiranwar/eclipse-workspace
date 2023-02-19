package com.itera.testscripts;

import com.itera.lib.General;

public class TC001 {

	public static void main(String[] args) {

		General obj=new General();
		obj.openApplication();
		obj.checkBox();
		obj.closeApplication();
	}

}
