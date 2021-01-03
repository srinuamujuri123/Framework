package com.learnautomation.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.learnautomation.pages.BaseClass;
import com.learnautomation.pages.LoginPage;

/*

import com.learnautomation.utility.Helper;
*/
public class LoginTestCRM extends BaseClass {

	@Test(priority = 1)
	public void LoginApp() {

		logger = report.createTest("Login to CRM");

		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);

		logger.info("Starting Application");

		loginPage.LoginToCRM(excel.getStringData("Login", 0, 0), excel.getStringData("Login", 0, 1));

		logger.pass("Login successfully");

	}

	@Test(priority = 2)
	public void LoginApp1() {

		logger = report.createTest("Login to CRM for failing perposfully");

		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);

		logger.info("Starting Application");

		loginPage.LoginToCRM(excel.getStringData("Login", 0, 0), excel.getStringData("Login", 0, 1));

		logger.fail("Login Failed");
	}

}
