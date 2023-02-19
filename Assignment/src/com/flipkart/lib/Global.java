package com.flipkart.lib;

import org.openqa.selenium.WebDriver;

public class Global {
	WebDriver driver;
	//To provide TestData and Objects related to whole application
	//Test Data
	public String url="https://www.flipkart.com/";
	public String search="Shoes";
	
	//Objects
	public String txt_SearchBox="//input[@name ='q' and @type='text']";
	public String cross_Sign="//button[@class='_2KpZ6l _2doB4z']";
	public String search_Btn="L0Z3Pu";
	public String lowToHigh="//*[text()='Price -- Low to High']";
//	public String secPage="//a[@class='ge-49M _2Kfbh8']";

	

}
