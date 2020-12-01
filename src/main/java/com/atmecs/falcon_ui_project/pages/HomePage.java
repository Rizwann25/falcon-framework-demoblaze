package com.atmecs.falcon_ui_project.pages;

import com.atmecs.falcon.automation.ui.selenium.Browser;
import com.atmecs.falcon.automation.util.enums.LocatorType;
import com.atmecs.falcon.automation.util.reporter.ReportLogService;
import com.atmecs.falcon.automation.util.reporter.ReportLogServiceImpl;
/*import com.atmecs.falcon.automation.util.reporter.ReportLogServiceImp1;*/
import com.atmecs.falcon_ui_project.constant.FilePathConstants;
import com.atmecs.falcon_ui_project.utils.PropReader;

public class HomePage extends BasePage {

	private ReportLogService report = new ReportLogServiceImpl(HomePage.class);
	PropReader homeProps = new PropReader(FilePathConstants.HOME_PROPS_FILEPATH);
	
	public HomePage(Browser browser) {
		super(browser);
	}
	public void clickLoginLink() {
		report.info("Click on login link");
		browser.getFindFromBrowser().findElementByXpath(homeProps.get("login_link")).click();
		
		
	}
	public void handleAdvancedButton() {
		report.info("Click on login Button");
		browser.getFindFromBrowser().findElementByXpath(homeProps.get("login_button")).click();
		
		
	}
			
}