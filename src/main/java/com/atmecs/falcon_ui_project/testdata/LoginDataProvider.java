package com.atmecs.falcon_ui_project.testdata;

import java.io.IOException;

import org.testng.annotations.DataProvider;

import com.atmecs.falcon.automation.util.parser.XlsReader;
import com.atmecs.falcon_ui_project.constant.FilePathConstants;

public class LoginDataProvider {
	
	@DataProvider (name="logindata")
	public static Object[][] getXlsData () {
		XlsReader xlsReader = new XlsReader();
		try {
			xlsReader.setPath(FilePathConstants.LOGIN_DATA_XLS_FILEPATH);
		} catch (IOException e) {
			e.printStackTrace();
		}
		String sheetName = "login";
		int rowCount = xlsReader.getRowCount(sheetName);
		int colCount = xlsReader.getColumnCount(sheetName);
		
		System.out.println("rowCount =" + rowCount);
		System.out.println("colCount =" + colCount);
		
		Object[][] data = new Object[rowCount][colCount];
		
		for (int rowIndex = 1; rowIndex < rowCount + 1; rowIndex++) {
			for (int columnIndex = 0; columnIndex < colCount; columnIndex++) {
			String value = xlsReader.getCellDataByColumnIndex(sheetName, columnIndex, rowIndex);
			data[rowIndex - 1][columnIndex] = value;
			}

			}
		return data;
	}
	}

