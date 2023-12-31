package com.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Basetest;

public class Loginfunctionality extends Basetest {

   @FindBy (xpath="//input[@id='txt-username']")   
   WebElement userid;
	
   @FindBy (name="password")
   WebElement pass;
  
   
   @FindBy (xpath="//button[@id='btn-login']")
   WebElement loginbutton;
   
   public Loginfunctionality() {          
	   
	   PageFactory.initElements(driver,this);
   }
   
   
   public void verifylogin() {
	   
	  userid.sendKeys(prop.getProperty("username")); 
	   pass.sendKeys(prop.getProperty("password"));
	   loginbutton.click();
   }
   
   public void invalidverifylogin() {
	   
		  userid.sendKeys(prop.getProperty("invalidusername")); 
		   pass.sendKeys(prop.getProperty("invalidpassword"));
		   loginbutton.click();
	   }
	
}
