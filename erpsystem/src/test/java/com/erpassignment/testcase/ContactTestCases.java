package com.erpassignment.testcase;

import java.io.FileInputStream;
import java.util.Properties;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.erpassignment.test.ContactPage;
import com.erpassignment.test.EprTest;
import com.erpassignment.test.Homepage;
import com.erpassignment.utility.Xls_Reader;

public class ContactTestCases extends EprTest {
	Xls_Reader reader = new Xls_Reader("E:\\selinium\\erpsystem\\AssignmentTestCases.xlsx");
	ContactPage contactPage;
	Homepage homepage;
	String userid = null;
	String password = null;
	public ContactTestCases() throws Exception{
		super();
		properties = new Properties();
		FileInputStream filelocation = new FileInputStream("E:\\selinium\\erpsystem\\src\\main\\java\\com\\erpassignment\\config\\config.properties");
		properties.load(filelocation);
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
		
		
		contactPage = homepage.clickContact();	
		String firstname = reader.getCellData("Sheet1","FirstName", 2);
		String lastname = reader.getCellData("Sheet1","LastName", 2);
		String email = reader.getCellData("Sheet1", "EmailAddress", 2);
		contactPage = contactPage.addContactDetails(firstname,lastname,email);
		String title = reader.getCellData("Sheet2", "Title", 2);
		String tags = reader.getCellData("Sheet2", "Tags", 2);
		String description = reader.getCellData("Sheet2", "Description", 2);
		String location = reader.getCellData("Sheet2", "Location", 2);
		String deal = reader.getCellData("Sheet2", "Deal", 2);
		String task = reader.getCellData("Sheet2", "Task", 2);
		//contactPage = contactPage.addEventInContactAfterSave(title,tags,description,location,deal,task);
	}
	@AfterMethod
	public void finish() throws Exception
	{
		ending();
		Thread.sleep(3000);
		driver.quit();
	}
}
