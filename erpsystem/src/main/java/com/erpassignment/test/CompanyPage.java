package com.erpassignment.test;

import org.openqa.selenium.support.PageFactory;

import com.erpassignment.base.FeaturesSelenium;
import com.erpassignment.utility.Xls_Reader;

public class CompanyPage extends EprTest {
	
	Xls_Reader reader 								= new Xls_Reader("C:\\Users\\eht22\\Documents\\Erp.xlsx");
	String clkCompany 								= "//span[text()='Companies']";
	String clkNewCompany							= "//a[@href='/companies/new']//button[@class='ui linkedin button']";
	String edtCompanyName						    = "(//label[text()='Name']//following::input[not(contains(@type,'hidden'))])[1]";
	String edtStretAddress 							= "//input[@placeholder='Street Address']";
	String edtCity 									= "//input[@placeholder='City']";
	String edtState 								= "//input[@placeholder='State / County']";
	String edtZip 									= "//input[@placeholder='Zip Code']";
	String edtCountry 								= "//div[@name='country']";
	String clkSaveCompanyDetails 					= "//button[text()='Save']";
	String edtDetailsAfterSaving 					= "//button[@class='ui icon button']//i[@class='money icon']";
	String edtAddTitle 								= "//input[@name='title']";
	String doPrivate 								= "//button[@class='ui small fluid positive toggle button']";
	String clkAssignedTo 							= "//div[@class='ui active visible fluid selection dropdown']";
	String clkEhtesham 								= "//div[@class='visible menu transition']//span[text()='Ehtesham Ansari']";
	String edtDiscription 							= "//textarea[@name='description']";
	

	public CompanyPage() throws Exception{
		PageFactory.initElements(driver, this);
	}
	
	public CompanyPage addCompanyDetails(String companyName2, String streetAddress2, String city2, String state2, String zip2, String country2) throws Exception
	{
		FeaturesSelenium sel = new FeaturesSelenium(driver);
		sel.xp(clkCompany).click();
		sel.xp(clkNewCompany).click();
		sel.xp(edtCompanyName).type(companyName2);
		sel.xp(edtStretAddress).type(streetAddress2);
		sel.xp(edtCity).type(city2);
		sel.xp(edtState).type(state2);
		sel.xp(edtZip).type(zip2);
		sel.xp(clkSaveCompanyDetails).click();
		
		return new CompanyPage();
		
	}
	
	public CompanyPage addDeals(String title, String des) throws Exception
	{
		FeaturesSelenium sel = new FeaturesSelenium(driver);
		sel.xp(edtDetailsAfterSaving).click();
		sel.xp(edtAddTitle).type(title);
		sel.xp(doPrivate).click();
		sel.xp(edtDiscription).type(des);
		sel.xp(clkSaveCompanyDetails).click();

		return new CompanyPage();
	}
	
}
