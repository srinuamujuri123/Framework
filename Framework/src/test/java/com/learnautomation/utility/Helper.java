package com.learnautomation.utility;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Helper {
	//screenshots, alerts, frames, windows,sync issues, javascript executor
	//we made capturescreenshot class as static because when ever it is required to call we can call
	
	public static String captureScreenshot(WebDriver driver) {
		
		File src=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String screenshotpath= System.getProperty("user.dir")+"/Screenshots/FreeCRM_"+getCurrentDateTime()+".png";
		try {
			FileHandler.copy(src, new File(screenshotpath));
		} catch (Exception e) {
			
			System.out.println("Unable to Handle screenshot>>"+e.getMessage());
		}
		return screenshotpath;
	}
	
	
	public static String getCurrentDateTime() {
		
		SimpleDateFormat customFormat= new SimpleDateFormat("dd_MM_yyyy_HH_mm_ss");
		Date currentdate= new Date();
		return customFormat.format(currentdate);
		
	}

}
