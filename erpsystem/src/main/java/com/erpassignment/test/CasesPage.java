package com.erpassignment.test;

import org.openqa.selenium.support.PageFactory;

import com.erpassignment.base.FeaturesSelenium;

public class CasesPage extends EprTest{
	String clkNew 								= "//button[text()='New']";
	String edtTitle 							= "//input[@name='title']";
	String clkPrivate 							= "//button[@class='ui small fluid positive toggle button']";
	String clkType 								= "//div[@name='type']";
	String clkTechnicalSupport 					= "//span[text()='Technical Support']";
	String clkCalender 							= "//input[@class='calendarField']";
	String clkEleven 							= "//div[text()='11']";
	String edtDiscription 						= "//textarea[@name='description']";
	String btnPriority 							= "//div[@name='priority']";
	String lnkHigh 								= "//span[text()='High']";
	String clkSave 								= "//button[text()='Save']";

	
	public CasesPage() throws Exception{
		PageFactory.initElements(driver, this);
	}
	public CasesPage addDetailsInCasePAge(String addTitle2, String addDescription2) throws Exception
	{
		FeaturesSelenium sel = new FeaturesSelenium(driver);
		sel.xp(clkNew).click();
		sel.xp(edtTitle).type(addTitle2);
		sel.xp(clkPrivate).click();
		sel.xp(clkType).click();
		sel.xp(clkTechnicalSupport).click();
		sel.xp(clkCalender).click();
		sel.xp(clkEleven).click();
		sel.xp(edtDiscription).type(addDescription2);
		sel.xp(btnPriority).click();
		sel.xp(lnkHigh).click();
		sel.xp(clkSave).click();

		return new CasesPage();
	}

}
