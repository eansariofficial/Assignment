package com.erpassignment.testcase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.erpassignment.test.CasesPage;
import com.erpassignment.test.ContactPage;
import com.erpassignment.test.EprTest;
import com.erpassignment.test.Homepage;
import com.erpassignment.utility.Xls_Reader;

public class CasePageTestCse extends EprTest {

	Xls_Reader reader  = new Xls_Reader("E:\\selinium\\erpsystem\\AssignmentTestCases.xlsx");
	ContactPage contactPage;
	Homepage homepage;
	CasesPage casesPage; 
	String userid = null;
	String password = null;
	public CasePageTestCse() throws Exception{
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
	public void addCases() throws Exception
	{
		String addTitle = reader.getCellData("Sheet4", "Title", 2);
		String addDescription = reader.getCellData("Sheet4", "Description", 2);
		casesPage = homepage.gotoCases();
		casesPage = casesPage.addDetailsInCasePAge(addTitle,addDescription);
	}

	@AfterMethod
	public void finish() throws Exception
	{
		ending();
		Thread.sleep(3000);
		driver.quit();
	}
}
