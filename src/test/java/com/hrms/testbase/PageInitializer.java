package com.hrms.testbase;

import com.hrms.pages.AddEmployeePageElement;
import com.hrms.pages.DashBoardPageElement;
import com.hrms.pages.LoginPageElements;

public class PageInitializer extends BaseClass {
	public static LoginPageElements login;
	public static DashBoardPageElement dashboard;
	public static AddEmployeePageElement addEmp;

	
	public static void initialize() {
		login=new LoginPageElements();
		dashboard= new DashBoardPageElement();
		 addEmp=new AddEmployeePageElement();	
	}
	
}
