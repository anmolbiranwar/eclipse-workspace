package com.hrms.lib;

import org.openqa.selenium.WebDriver;

public class Global {
WebDriver driver;
//To provide TestData and Objects related to whole application
	//Test Data
	public String url="http://183.82.103.245/nareshit/login.php";
	public String un="nareshit";
	public String pw="nareshit";
	
	//Objects
	public String txt_loginname="txtUserName";
	public String txt_password="txtPassword";
	public String btn_login="Submit";
	public String link_logout="Logout";
	
}
