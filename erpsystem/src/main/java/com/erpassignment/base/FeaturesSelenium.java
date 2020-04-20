package com.erpassignment.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FeaturesSelenium {
	public WebDriver driver=null;
	public FeaturesSelenium(WebDriver driver)
	{
		
		this.driver=driver;
		
	}

	public Xp xp(String string) {	
		WebElement webElement = driver.findElement(By.xpath(string));
		Xp xp = new Xp(webElement, driver);
		return xp;
		
	}
	public WebDriver getDriver()
	{
		
		return driver;
	}


}
