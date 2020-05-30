package com.hrms.testcases;


import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.hrms.utils.CommonMethods;
import com.hrms.utils.ConfigsReader;



public class DashBoardPageValidationTest extends CommonMethods {
	//@Test
	public void loginSucessfullyValidation() {
		login.login(ConfigsReader.getProperty("username"), ConfigsReader.getProperty("password"));
		String expectedText="Welcome Admin";
		String actualText=dashboard.welcome.getText();
		AssertJUnit.assertEquals(actualText, expectedText, "Text is not match");
	}
	@Test
	public void dashBoardValidation() {
		login.login(ConfigsReader.getProperty("username"), ConfigsReader.getProperty("password"));
		dashboard.pimClick();
		dashboard.addEmployeeClick();
		
	}
	
	

}
