package com.atmecs.falcon_ui_project.pages;

import com.atmecs.falcon.automation.ui.selenium.Browser;
import com.atmecs.falcon.automation.util.enums.LocatorType;
import com.atmecs.falcon.automation.util.reporter.ReportLogService;
import com.atmecs.falcon.automation.util.reporter.ReportLogServiceImpl;
import com.atmecs.falcon_ui_project.constant.FilePathConstants;
import com.atmecs.falcon_ui_project.utils.PropReader;

public class LoginPage extends BasePage {
	
	private ReportLogService report = new ReportLogServiceImpl(LoginPage.class);
	PropReader loginProps = new PropReader(FilePathConstants.LOGIN_PROPS_FILEPATH);
	
	public LoginPage(Browser browser) {
		super(browser);
	}

	 public void login(String username, String password) {
		 report.info("Enter username");
		 browser.getWait().waitForElementPresence(LocatorType.XPATH, loginProps.get("username_input"), 3000);
		 browser.getTextField().enterTextField(LocatorType.XPATH, loginProps.get("username_input"), username);
		 report.info("Enter password");
		 browser.getTextField().enterTextField(LocatorType.XPATH, loginProps.get("password_input"), password);
		 report.info("Click login Button");
		 browser.getFindFromBrowser().findElementByXpath(loginProps.get("login_button")).click(); 
		 
		/*
		 * report.info("Getting Alert Message"); String alertText =
		 * browser.getAlert().getAlertText(2000); report.info("Alert Message = " +
		 * alertText);
		 */
		
	 }
}
