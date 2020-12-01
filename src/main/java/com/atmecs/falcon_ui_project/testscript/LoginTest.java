package com.atmecs.falcon_ui_project.testscript;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.atmecs.falcon.automation.ui.selenium.Verify;
import com.atmecs.falcon.automation.ui.seleniuminterfaces.IKeys.KeyType;
import com.atmecs.falcon.automation.util.enums.LocatorType;
import com.atmecs.falcon.automation.util.parser.PropertyParser;
import com.atmecs.falcon.automation.util.reporter.ReportLogService;
import com.atmecs.falcon_ui_project.pages.HomePage;
import com.atmecs.falcon_ui_project.pages.LoginPage;
import com.atmecs.falcon_ui_project.testdata.LoginDataProvider;
import com.atmecs.falcon_ui_project.testsuite.SampleTestSuiteBase;

public class LoginTest extends SampleTestSuiteBase {
	
	//private ReportLogService report = new ReportLogServiceImp1(SampleTestScript.class);
	String appUrl = PropertyParser.readEnvOrConfigProperty("appUrl");
	
	@BeforeMethod
	@Parameters({"os", "osVersion", "browser", "browserVersion"})
	public void initBrowser(String os, String osVersion, String br, String browserVersion) {
		this.os = os;
		this.osVersion = osVersion;
		this.br = br;
		this.browserVersion = browserVersion;
	}
	
	@Test (dataProvider = "logindata", dataProviderClass = LoginDataProvider.class)
	public void testLogin (String username, String password) {
		
		System.out.println("username:" +username + ",  password: " +password);
		
		HomePage homePage = new HomePage(browser);
		LoginPage loginPage = new LoginPage(browser);
		
		homePage.navigateToUrl(appUrl, os, osVersion, br, browserVersion);
		homePage.clickLoginLink();
		//homePage.handleAdvancedButton();
		loginPage.login(username, password);
		
		
		
		//sample
		
		 
		 
		
		
	}

}
