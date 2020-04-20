package com.erpassignment.testcase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.erpassignment.test.DealsPage;
import com.erpassignment.test.EprTest;
import com.erpassignment.test.Homepage;
import com.erpassignment.utility.Xls_Reader;

public class DealsTestCases extends EprTest {
	Xls_Reader reader  = new Xls_Reader("E:\\selinium\\erpsystem\\AssignmentTestCases.xlsx");
	Homepage homepage;
	DealsPage dealsPage;
	String userid = null;
	String password = null;
	public DealsTestCases() throws Exception{
		super();
		
	}
	@BeforeMethod
	public void initial() throws Exception
	{
		initialization();
		String userid = properties.getProperty("username");
		String password = properties.getProperty("password");
		homepage=login(userid, password);
	}
	@Test
	public void DealPageWork() throws Exception
	{
		dealsPage = homepage.gotoEvent();
		dealsPage = dealsPage.deleteEvent();
		
		
	}
	@AfterMethod
	public void finish() throws Exception
	{
		ending();
		Thread.sleep(3000);
		driver.quit();
	}



}
