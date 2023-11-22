package com.utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.base.Basetest;

public class Utils extends Basetest {
	
	public static void takescreenshot(String filename) {		
		
	    try {
	    	File destination = new File(filename);
	    	
	    	 FileUtils.copyFile(((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE), destination);
	    	
//			FileUtils.copyFile(screenshotFile, new File("./target/getMethodName().png"));
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}

}
}
