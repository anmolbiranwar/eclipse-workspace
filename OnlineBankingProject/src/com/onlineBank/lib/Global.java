package com.onlineBank.lib;

import org.openqa.selenium.WebDriver;

public class Global {
	//To provide TestData and Objects related to whole application
	WebDriver driver;
	//TestData
	public String url="http://183.82.103.245:8888/BankingProject/LoginForm.jsp";
	public String un="nareshit";
	public String pw="nareshit";
	
	//Objects
	public String txt_loginname="username";
	public String txt_password="password";
	public String btn_login="Submit";
	public String link_logout="Logout";
	public String link_branches="Branches";
	public String branchAdd="branchAddr";
	public String branchEmail="branchEmailId";
	public String branchP1="branchPhNo1";
	public String branchP2="branchPhNo2";
	public String branchP3="branchPhNo3";
	public String regBtn="Register";
	
	public String link_Emp="Employees";
	
	public String button_clear="Input2";
	
	
}
