package com.hrms.testcases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.hrms.utils.CommonMethods;
import com.hrms.utils.ConfigsReader;

public class AddEmployeeValidationTest extends CommonMethods {
	@Test
	public void addEmployeeValidation() {
		login.login(ConfigsReader.getProperty("username"), ConfigsReader.getProperty("password"));
		dashboard.pimClick();
		dashboard.addEmployeeClick();
		sendText(addEmp.firstName, ConfigsReader.getProperty("firstName"));
		sendText(addEmp.middleName, ConfigsReader.getProperty("middleName"));
		sendText(addEmp.lastName, ConfigsReader.getProperty("lastName"));
		sendText(addEmp.uploadPhoto, "/Users/bishnuprasadadhikari/downloads/photo.jpg");
		click(addEmp.saveBtn);
		//String expectedText="Required";
		//String actualText=addEmp.reqMess.getText();
		//System.out.println(actualText);
		//Assert.assertEquals(actualText, expectedText, "Test is not match");
	}

}
