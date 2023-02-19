package com.flipkart.scripts;

import com.flipkart.lib.General;

public class SortFun {
	
	public static void main(String[] args) throws InterruptedException
	{
		General obj=new General();
		obj.openApplication();
		Thread.sleep(1000);
		obj.crossSign();
		Thread.sleep(1000);
		obj.searchItem();
		Thread.sleep(2000);
		obj.filter();
		Thread.sleep(3000);
//		obj.secondPage();
//		Thread.sleep(1000);
		obj.closeApplication();
	}
}
