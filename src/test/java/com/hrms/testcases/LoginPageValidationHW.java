package com.hrms.testcases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;


import com.hrms.utils.CommonMethods;
import com.hrms.utils.ConfigsReader;

public class LoginPageValidationHW extends CommonMethods {
	@Test
	public void titleValidation() {
		String expectedTitle = "Human Management System";
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		AssertJUnit.assertEquals(actualTitle, expectedTitle, "Title is not found");
	}

	@Test
	public void logoValidation() throws Exception {
		boolean isLogoDisplayed = login.logo.isDisplayed();
		Assert.assertEquals(isLogoDisplayed, true, "Logo is not displayed");

	}

	@Test
	public void loginValidation() {
		sendText(login.username, ConfigsReader.getProperty("username"));
		sendText(login.password, ConfigsReader.getProperty("password"));
		click(login.loginBtn);
	}

	@Test
	public void emptyUserNameValidation() {
		sendText(login.password, ConfigsReader.getProperty("password"));
		click(login.loginBtn);
		String expectedText = "Username cannot be empty";
		String actualText = login.errorMsg.getText();
		AssertJUnit.assertEquals(actualText, expectedText, "Text is not match");

	}

	@Test
	public void emptyPasswordValidation() {
		sendText(login.username, ConfigsReader.getProperty("username"));
		click(login.loginBtn);
		String expectedText = "Password cannot be empty";
		String actualText = login.errorMsg.getText();
		AssertJUnit.assertEquals(actualText, expectedText, "Text is not match");
	}

	@Test
	public void invalidPasswordValidation() {
		login.login(ConfigsReader.getProperty("username"), "Humanhrm123");
		String expectedText = "Invalid credentials";
		String actualText = login.errorMsg.getText();
		AssertJUnit.assertEquals(actualText, expectedText, "Text is not matched");
	}
}
