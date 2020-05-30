package com.hrms.testcases;


import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.*;

import com.hrms.utils.CommonMethods;
import com.hrms.utils.ConfigsReader;



public class LoginPageValidation extends CommonMethods {
//	@BeforeMethod
//	public void openBrowser() {
//		
//		setUp();
//		initialize();
//	}
//	@AfterMethod
//	public void closeBrowser() {
//		
//		tearDown();
//	}
		@Test
		public void validAdminLogin() {	
		//LoginPageElements login=new LoginPageElements();
//		sendText(login.username, ConfigsReader.getProperty("username"));
//		sendText(login.password, ConfigsReader.getProperty("password"));
//		click(login.loginBtn);
			login.login(ConfigsReader.getProperty("username"), ConfigsReader.getProperty("password"));
		
	}
		//@Test
		public void invalidPasswordLogin() {
			//LoginPageElements login=new LoginPageElements();
			sendText(login.username, ConfigsReader.getProperty("username"));
			click(login.loginBtn);
			
			String expected="Password cannot be empty";
			AssertJUnit.assertEquals(login.errorMsg.getText(), expected, "Error message text is not match");
		}
		
		//@Test
		public void emptyUsernameLogin() {
			//LoginPageElements login=new LoginPageElements();
			sendText(login.password, ConfigsReader.getProperty("password"));
			click(login.loginBtn);
			
			String expected="Username cannot be empty";
			AssertJUnit.assertEquals(login.errorMsg.getText(), expected, "Error message is not displayed");
		}
}
