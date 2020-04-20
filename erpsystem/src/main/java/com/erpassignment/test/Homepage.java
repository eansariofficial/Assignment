package com.erpassignment.test;

import org.openqa.selenium.support.PageFactory;

import com.erpassignment.base.FeaturesSelenium;
import com.erpassignment.base.TestBase;

public class Homepage extends TestBase {
	
	String clkContact = "//span[text()='Contacts']";
	String clkDeals = "//a[@href='/deals']";
	String clkTasks = "//span[text()='Tasks']";
	String clkCases = "//a[@href='/cases']";
	String clkCall = "//span[text()='Calls']";
	

	public Homepage() throws Exception {
		PageFactory.initElements(driver, this);
	}
	
	public Homepage checkTitle() throws Exception {
		String title = driver.getTitle();
		if(title.equals("Cogmento CRM"))
			System.out.println("--SITE VISITED--"+title);
		return new Homepage();
		
	}

	public ContactPage clickContact() throws Exception
	{
		FeaturesSelenium sel = new FeaturesSelenium(driver);
		sel.xp(clkContact).click();

		return new ContactPage();
		
	}
	public CompanyPage clickCompanies() throws Exception
	{
		FeaturesSelenium sel = new FeaturesSelenium(driver);
		sel.xp(clkContact).click();

		return new CompanyPage();
		
	}

	public DealsPage gotoEvent() throws Exception {
		FeaturesSelenium sel = new FeaturesSelenium(driver);
		sel.xp(clkDeals).click();

		return new DealsPage();
	}

	public TaskPage gotoTaskPage() throws Exception {
		FeaturesSelenium sel = new FeaturesSelenium(driver);
		sel.xp(clkTasks).click();

		return new TaskPage();
	}

	public CasesPage gotoCases() throws Exception {
		FeaturesSelenium sel = new FeaturesSelenium(driver);
		sel.xp(clkCases).click();

		return new CasesPage();
	}

	public CallPage gotoCAll() throws Exception {
		FeaturesSelenium sel = new FeaturesSelenium(driver);
		sel.xp(clkCall).click();

		return new CallPage();
	}
	

	

}
