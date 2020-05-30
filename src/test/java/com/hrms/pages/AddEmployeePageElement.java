package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.utils.CommonMethods;



public class AddEmployeePageElement extends CommonMethods {
	@FindBy(id="firstName")
	public WebElement firstName;
	
	@FindBy(id="middleName")
	public WebElement middleName;
	
	@FindBy(id="lastName")
	public WebElement lastName;
	
	@FindBy (id="photofile")
	public WebElement uploadPhoto;
	
	@FindBy(id="chkLogin")
	public WebElement checkBox;
	
	@FindBy(id="user_name")
	public WebElement username;
	
	@FindBy(id="user_password")
	public WebElement password;
	
	@FindBy(id="re_password")
	public WebElement confpw;
	
	@FindBy(id="btnSave")
	public WebElement saveBtn;
	
	@FindBy(xpath="//span[@for='firstName']")
	public WebElement reqMess;
	
	
	
	public AddEmployeePageElement() {
		PageFactory.initElements(driver, this);
	}
	public void addemployee(String fName, String lName, String uName, String pw, String confirmPw) {
		sendText(firstName, fName);
		sendText(lastName, lName);
		click(checkBox);
		sendText(username, uName);
		sendText(password, pw);
		sendText(confpw, confirmPw);
		
		
	}
	
}
