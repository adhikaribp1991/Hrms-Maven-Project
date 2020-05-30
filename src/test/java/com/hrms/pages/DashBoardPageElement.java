package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;
import com.hrms.utils.CommonMethods;

public class DashBoardPageElement extends CommonMethods {
	@FindBy(xpath="//a[@id='welcome']")
	public WebElement welcome;
	
	@FindBy(xpath="//b[text()='PIM']")
	public WebElement pim;
	
	@FindBy(id="menu_pim_addEmployee")
	public WebElement addEmp;
	

	public DashBoardPageElement() {
		PageFactory.initElements(BaseClass.driver, this);
	
}
	public void pimClick() {
		jsClick(pim);
		
	}
	public void addEmployeeClick() {
		jsClick(addEmp);
	}
	
	}