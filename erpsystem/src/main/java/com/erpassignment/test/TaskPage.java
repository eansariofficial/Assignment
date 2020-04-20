package com.erpassignment.test;

import org.openqa.selenium.support.PageFactory;

import com.erpassignment.base.FeaturesSelenium;

public class TaskPage extends EprTest {

	String clkExportButton = "//button[text()='Export']";
	String clkOk = "//button[text()='OK']";
	

	
	public TaskPage() throws Exception {
		super();
		PageFactory.initElements(driver,this);
	}
	
	public void exportTask() throws Exception
	{
		FeaturesSelenium sel = new FeaturesSelenium(driver);
		sel.xp(clkExportButton).click();
		sel.xp(clkOk).click();

	}
	

}
