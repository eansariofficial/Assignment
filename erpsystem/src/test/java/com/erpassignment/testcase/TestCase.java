package com.erpassignment.testcase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.erpassignment.test.EprTest;
import com.erpassignment.test.Homepage;

public class TestCase extends EprTest {

		Homepage homepage;
		
		public TestCase() throws Exception {
			super();
			
		}


		static String device = null;
		String userid = null;
		String password = null;
		@BeforeMethod
		public void initial() throws Exception
		{
			initialization();
			String userid = properties.getProperty("username");
			String password = properties.getProperty("password");
			homepage=login(userid, password);
		}
		
		@Test
		public void search() throws Exception
		{
			
			homepage = homepage.checkTitle();
//			homepage = homepage.checkUser();
//			homepage = homepage.checkTrial();
//			homepage = homepage.checkMode();
			
					
			
			
		}

			
		@AfterMethod
		public void finish() throws Exception
		{
			ending();
			Thread.sleep(3000);
			driver.quit();
		}

		
		
			


	}


