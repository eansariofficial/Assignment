package com.erpassignment.base;

import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.tools.ant.util.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Xp {
	FeaturesSelenium featureSelenium;
	WebElement webElement=null;
	WebDriver driver=null;
	
	public Xp(WebElement webElement,WebDriver driver)
	{
		this.webElement = webElement;
		this.driver=driver;
		
	}
	public void click() throws Exception
	{
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		highlighter(webElement);
		webElement.click();
		ScreenShot();
		Thread.sleep(1500);
	}
	public void highlighter(WebElement element)
	{
		
		JavascriptExecutor js=(JavascriptExecutor)driver; 
		 
		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);
	}
	public void ScreenShot() throws Exception
	{
	
		Random rand = new Random(); 
		  
        // Generate random integers in range 0 to 999 
        int rand_int1 = rand.nextInt(1000); 
       
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File screenShotName = new File ("E:\\selinium\\erpsystem\\ScreenShot\\"+driver.getTitle()+rand_int1+".png");
		
		org.codehaus.plexus.util.FileUtils.copyFile(srcFile, screenShotName);
	}
	public void type(String str) throws Exception
	{
		Thread.sleep(1500);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		highlighter(webElement);
		webElement.sendKeys(str);
		ScreenShot();
		Thread.sleep(1500);
	}
	public WebDriver getDriver()
	{
		driver=featureSelenium.getDriver();
		return driver;
	}

}
