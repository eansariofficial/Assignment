package com.erpassignment.testcase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.erpassignment.test.CallPage;
import com.erpassignment.test.ContactPage;
import com.erpassignment.test.EprTest;
import com.erpassignment.test.Homepage;
import com.erpassignment.utility.Xls_Reader;

public class CAllTestCases extends EprTest{
	Xls_Reader reader  = new Xls_Reader("E:\\selinium\\erpsystem\\AssignmentTestCases.xlsx");
	ContactPage contactPage;
	Homepage homepage;
	CallPage callPage;
	String userid = null;
	String password = null;
	public CAllTestCases() throws Exception{
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
	public void callPageWork() throws Exception
	{
		callPage = homepage.gotoCAll();
		String des = reader.getCellData("Sheet4", "Description", 2);
		String dur = reader.getCellData("Sheet4","Duration", 2);
		String callTime = reader.getCellData("Sheet4", "CallTime", 2);
		callPage = callPage.addCAll(des,dur,callTime);
	}
	@AfterMethod
	public void finish() throws Exception
	{
		ending();
		Thread.sleep(3000);
		driver.close();
	}
}
