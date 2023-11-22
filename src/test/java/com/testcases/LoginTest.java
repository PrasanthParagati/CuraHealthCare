package com.testcases;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.Basetest;
import com.pageobjects.Loginfunctionality;
import com.utils.Utils;

public class LoginTest extends Basetest {
	
	Loginfunctionality lf;
	
	
	public LoginTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		initialization();
		
	    lf = new Loginfunctionality();
	    
	}
	
	@Test (priority = 1)
	public void loginvalidation() {
		lf.verifylogin();
		
		String urltest = driver.getCurrentUrl();
		Assert.assertEquals(urltest, "https://katalon-demo-cura.herokuapp.com/#appointment");
	}
	
	@Test (priority = 2)
	public void invalidloginvalidation() {
		lf.invalidverifylogin();
		
		String urltest = driver.getCurrentUrl();
		Assert.assertEquals(urltest, "https://katalon-demo-cura.herokuapp.com/#appointment");
		
	}
	
	@AfterMethod
	public void teardown(ITestResult result) {
		
		if(result.getStatus() == ITestResult.FAILURE) {
			
//			String methodname = result.getMethod().getMethodName();
			String filename = result.getMethod().getMethodName() + "-"  + ".png";
			Utils.takescreenshot(filename);
		}
		
		
	}
	
}
