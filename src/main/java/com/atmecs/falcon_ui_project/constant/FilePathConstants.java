package com.atmecs.falcon_ui_project.constant;

import java.io.File;

public class FilePathConstants {
	public final static String USER_HOME = System.getProperty("user.dir") + File.separator;

	public final static String RESOURCES_HOME = USER_HOME + "src" + File.separator + "main" + File.separator
			+ "resources" + File.separator;

	public final static String LOCATOR_HOME = RESOURCES_HOME + "locators" + File.separator;
	public final static String ATMECS_HOME = LOCATOR_HOME + "atmecs" + File.separator;

	public final static String LIB_HOME = USER_HOME + "lib" + File.separator;

	public final static String HOME_LOCATOR_PATH = ATMECS_HOME
			+ "HomeAtmecsIncDigitalSolutionsProductEngineeringServices.properties";
	
	//locators properties file paths
	public final static String LOGIN_PROPS_FILEPATH = LOCATOR_HOME + File.separator + "loginpage.properties";
	public final static String HOME_PROPS_FILEPATH = LOCATOR_HOME + File.separator + "homepage.properties";

	 //testdata files
	public final static String TESTDATA_HOME = RESOURCES_HOME + "testdata" + File.separator;
	
	public final static String LOGIN_DATA_XLS_FILEPATH = TESTDATA_HOME + "login.xlsx";
	
}
