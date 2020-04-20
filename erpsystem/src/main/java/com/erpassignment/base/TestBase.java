package com.erpassignment.base;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.erpassignment.utility.TestUtil;

public class TestBase {
	TestUtil testutil;
	public static Properties properties;
	public static WebDriver driver;
	String clkSetting = "/html/body/div[1]/div/div[2]/div[1]/div[3]/div[2]/div";
	String clkLogOut  =  "//span[text()='Log Out']";
	public TestBase() throws Exception
	{
		properties = new Properties();
		FileInputStream filelocation = new FileInputStream("E:\\selinium\\erpsystem\\src\\main\\java\\com\\erpassignment\\config\\config.properties");
		properties.load(filelocation);
	}
	public void initialization()
	{
		String browserName = properties.getProperty("browser");
		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",  "C:\\Users\\eht22\\Downloads\\java_selenium\\chromedriver.exe");
			driver = new ChromeDriver();
			
		}
		else {
			System.out.println("Not Allowed in another browser");
		}
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(testutil.IMPLICIT_WAIT,TimeUnit.SECONDS);
		driver.get("https://ui.cogmento.com/");
		
		
	}
	public void ending() throws Exception
	{
		FeaturesSelenium sel = new FeaturesSelenium(driver);
		sel.xp(clkSetting).click();
		sel.xp(clkLogOut).click();
		
	}

}
