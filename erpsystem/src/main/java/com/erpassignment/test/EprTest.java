package com.erpassignment.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import com.erpassignment.base.FeaturesSelenium;
import com.erpassignment.base.TestBase;

public class EprTest extends TestBase {
	String edtemail 							= "//input[@name='email']";
	String edtpassword 							= "//input[@name='password']";
	String btnlogin 							= "//div[text()='Login']";

	
	public EprTest() throws Exception{
		super();
		PageFactory.initElements(driver, this);
	}
	public Homepage login(String userid, String pass) throws Exception
	{
		FeaturesSelenium sel = new FeaturesSelenium(driver);
		String username = userid;
		String passw = pass;
		sel.xp(edtemail).type(userid);
		sel.xp(edtpassword).type(passw);
		sel.xp(btnlogin).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		return new Homepage();
	}
	
	

}
