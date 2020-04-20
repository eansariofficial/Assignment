package com.erpassignment.test;

import org.openqa.selenium.support.PageFactory;

import com.erpassignment.base.FeaturesSelenium;

public class DealsPage extends EprTest{

	String clkCheckBox 							= "//div[@class='ui fitted checkbox']//input[@type='checkbox']";
	String clkDeleteIcon 						= "//button[@class='ui basic button item']";
	

public DealsPage() throws Exception {
PageFactory.initElements(driver, this);
}

public DealsPage deleteEvent() throws Exception
	{
		FeaturesSelenium sel = new FeaturesSelenium(driver);
		sel.xp(clkCheckBox).click();
		sel.xp(clkDeleteIcon).click();
	
		return new DealsPage();
	}
}
