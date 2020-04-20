package com.erpassignment.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import com.erpassignment.base.FeaturesSelenium;
import com.erpassignment.base.TestBase;
import com.erpassignment.utility.Xls_Reader;

public class ContactPage extends TestBase {
	Xls_Reader reader 							= new Xls_Reader("C:\\Users\\eht22\\Documents\\Erp.xlsx");
	String clkNewContact 						= "//button[text()='New']" ;
	String edtFirstName 						= "//input[@name='first_name']" ;
	String edtLastName 							= "//input[@name='last_name']";
	String clkSave 								= "//button[text()='Save']";
	String clkEdit 								= "//button[@class='ui icon button']//i[@class='edit icon']";
	String clkAddEventInContact 				= "//button//i[@class='calendar plus outline icon']";
	String edtTitle 							= "//input[@name='title']";
	String edtCategory 							= "//div[@name='category']//i[@class='dropdown icon']";
	String clkImportant 						= "//span[text()='Important']";
	String edtDiscription 						= "//textarea[@name='description']";
	String edtLocation 							= "//textarea[@name='location']";
	String clkAllDay 							= "//div[@class='ui toggle checkbox']";
	String edtDeal 								= "//div[@name ='deal']";
	String edtEmailAddress						= "//input[@placeholder='Email address']";
	
	public ContactPage() throws Exception {
		PageFactory.initElements(driver, this);
		
	}
	
	public ContactPage addContactDetails(String firstnamee, String lastnamee, String email) throws Exception
	{
		FeaturesSelenium sel = new FeaturesSelenium(driver);
		sel.xp(clkNewContact).click();
		sel.xp(edtFirstName).type(firstnamee);
		sel.xp(edtLastName).type(lastnamee);
		sel.xp(edtEmailAddress).type(email);
		sel.xp(clkSave).click();
		return new ContactPage();
	}
	public ContactPage addEventInContactAfterSave(String title, String tags, String description, String location, String deal, String task ) throws Exception
	{
		FeaturesSelenium sel = new FeaturesSelenium(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		sel.xp(clkAddEventInContact).click();
		sel.xp(edtTitle).type(title);
		sel.xp(edtCategory).click();
		sel.xp(clkImportant).click();
		sel.xp(edtDiscription).type(description);
		sel.xp(edtLocation).type(location);
		sel.xp(clkAllDay).click();
		sel.xp(clkSave).click();

		return new ContactPage();
		
	}
	

}
