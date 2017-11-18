package com.pages;

import org.openqa.selenium.WebDriver;

import com.objrepo.CreateAccountProperty;
import com.util.WebDriverCode;

public class CreateAccountPage extends WebDriverCode implements CreateAccountProperty{

	WebDriver driver;

	public CreateAccountPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}

	public void clickTitle(){
		click(titleLocator);
	}

	public void enter_PI_FirstName(String testData) {
		enterText(PI_firstNameLocator, testData);
	}
	public void enter_PI_LastName(String testData) {
		enterText(PI_LastNameLocator, testData);
	}
	public void enter_PI_Password(String testData) {
		enterText(PI_PasswordLocator, testData);
	}
	
	public void selectDays(String label) {
		selectValue(daysLocator, label);
	}
	
	public String getFirstNameValue() {
		return getAttribute(PI_firstNameLocator,"value");
	}
	public String getLastNameValue() {
		return getAttribute(PI_LastNameLocator,"value");
	}
	public void test() {
		
	}



}
