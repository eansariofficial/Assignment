package com.erpassignment.testcase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.erpassignment.test.CompanyPage;
import com.erpassignment.test.ContactPage;
import com.erpassignment.test.EprTest;
import com.erpassignment.test.Homepage;
import com.erpassignment.utility.Xls_Reader;

public class CompanyTestCases extends EprTest {
	Xls_Reader reader  = new Xls_Reader("E:\\selinium\\erpsystem\\AssignmentTestCases.xlsx");
	ContactPage contactPage;
	Homepage homepage;
	CompanyPage companyPage;
	String userid = null;
	String password = null;
	public CompanyTestCases() throws Exception{
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
	public void contactwork() throws Exception
	{
		String companyName = reader.getCellData("Sheet1","CompanyName",2);
		String streetAddress = reader.getCellData("Sheet1","Street",2);
		String city =reader.getCellData("Sheet1","City",2);
		String state = reader.getCellData("Sheet1","State",2);
		String zip = reader.getCellData("Sheet1","Zip",2);
		String country =reader.getCellData("Sheet1","Country", 2);
		companyPage = homepage.clickCompanies();
		companyPage = companyPage.addCompanyDetails(companyName, streetAddress, city, state, zip, country);
		String title = reader.getCellData("Sheet3","Title", 2);
		String des = reader.getCellData("Sheet4","Description", 2);
		companyPage = companyPage.addDeals(title,des);
		
		
	}
	@AfterMethod
	public void finish() throws Exception
	{
		ending();
		Thread.sleep(3000);
		driver.quit();
	}


}
